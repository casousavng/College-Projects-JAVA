
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestaopauta;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Carlos Sousa EI1 2023/2024
 * 
 */

public class GestaoPauta {
    
    public String[] nomesAlunos;
    public int[] classificacoes;
    int indice = 0;

    public GestaoPauta(int tamanho) {
        this.nomesAlunos = new String[tamanho];
        this.classificacoes = new int[tamanho];
    }

    public GestaoPauta(String[] nomesAlunos, int[] classificacoes) {
        this.nomesAlunos = nomesAlunos;
        this.classificacoes = classificacoes;
    }
    
    public void inserirDados(String nomeAluno, int classificacao) {

        nomesAlunos[indice] = nomeAluno;
        classificacoes[indice] = classificacao;
        indice++;
    }   
    
    public void apresentarPauta() {
        for (int i = 0; i < nomesAlunos.length; i++) {
            if (nomesAlunos[i] == null){
                break;
            }
            else
                System.out.println("Nome: " + nomesAlunos[i] + " | Classificação: " + classificacoes[i]);
        }
    }
    
    public void ordenarPorNome() {
        for (int i = 0; i < nomesAlunos.length - 1; i++) {
            for (int j = 0; j < nomesAlunos.length - 1 - i; j++) {
                if (nomesAlunos[j].compareTo(nomesAlunos[j + 1]) > 0) {
                    // Troca os elementos se estiverem fora de ordem
                    trocarElementos(j, j + 1);
                }
            }
        }
    }

    public void ordenarPorClassificacao() {
        quickSort(0, classificacoes.length - 1);
    }

    private void quickSort(int inicio, int fim) {
        if (inicio < fim) {
            int indiceParticao = particionar(inicio, fim);
            quickSort(inicio, indiceParticao - 1);
            quickSort(indiceParticao + 1, fim);
        }
    }

    private int particionar(int inicio, int fim) {
        int pivo = classificacoes[fim];
        int i = inicio - 1;
        for (int j = inicio; j < fim; j++) {
            if (classificacoes[j] >= pivo) {
                i++;
                // Troca os elementos se estiverem fora de ordem
                trocarElementos(i, j);
            }
        }
        // Coloca o pivo no lugar certo
        trocarElementos(i + 1, fim);
        return i + 1;
    }

    private void trocarElementos(int indiceA, int indiceB) {
        String tempNome = nomesAlunos[indiceA];
        nomesAlunos[indiceA] = nomesAlunos[indiceB];
        nomesAlunos[indiceB] = tempNome;

        int tempClassificacao = classificacoes[indiceA];
        classificacoes[indiceA] = classificacoes[indiceB];
        classificacoes[indiceB] = tempClassificacao;
    }

    public int classificacaoAntesOrdenar(String nomeAluno) {
        for (int i = 0; i < nomesAlunos.length; i++) {
            if (nomesAlunos[i].equals(nomeAluno)) {
                return classificacoes[i];
            }
        }
        return -1; // Retorna -1 se o aluno não for encontrado
    }

    public int classificacaoDepoisOrdenar(String nomeAluno) {
        int indice = pesquisaBinaria(nomeAluno);
        if (indice != -1) {
            return classificacoes[indice];
        } else {
            return -1;
        }
    }

    private int pesquisaBinaria(String nomeAluno) {
        int inicio = 0;
        int fim = nomesAlunos.length - 1;
        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            int comparacao = nomesAlunos[meio].compareTo(nomeAluno);
            if (comparacao == 0) {
                return meio;
            } else if (comparacao < 0) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        return -1; // Retorna -1 se o aluno não for encontrado
    }

