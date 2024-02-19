/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rapidezalgoritmos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author andresousa
 */
public class RapidezAlgoritmos {
    
    public static void selectionSort(int[] array) {
        for (int fixo = 0; fixo < array.length - 1; fixo++) {
         int menor = fixo;

        for (int i = menor + 1; i < array.length; i++) {
            if (array[i] < array[menor]) {
             menor = i;
            }
        }
        if (menor != fixo) {
            int t = array[fixo];
            array[fixo] = array[menor];
            array[menor] = t;
        }
        }
    }   
    
    public static void bubbleSort(int vetor[]){
        boolean troca = true;
        int aux;
        while (troca) {
            troca = false;
            for (int i = 0; i < vetor.length - 1; i++) {
                if (vetor[i] > vetor[i + 1]) {
                    aux = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = aux;
                    troca = true;
                }
            }
        }
    }
    

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
    
    public static int[] gerarVetorAleatorio (int quantidade){
        
        int[] vetor = new int[quantidade];
        
        for (int i = 0; i < vetor.length; i++){
            vetor[i] = (int) (Math.random()*quantidade);

        } return vetor;
    }
        
    public static void gravarDadosCSV(String nomeFicheiro, int quantidadeDados, long tempoExecucao) {
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeFicheiro, true))) {
            writer.write(quantidadeDados + "," + tempoExecucao);
            writer.newLine();
        } catch (IOException e) {
            System.err.println("Erro ao gravar dados no arquivo CSV: " + e.getMessage());
        }
    }

    public static void main(String[] args) throws IOException {
        
        Scanner leia = new Scanner(System.in);
        
        // para o estudo usar N = [10, 50, 100, 500, 1000, 5000, 10.000, 25.000, 50.000, 75.000, 100.000, 250.000]
        
        System.out.print("Insira a Quantidade de Dados a ordenar: ");
        int quantidade = leia.nextInt();
        System.out.println("");
                
        // vetor original a ser ordenado
        int[] vetor = gerarVetorAleatorio(quantidade);
       
        // execução do algortimo InsertionSort para ordenar os N numeros aleatorios contidos no vetor
        int[] vetorInsertion = vetor.clone();
        long tempoInicial = System.currentTimeMillis();
        insertionSort(vetorInsertion);
        long tempoFinal = System.currentTimeMillis();
        System.out.println("Ordenação pelo Algoritmo InsertionSort | Quantidade de dados: "+quantidade+" | Executado em: "+(tempoFinal-tempoInicial)+" ms\n");
        
        gravarDadosCSV("InsertionSortDados.csv",quantidade,(tempoFinal-tempoInicial));
        
        // execução do algortimo QuickSort para ordenar os N numeros aleatorios contidos no vetor
        int[] vetorQuick = vetor.clone();
        tempoInicial = System.currentTimeMillis();
        quickSort(vetorQuick,0,vetorQuick.length-1);
        tempoFinal = System.currentTimeMillis();
        System.out.println("  Ordenação pelo Algoritmo QuickSort   | Quantidade de dados: "+quantidade+" | Executado em: "+(tempoFinal-tempoInicial)+" ms\n");
        
        gravarDadosCSV("QuickSortDados.csv",quantidade,(tempoFinal-tempoInicial));
        
        // execução do algortimo BuubleSort para ordenar os N numeros aleatorios contidos no vetor
        int[] vetorBubble = vetor.clone();
        tempoInicial = System.currentTimeMillis();
        bubbleSort(vetorBubble);
        tempoFinal = System.currentTimeMillis();
        System.out.println("  Ordenação pelo Algoritmo BubbleSort  | Quantidade de dados: "+quantidade+" | Executado em: "+(tempoFinal-tempoInicial)+" ms\n");
        
        gravarDadosCSV("BubbleSortDados.csv",quantidade,(tempoFinal-tempoInicial));
        
        // execução do algortimo BuubleSort para ordenar os N numeros aleatorios contidos no vetor
        int[] vetorSelection = vetor.clone();
        tempoInicial = System.currentTimeMillis();
        selectionSort(vetorSelection);
        tempoFinal = System.currentTimeMillis();
        System.out.println("Ordenação pelo Algoritmo SelectionSort | Quantidade de dados: "+quantidade+" | Executado em: "+(tempoFinal-tempoInicial)+" ms\n");
        
        gravarDadosCSV("SelectionSortDados.csv",quantidade,(tempoFinal-tempoInicial));        
    }
    
}
