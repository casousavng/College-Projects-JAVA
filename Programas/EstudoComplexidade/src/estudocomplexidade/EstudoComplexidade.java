/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estudocomplexidade;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author andresousa
 */
public class EstudoComplexidade {
    
   
    private static void quickSort(int[] vetor, int inicio, int fim) {
        if (inicio < fim) {
            int posicaoPivo = separar(vetor, inicio, fim);
            quickSort(vetor, inicio, posicaoPivo - 1);
            quickSort(vetor, posicaoPivo + 1, fim);
        }
    }

    private static int separar(int[] vetor, int inicio, int fim) {
        
        int pivo = vetor[inicio];
        int i = inicio + 1, f = fim;
        while (i <= f) {
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
    
    public static void insertionSort(int[] vetor) {
        
        int j;
        int key;
        int i;

        for (j = 1; j < vetor.length; j++)
        {
          key = vetor[j];
          for (i = j - 1; (i >= 0) && (vetor[i] > key); i--)
          {
             vetor[i + 1] = vetor[i];
           }
            vetor[i + 1] = key;
        }
    }
    
    
    public static void gravarCSV(String nomeArquivo, int []quantidadeDados, long[]tempoExecucao, int quantidadeTotalDados) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(nomeArquivo))) {
                
            for (int i = 0; i < quantidadeTotalDados; i++) {
                writer.println(quantidadeDados[i] + "," + tempoExecucao[i]);
            }
        
        } catch (IOException e) {
        }
    }
    
    public static void dadosQuicksort(int quantidadeTotalDados){
        
        int quantidade = 1;
        
        int indice = 0;
        int[] quantidadeDados = new int[quantidadeTotalDados];
        long[] tempoExecucao= new long[quantidadeTotalDados];
        
        do{

            int[] vetor = new int[quantidade];

            for (int i = 0; i < vetor.length; i++) {
                vetor[i] = (int) (Math.random()*quantidade);
            }

            long tempoInicial = System.currentTimeMillis();

            quickSort(vetor,0,vetor.length-1);

            long tempoFinal = System.currentTimeMillis();            

            quantidade = quantidade * 5;
            
            long tempo = tempoFinal - tempoInicial;
                        
            System.out.println("QuickSort: " + quantidade + " em " + tempo + " ms");
            
            quantidadeDados[indice] = quantidade;
            tempoExecucao[indice] = tempo;
            indice++;
            
                   
        } while (quantidade <= quantidadeTotalDados);
        
        System.out.println("qtd dados" + quantidadeTotalDados);
        
        gravarCSV("QuickSortDatasheet", quantidadeDados, tempoExecucao, quantidadeTotalDados); 
        
    }
    
    public static void dadosInsertionsort(int quantidadeTotalDados){
        
        int quantidade = 1;
        
        int indice = 0;
        int[] quantidadeDados = new int[quantidadeTotalDados];
        long[] tempoExecucao= new long[quantidadeTotalDados];
        
        do{

            int[] vetor = new int[quantidade];

            for (int i = 0; i < vetor.length; i++) {
                vetor[i] = (int) (Math.random()*quantidade);
            }

            long tempoInicial = System.currentTimeMillis();

            insertionSort(vetor);

            long tempoFinal = System.currentTimeMillis();            

            quantidade = quantidade * 5;
            
            long tempo = tempoFinal - tempoInicial;
                        
            System.out.println("InsertionSort: " + quantidade + "," + tempo + " ms");
            
            quantidadeDados[indice] = quantidade;
            tempoExecucao[indice] = tempo;
            indice++;
            
                   
        } while (quantidade <= quantidadeTotalDados);
        
        gravarCSV("InsertionSortDatasheet", quantidadeDados, tempoExecucao, quantidadeTotalDados);
        
        
    }

    
    public static void main(String[] args) {

        int quantidadeTotalDados = 10000;
        
        dadosQuicksort(quantidadeTotalDados);
        
        dadosInsertionsort(quantidadeTotalDados);
         
    }
        

       
}


