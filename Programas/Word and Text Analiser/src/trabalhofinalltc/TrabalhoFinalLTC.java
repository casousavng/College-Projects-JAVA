
package trabalhofinalltc;

import java.io.*;
import javax.swing.*;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * Classe principal para o trabalho final de LTC.
 * Conta palavras e caracteres de um arquivo de texto.
 * Exporta os resultados em um arquivo CSV.
 * @author andresousa e fábiopinto
 */

public class TrabalhoFinalLTC {
    
    // StringBuild criado para usar no output do interface grafico
    static StringBuilder textoGUI = new StringBuilder();
    //Cria uma instância de classe para executar operações
    static FicheiroTexto ficheiroTexto = new FicheiroTexto();
    static StopWords stop = new StopWords();
    static int totalPalavrasDiferentes;
    static int totalPalavrasSemSW = 0;
    static int totalStopWords = 0;
    
    // Imprime de forma ordenada os Nodes e realiza a exportação atravez da classe FicheiroTexto em formato CSV, faz ainda o append do node para usar no output grafico
    public static void visitaOrdem(Node node){

        if( node != null ){
            visitaOrdem(node.getEsquerda()); // Visita o lado esquerdo da árvore

            System.out.print(node); // Imprime o Node no Output
            textoGUI.append(node);  // Append o texto (toString) do Node para usar depois usar o textoGUI (string com as frases para mostrar no GUI)
            
            // Grava dados CSV de frequência de palavras
            ficheiroTexto.gravarDadosCSVfrequenciaPalavras(node.getPalavra().getPalavra(),node.getPalavra().getOcorrencias(),node.getPalavra().getLinhas().linhasToPrint());
            
            visitaOrdem(node.getDireita()); // Visita o lado direito da árvore 
        }
    }

    // Insere Nodes na arvore binaria de forma ordenada (não balanceada)
    public static Node inserirNode(Node raiz, Node novo, int linha){
        // Se a árvore estiver vazia, insira o novo nó como raiz
        if( raiz == null ){
            raiz = novo;
            raiz.getPalavra().setLinhas(linha);
            // contagem do numero total de palavras diferentes no texto
            totalPalavrasDiferentes++;
        }
        else{
            // compara se a palavra ja existe na arvore para nao haver adiçoes duplas
            int comparacao = novo.getPalavra().getPalavra().compareTo(raiz.getPalavra().getPalavra()); 
            
            if( comparacao == 0 ) {
                // Se a Palavra já existe na árvore, atualiza as ocorrências e linhas
                raiz.getPalavra().setOcorrencias(raiz.getPalavra().getOcorrencias() + 1);
                raiz.getPalavra().setLinhas(linha);
            }
            else if( comparacao > 0){ 
                // Se a nova palavra for maior lexicograficamente, insere à direita do node
                raiz.setDireita( inserirNode( raiz.getDireita(), novo , linha));
            }
            else{ 
                // Se a nova palavra for menor lexicograficamente, insere à esquerda do node
                raiz.setEsquerda( inserirNode( raiz.getEsquerda(), novo , linha));   
            }
             // contagem do numero total de palavras no texto e respetivo Set das mesmas na classe
            raiz.getPalavra().setTotalPalavras(raiz.getPalavra().getTotalPalavras()+1);
            
        } return raiz; // Retorna a raiz atualizada
    }
    
    // Criado para remover a pontuação e os espaços de modo a fazer a contagem apenas dos caracteres em cada palavra. O output é uma String para ser usado em passos seguintes
    public static String conversorTextoCaracteres(String texto) {
        
        texto = texto.toLowerCase(); // Converte todo o texto (inicial) para minúsculas
        texto = texto.replaceAll("[^a-z]", ""); // remove todos os caracteres que nao sejam alfabeticos ficando apenas as letras (usando a restrição do tipo regex no replaceAll)
        
    return texto; // Retorna o texto formatado com as devidas remoções (todo o texto corrido sem espaçametos entre palavras para uso apenas dos caracteres)
}