    public void escreveArquivo(String nomeArquivo) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(nomeArquivo))) {
            for (int i = 0; i < nomesAlunos.length; i++) {
                writer.println(nomesAlunos[i] + "," + classificacoes[i]);
            }
        } catch (IOException e) {
        }
    }

    public void leArquivo(String nomeArquivo) {
        try (BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo))) {           
            String line;
            int index = 0;
            while ((line = reader.readLine()) != null && index < nomesAlunos.length) {
                String[] parts = line.split(",");
                nomesAlunos[index] = parts[0];
                classificacoes[index] = Integer.parseInt(parts[1]);
                index++;
            } 
        } catch (IOException | NumberFormatException e) {
        }
    }
        
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        String aluno1;
        String aluno2;
        int opcao, opcont;
        int alunos = 0;
        
        System.out.println("### GESTOR DE PAUTAS ###");
        System.out.print("Quantos alunos pretende inserir: ");
        int tamanho = leia.nextInt();
        GestaoPauta gestaoPauta = new GestaoPauta(tamanho);
        System.out.println("");
        
        do{
            System.out.println("""
                               ### Menu Principal ###
                               (1) - Inserir nome e classificação do(s) aluno(s).
                               (2) - Apresentar toda a pauta.
                               (3) - Ordenar de forma alfabética.
                               (4) - Ordenar por ordem descrescente das classifica\u00e7oes.
                               (5) - Pesquisar classifica\u00e7ao do aluno (antes de ordenar).
                               (6) - Pesquisar classifica\u00e7ao do aluno (depois de ordenar).
                               (7) - Guardar classifica\u00e7\u00f5es inseridas num ficheiro de texto.
                               (8) - Ler classifica\u00e7\u00f5es guardadas num ficheiro de texto.
                               (9) - Sair""");
                
        System.out.print("Opcao: ");
        opcao = leia.nextInt();
        System.out.println("");
        
            switch(opcao){

                case 1: 
                    
                    if (alunos >= tamanho){
                        System.out.println("Não tem espaço para inserir novos alunos. Comece de novo.");
                        break;
                    }
                    else
                        System.out.println("Insira o nome e classificação dos " + tamanho + " alunos.");
                        do{
                            System.out.print("Nome: ");
                            String nome = leia.next();
                            System.out.print("Classificaçao: ");
                            int nota = leia.nextInt();
                            gestaoPauta.inserirDados(nome, nota);
                            alunos++;
                        } while (alunos < tamanho);
                        do {
                            System.out.println("--> Prima (1) para voltar ao menu anterior...");
                            opcont = leia.nextInt();
                        } while (opcont != 1);
                        break; 

                case 2:
                    System.out.println("A opção escolhida mostra toda a pauta pela ordem de inserção.");
                    gestaoPauta.apresentarPauta();
                    do {
                        System.out.println("--> Prima (1) para voltar ao menu anterior...");
                        opcont = leia.nextInt();
                    } while (opcont != 1);
                    break;
                    
                case 3:   
                    System.out.println("Ordenação dos alunos feita Alfabéticamente.");
                    gestaoPauta.ordenarPorNome();
                    gestaoPauta.apresentarPauta();
                    do {
                        System.out.println("--> Prima (1) para voltar ao menu anterior...");
                        opcont = leia.nextInt();
                    } while (opcont != 1);
                    break;

                case 4:
                    System.out.println("Ordenação dos alunos feita pela Classificação obtida.");
                    gestaoPauta.ordenarPorClassificacao();
                    gestaoPauta.apresentarPauta();
                    do {
                        System.out.println("--> Prima (1) para voltar ao menu anterior...");
                        opcont = leia.nextInt();
                    } while (opcont != 1);
                    break;

                case 5:
                    System.out.print("Qual o nome do aluno que pretende pesquisar: ");
                    aluno1 = leia.next();
                    if (gestaoPauta.classificacaoAntesOrdenar(aluno1) == -1)
                        System.out.println("O Aluno nao foi encontrado.");
                    else
                        System.out.println("A classificação de "+ aluno1 +" antes da ordenação do vetor foi de " +
                        gestaoPauta.classificacaoAntesOrdenar(aluno1) + " valores.");
                    do {
                        System.out.println("--> Prima (1) para voltar ao menu anterior...");
                        opcont = leia.nextInt();
                    } while (opcont != 1);
                    break;

                case 6:
                    System.out.print("Qual o nome do aluno que pretende pesquisar: ");
                    aluno2 = leia.next();
                    if (gestaoPauta.classificacaoDepoisOrdenar(aluno2) == -1)
                        System.out.println("O aluno nao foi encontrado ou a pauta não foi ordenada alfabéticamente préviamente.");
                    else
                        System.out.println("A classificação de "+ aluno2 +" depois da ordenação do vetor foi de " +
                        gestaoPauta.classificacaoDepoisOrdenar(aluno2) + " valores.");
                    do {
                        System.out.println("--> Prima (1) para voltar ao menu anterior...");
                        opcont = leia.nextInt();
                    } while (opcont != 1);
                    break;

                case 7:
                    System.out.println("Qual o nome que pretende dar ao ficheiro? ");
                    String ficheiro_escrita = leia.next();
                    System.out.println("");
                    System.out.println("Os dados dos alunos foram guardados no ficheiro " + ficheiro_escrita + ".txt");
                    gestaoPauta.escreveArquivo(ficheiro_escrita + ".txt");
                    do {
                        System.out.println("--> Prima (1) para voltar ao menu anterior...");
                        opcont = leia.nextInt();
                    } while (opcont != 1);
                    break;

                case 8:
                    System.out.println("Qual o nome do ficheiro que pretende ler? ");
                    String ficheiro_leitura = leia.next();
                    System.out.println("");
                    System.out.println("Após pesquisa, estes são os dados gravados no ficheiro com nome "  + ficheiro_leitura + ".txt");
                    GestaoPauta novaGestaoPauta = new GestaoPauta(100);
                    novaGestaoPauta.leArquivo(ficheiro_leitura + ".txt");
                    novaGestaoPauta.apresentarPauta();
                    System.out.println("");
                    do {
                        System.out.println("--> Prima (1) para voltar ao menu anterior...");
                        opcont = leia.nextInt();
                    } while (opcont != 1);
                    break;

            } 
        } while (opcao!= 9);

    }
}

