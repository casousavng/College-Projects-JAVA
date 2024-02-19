/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testeestudodacomplexidade;

import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 *
 * @author andresousa
 */

public class TesteEstudoDaComplexidade {


    public static void insertionSort(int[] vetor) {
        int j;
        int key;
        int i;

        for (j = 1; j < vetor.length; j++){
            key = vetor[j];
            for (i = j - 1; (i >= 0) && (vetor[i] > key); i--){
                vetor[i + 1] = vetor[i];
                }
            vetor[i + 1] = key;
        }
    }

    public static void quickSort(int[] vetor, int inicio, int fim) {
        if (inicio < fim) {
            int posicaoPivo = separar(vetor, inicio, fim);
            quickSort(vetor, inicio, posicaoPivo - 1);
            quickSort(vetor, posicaoPivo + 1, fim);
        }
    }

    public static int separar(int[] vetor, int inicio, int fim) {
        int pivo = vetor[inicio];
        int i = inicio + 1, f = fim;
        while (i <= f){
            if (vetor[i] <= pivo)
                i++;
            else if (pivo < vetor[f])
                f--;
            else {
                int troca = vetor[i];
                vetor[i] = vetor[f];
                vetor[f] = troca;
                i++;
                f--;
            }
        }
        vetor[inicio] = vetor[f];
        vetor[f] = pivo;
        return f;
    }
        
    public static void gravarDadosCSV(String nomeFicheiro, int quantidadeDados, double tempoExecucao) {
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeFicheiro, true))) {
            writer.write(quantidadeDados + "," + tempoExecucao);
            writer.newLine();
        } catch (IOException e) {
            System.err.println("Erro ao gravar dados no arquivo CSV: " + e.getMessage());
        }
    }

    public static void main(String[] args) throws IOException {
        
        int quantidade = 200000;
        int[] vetor = new int[quantidade];

        for (int i = 0; i < vetor.length; i++){
            vetor[i] = (int) (Math.random()*quantidade);

        }
                // execução do algortimo QuickSort para ordenar os N numeros aleatorios contidos no vetor
        long tempoInicial = System.currentTimeMillis();
        quickSort(vetor,0,vetor.length-1);
        long tempoFinal = System.currentTimeMillis();
        System.out.println("QuickSort     | Qtd dados: "+ quantidade + " | Executado em = " + (tempoFinal - tempoInicial) + " ms"
                            + "\n");
        
        gravarDadosCSV("QuickSortDados.csv",quantidade, (tempoFinal - tempoInicial));
        
        for (int i = 0; i < vetor.length; i++){
            vetor[i] = (int) (Math.random()*quantidade);

        }
        
        // execução do algortimo InsertionSort para ordenar os N numeros aleatorios contidos no vetor
        tempoInicial = System.currentTimeMillis();
        insertionSort(vetor);
        tempoFinal = System.currentTimeMillis();
        System.out.println("InsertionSort | Qtd dados: "+ quantidade + " | Executado em = " + (tempoFinal - tempoInicial) + " ms"
                            + "\n");
        
        gravarDadosCSV("InsertionSortDados.csv",quantidade, (tempoFinal - tempoInicial));
        

                
    }

}