    // Remove a pontuação completa do texto e guarda apenas as palavras separadas num array do tipo String para posterior contagem e alocação das palavras na arvore binaria
    public static String[] conversorTextoPalavras(String texto){
        
        texto = texto.toLowerCase(); // Converte todo o texto (inicial) para minúsculas
        texto = texto.replaceAll("[^a-z\\s-]+", ""); // remove todos os caracteres que nao sejam alfabeticos ficando apenas as palavras e o respetivo espaço entre elas (mantendo palavras com hifen juntas)
        //texto = texto.replaceAll("[^a-z\\s]", ""); // USAR SE FOR PARA SEPARAR PALAVRAS COM HIFEN tipo (open-source) 1 palavra passa a (open source) 2 palavras
        String []txt; 
        txt = texto.split("[\\s]"); // Divide o texto em palavras usando regex para cortar a string pelos espaços entre palavras
        return txt; // devolve o array com as palavras separadas
    }
    
    // metodo que permite criar um JSpinner limitado para poder escolher o numero de caracteres a analisar restringindo entre 1 e 26 (os 26 caracteres do alfabeto)
    private static int obterQuantidadeCaracteres() {
            
        JSpinner escolhaNcaracteres = new JSpinner(new SpinnerNumberModel(1, 1, 26, 1));
        JOptionPane.showOptionDialog(null, escolhaNcaracteres, "Number of caracters to analise? [1-26]",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, null, null);
        // retorna o valor escolhido para a apresentação dos N caracteres a analisar
        return (int) escolhaNcaracteres.getValue();
    }
    
    // metodo criado para receber o numero total de palavras e o tempo de leitura por minuto por palavra (medio conforme estudos) 
    // e atribuir o tempo medio em minutos ou segundos de leitura do texto carregado
    public static String calcularTempoLeitura(int totalPalavras, int palavrasPorMinuto) {
        double mediaLeitura = (((double) totalPalavras / palavrasPorMinuto) * 60); 
        long minutos = (long) mediaLeitura / 60; //output dos minutos
        long segundosRestantes = Math.round(mediaLeitura % 60); //output dos segundos
        
        if (minutos < 1)
            return String.format("%02d sec.", segundosRestantes); //retorna o tempo em segundos quando é inferior a 1 minuto
        else
            return String.format("%02d:%02d min.", minutos, segundosRestantes); //retorna o tempo em minutos quando é superior a 1 minuto
    }
    
