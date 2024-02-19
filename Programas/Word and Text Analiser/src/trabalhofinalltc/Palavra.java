package trabalhofinalltc;

/**
 * Classe que representa uma palavra, contendo informações sobre o número de ocorrências e as linhas onde ela ocorre.
 * @author andresousa e fabiopinto
 */

public class Palavra {
    private String palavra;         // Variável que armazena a palavra.
    private int ocorrencias;        // Variável que armazena o número de ocorrências da palavra. 
    private final NodeLista linhas; // Variável final que armazena as linhas onde a palavra ocorre.
    private String []txt;           // Array de Strings que armazena o texto 
    private int totalPalavras;      // Variável que armazena o número total de palavras associadas a esta instância.
    private String freqRate;
    private final StopWords stop;

    // Construtor de classe sem parâmetros
    public Palavra() {
        this.stop = new StopWords();
        this.palavra = null;
        this.ocorrencias = 0;
        this.linhas = null;
        this.txt = new String[500];
        this.totalPalavras = 0;
    }
    
    // Construtor da classe que inicializa uma instância de Palavra com a palavra, o número de ocorrências e a linha
    public Palavra(String palavra, int ocorrencias, int linha) {
        this.stop = new StopWords();
        this.palavra = palavra;
        this.ocorrencias = ocorrencias;
        this.linhas = new NodeLista(linha);
        this.txt = new String[500];
        this.totalPalavras = 1;
    }
    
    // Método para obter o array de Strings.
    public String[] getTxt() {
        return txt;
    }

    // Método para definir o array de Strings.
    public void setTxt(String[] txt) {
        this.txt = txt;
    }

    // Método para obter o valor da palavra.
    public String getPalavra() {
        return palavra;
    }

    // Método para definir ou alterar o valor da palavra.
    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }

    // Método para obter o número de ocorrências.
    public int getOcorrencias() {
        return ocorrencias;
    }

    // Método para definir o número de ocorrências.
    public void setOcorrencias(int ocorrencias) {
        this.ocorrencias = ocorrencias;
    }

    // Método para obter a lista de linhas onde a palavra ocorre.
    public NodeLista getLinhas() {
        return linhas;
    }
    
    // Método para definir a linha onde a palavra ocorre na lista.
    public void setLinhas(int linha) {
        linhas.setLinha(linha);
    }

    // Método para obter o número total de palavras associadas a esta instância.
    public int getTotalPalavras() {
        return totalPalavras;
    }

    // Método para definir o número total de palavras associadas a esta instância.
    public void setTotalPalavras(int totalPalavras) {
        this.totalPalavras = totalPalavras;
    }
    
    // Método para imprimir a palavra como uma string.
    public String imprimePalavra(){
        return "" + palavra;
    }
    
    // Método que converte o array de Strings associado à palavra em uma única String.
    public String toString2() {
        StringBuilder result = new StringBuilder();
        for (String linha : txt) {
            if (linha == null)
                break;
            result.append(linha).append("\n");
        }
        return result.toString();
    }

    // Implementação do método toString (em modo Override) para gerar uma representação em string da instância.
    @Override
    public String toString() {
        if (ocorrencias == 1){
            freqRate = String.format("%.2f%%", (double) 100 / TrabalhoFinalLTC.totalPalavrasSemSW);
            if (stop.verificarPalavra(palavra) == 1)
                return ("The word \"" + palavra + "\" " + "occurs " + ocorrencias + " time in line " + linhas.linhasToString() + "; and it's a Stopword." + "\n");
            else
                return ("The word \"" + palavra + "\" " + "occurs " + ocorrencias + " time in line " + linhas.linhasToString() + "; and get's a Frequency Rate of " + freqRate +"\n");
            //return ("The word \"" + palavra + "\" " + "occurs " + ocorrencias + " time in line " + linhas.linhasToString()+"\n");
        }
        else{
            freqRate = String.format("%.2f%%", (double)(ocorrencias*100) / TrabalhoFinalLTC.totalPalavrasSemSW);
            if (stop.verificarPalavra(palavra) == 1)
                return ("The word \"" + palavra + "\" " + "occurs " + ocorrencias + " times in line(s) " + linhas.linhasToString() + "; and it's a Stopword." + "\n");
            else
                return ("The word \"" + palavra + "\" " + "occurs " + ocorrencias + " times in line(s) " + linhas.linhasToString() + "; and get's a Frequency Rate of " + freqRate +"\n");
                
            //return ("The word \"" + palavra + "\" " + "occurs " + ocorrencias + " times in lines " + linhas.linhasToString()+"\n");
        }
    }
}