    // Método principal do programa onde são usados os passos anteriores e calculadas algumas estatisticas do texto
    public static void main(String[] args) throws IOException {
        
        JFileChooser escolheFicheiro = new JFileChooser(); // para a abertura do ficheiro e restrições
        Caracteres qtdCar = new Caracteres(); //Cria uma instância de classe para executar operações
        Node raiz = null; // inicializar a Raiz da árvore de palavras com inicio nulo
        
        StringBuilder contar = new StringBuilder(); //Cria uma instância de classe do tipo Stringbuilder para executar operações
        StringBuilder contar2 = new StringBuilder(); //Cria uma instância de classe do tipo Stringbuilder para executar operações
        
        int contaLinha = 0, totalCaracteres = 0, qtdCaracteresAnalisar, uppercase = 0, lowercase = 0, especiais = 0, numericos = 0, espacos = 0; // Contadores de palavras, linhas, caracteres, etc
        String contaLetras = ""; // String para armazenar todas as letras processadas
        String texto1, texto2; // Strings para armazenar linhas do arquivo
        String textoAux1[], textoAux2[]; // Arrays para processar texto
        
        // Exibe uma mensagem inicial
        String msgInicial = """
        WELCOME TO THE WORD AND CHARACTER ANALISER
        ---                 
        This tool helps you analyze a text file and summarize the detailed content to get some statistic at no charge. 
        The statistics provided by our software gives an overview of the text quality, the frequency of the words from 
        the text in a passage along with a line indication were they show up. In addition, our words and characters 
        counting ability, doesn’t only limit itself to calculate the number of letters or words you have just uploaded, but 
        also analyzes the lines, numerals, punctuation count (either digits or specific signs), spaces and event gives you 
        an overview of an avarege of word and characters per sentence.
        Also we implemented a feature that analises the words and compares them to a Stopwords list in English language.
        ---                    
        Clicking in OK will prompt you to choose a .txt file to analise.
        """;
        
        //Exibe a mensagem inicial e (apos OK) solicita o arquivo a ser aberto
        //JOptionPane msgTotaisJpane2 = new JOptionPane();
        JOptionPane.showMessageDialog(null, msgInicial,"WORD AND CHARACTER ANALISER v1.0",JOptionPane.PLAIN_MESSAGE);

        // Define o filtro da janela de abertura de ficheiros para exibir apenas arquivos .txt
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Text Files (.txt)", "txt"); 
        escolheFicheiro.setFileFilter(filtro); // restringe a opção de escolha de ficheiros a text (.txt)
        escolheFicheiro.setAcceptAllFileFilterUsed(false); // Rejeita todos os outros tipos de ficheiros 

        // Abre a janela de seleção de arquivo
        int caminhoFicheiro = escolheFicheiro.showOpenDialog(null);
        String ficheiro = null;
        
        // condiçao que define se foi aberto um ficheiro ou nao
        if (caminhoFicheiro == JFileChooser.APPROVE_OPTION) {
            // Obtém o caminho do arquivo selecionado e o respetivo nome do arquivo que sera guardado na string ficheiro para uso posterior
            ficheiro = escolheFicheiro.getSelectedFile().getAbsolutePath();
        } else {
            // em caso de nao selecionar nenhum arquivo, avisa o utilizador e sai do programa
            JOptionPane.showMessageDialog(null, "WARNING - You haven't choose any file. This program will turn off.", "WORD AND CHARACTER ANALISER v1.0", 0);
            System.exit(0);
        }
        
        ficheiroTexto.abreLeitura(ficheiro);

        do{
            // Lê uma linha do arquivo
            texto1 = ficheiroTexto.leLinha();
            texto2 = texto1; // copia o texto1 para o texto2
            contaLinha++; // Incrementa o contador de linhas

            // Verifica se a linha não é nula e faz a formatação da string de modo a ser usada nos diversos calculos de valores para resultados posteriores
            if( texto1 != null ){
                
                // adiciona ás stringbuilds (contar e contar2) o texto lido por linhas (no primeiro caso transporta o texto corrido e no segundo com paragrafo para ser usado posteriormente)
                contar.append(texto1); // criado para obter mais estisticas do texto (é o texto corrido sem linhas)
                contar2.append(texto1).append("\n"); // criado para ser usado no output grafico
                
                // Converte o texto, remove pontuações e divide em caracteres e palavras
                texto1 = conversorTextoCaracteres(texto1);

                textoAux1 = texto1.split("");
                textoAux2 = conversorTextoPalavras(texto2);
                
                // Conta o número total de caracteres incrementando a passagem do ciclo for pelo textoAux1 que é o texto limpo de caracteres especiais e espaços
                for (int i = 0; i < textoAux1.length; i++)
                    totalCaracteres++;

                
                // Conta o número de palavras total e insere na árvore
                for (int j = 0; j < textoAux2.length; j++){
                    Node novo = new Node(textoAux2[j],1,1, null, null);
                    raiz = inserirNode(raiz, novo, contaLinha);
                    
                    // usado para contabilizar as palavras que vao entrar na Frequency rate das palavras e se sao ou naoStopWords
                    if(stop.verificarPalavra(textoAux2[j]) == 0)
                        totalPalavrasSemSW++;
                    else
                        totalStopWords++;
                }                
                // Acumula as letras para análises futuras
                contaLetras += texto1;  
            }
            
        }while(texto1 != null);
        
        // criado para contar o numero de frases de um texto. Usando o "contar" (com texto corrido) consigo separar as frases e contar procurando por sinais de pontuação seguidos de espaços.
        String[] frases = contar.toString().trim().split("[.!?]\\s");

        // ciclo que faz a contagem dos caracteres desde uppercase, lowercase, pontuação, numericos e espaços
        for(int i = 0; i < contar.length(); i++){
            char ch = contar.charAt(i);
            if(ch >= 'A' && ch <= 'Z'){
                uppercase++;
            }
            else if(ch >= 'a' && ch <= 'z'){
                lowercase++;
            }
            else if (".,?!-@&][}{£+/-_*:;='#$|%€)(\"".indexOf(ch) != -1){
                especiais++;
                }
            else if(ch >= '0' && ch <= '9'){
                numericos++;
            }
            else if(ch == ' '){
                espacos++;
            }
        }
        
        // usado para o output da media da palavras e caracateres de forma a ter duas casas decimais de precisao
        double mediaPalavras = (double) raiz.getPalavra().getTotalPalavras() / (frases.length+1);
        double mediaCaracteres = (double) totalCaracteres / (frases.length+1);
        
        //Jtextarea onde ira aparecer o texto que foi carregado anteriormente para analise
        JTextArea areaTexto = new JTextArea(15, 70);
        areaTexto.setText(contar2.toString());
        areaTexto.setEditable(false);// nao permite a edição deste campo de texto
        JScrollPane painelScroll = new JScrollPane(areaTexto);
        JOptionPane.showMessageDialog(null, painelScroll, "Here's the text you have choosen to analise.",JOptionPane.PLAIN_MESSAGE );
        
        // msg inicial no output
        System.out.println("WORD AND CHARACTER ANALISER");
        // Inicia a contagem de palavras e caracteres
        System.out.println(" -- Word counting List --");
        
        // Cria o cabeçalo do ficheiro CSV (Frequencia de Palavras) - vai indicar a frequencia de zero
        ficheiroTexto.gravarDadosCSVfrequenciaPalavras("", 0, "");
        
        // Visita a arvore e faz a impressao da árvore de palavras
        visitaOrdem(raiz);

        //Jtextarea onde ira aparecer o texto referente as palavras e as sua frequencia
        JTextArea areaTextoGUI = new JTextArea(15, 70);
        areaTextoGUI.setText(textoGUI.toString()); // criada anteriormente quando foi pedido a visitar a arvore foi criando um append do toString da arvore 
        areaTextoGUI.setEditable(false); // nao permite a edição deste campo de texto
        JScrollPane scrollPanel = new JScrollPane(areaTextoGUI);
        JOptionPane.showMessageDialog(null, scrollPanel, "Here's the list of the words that show up the most in your text",JOptionPane.PLAIN_MESSAGE );

        // Exibe informações totais sobre o texto inserido
        System.out.println(" \n----  TOTALS ---" +
        "\nThe file contains " + (contaLinha - 1) + " lines!" +
        "\nThe file contains " + (frases.length + 1) + " sentences!" +
        "\nThe file contains " + raiz.getPalavra().getTotalPalavras() + " words!" +
        "\nThe file contains " + totalPalavrasDiferentes + " different words!" +
        "\nThe file contains " + (totalCaracteres + especiais + numericos + espacos) + " characters!" +
        "\nSplited in: " +
        "\n# " + totalCaracteres + " alpha characters (without Specials)!" +
        "\n# " + uppercase + " uppercase characters!" +
        "\n# " + lowercase + " lowercase characters!" +
        "\n# " + especiais + " special characters!" +
        "\n# " + numericos + " numeric values!" +
        "\n# " + espacos + " blank spaces!" +
        "\nThe file contains " + totalPalavrasSemSW + " Non-Stopwords!" +
        "\nThe file contains " + totalStopWords + " Stopwords (used in english language)!" +  // FROM: https://countwordsfree.com/stopwords     
        "\nThe file get's an average of " + String.format("%.2f", mediaPalavras) + " words / sentence!" +
        "\nThe file get's an average of " + String.format("%.2f", mediaCaracteres) + " characters / sentence!" + 
        "\nThe file takes an average of " + calcularTempoLeitura(raiz.getPalavra().getTotalPalavras(),183) + " to read in Oral reading (avg of 183wpm)!" + // 183wpm from https://thereadtime.com/
        "\nThe file takes an average of " + calcularTempoLeitura(raiz.getPalavra().getTotalPalavras(),238) + " to read in Silent reading (avg of 238wpm)!"); // 238wpm from https://thereadtime.com/
        
        //msg para output grafico
        String msgTotais = " This file contains: " +
                           "\n  -  " + (contaLinha-1) + " lines" +
                           "\n  -  " + (frases.length+1) + " sentences" +
                           "\n  -  " + raiz.getPalavra().getTotalPalavras() + " words" +
                           "\n  -  " + totalPalavrasDiferentes + " different words" +
                           "\n  -  " + (totalCaracteres+especiais+numericos+espacos) + " characters" +
                           " \n Splited in:" +
                           "\n  -  " + totalCaracteres + " alpha characters (without Specials)" +
                           "\n  -  " + uppercase + " uppercase characters" + 
                           "\n  -  " + lowercase + " lowercase characters" +
                           "\n  -  " + especiais + " special characters"+
                           "\n  -  " + numericos + " numeric values"+
                           "\n  -  " + espacos + " blank spaces"+
                           "\n"+
                           " \n Also contains: "+
                           "\n  -  "+ totalPalavrasSemSW + " Non-Stopwords" +
                           "\n  -  "+ totalStopWords + " Stopwords (used in english language)" + // FROM: https://countwordsfree.com/stopwords
                           "\n"+
                           " \n And it gets an average of:" +
                           "\n  -  " + String.format("%.2f", mediaPalavras) + " words / sentence"+
                           "\n  -  " + String.format("%.2f", mediaCaracteres) + " characters / sentence"+
                           "\n  -  " + calcularTempoLeitura(raiz.getPalavra().getTotalPalavras(),183) + " to read in Oral reading (avg of 183wpm)" + // 183wpm from https://thereadtime.com/
                           "\n  -  " + calcularTempoLeitura(raiz.getPalavra().getTotalPalavras(),238) + " to read in Silent reading (avg of 238wpm)"; // 238wpm from https://thereadtime.com/
                           
        JOptionPane.showMessageDialog(null,msgTotais ,"WORD AND CHARACTER ANALISER v1.0",JOptionPane.PLAIN_MESSAGE);
        
        // chama a função que vai obter o numero de caracteres a ser utilizados (resultado do valor selecionado de um JSpinner no interface grafio)
        qtdCaracteresAnalisar = obterQuantidadeCaracteres();

        // Chama o classe Carateres e o respetivo metodo criado para análise de caracteres
        qtdCar.ContaCar(contaLetras,qtdCaracteresAnalisar, totalCaracteres);
        
        // outpu grafico dos caracteres mais frequentes
        JOptionPane.showMessageDialog(null, "Here's the list of the " + qtdCaracteresAnalisar + " caracters \nthat appears the most in this text: \n\n" + qtdCar.toString()+"\n",
        "WORD AND CHARACTER ANALISER v1.0",JOptionPane.PLAIN_MESSAGE);   
        
        // msg gravação ficheiros CVS
        String msgFicheirosCSV = """
                                 Two separate files have been saved on your Desktop.
                                 CSV_export_words.csv - Contains the words and some statistics about them, obtained from the chosen text.
                                 CSV_export_characters.csv - Contains the characters and some statistics about them, obtained from the chosen text.""";
        
        JOptionPane.showMessageDialog(null,msgFicheirosCSV,"WORD AND CHARACTER ANALISER v1.0",JOptionPane.PLAIN_MESSAGE);
        
        JOptionPane.showMessageDialog(null," -- THANK YOU FOR CHOOSING THIS SOFTWARE -- ","WORD AND CHARACTER ANALISER v1.0",JOptionPane.PLAIN_MESSAGE);

    }   
}