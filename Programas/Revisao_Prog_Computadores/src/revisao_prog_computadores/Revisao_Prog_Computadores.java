/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package revisao_prog_computadores;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author andresousa
 */
public class Revisao_Prog_Computadores {

/**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leia = new Scanner(System.in);
                
        // CRIAR O VETOR COM DIMENSAO DEFINIDA PELO UTILIZAdor   
                
        System.out.print("Qual a dimensão do seu vetor: ");
        int n = leia.nextInt();
         
        int []vetor = new int[n]; // inicia o vetor com o numero de posições iniciadas
        
        // LE ELEMENTOS INSERIDOS E COLOCA OS NO VETOR
        
        System.out.println("Insira os valores para o seu Vetor.");
        for (int i = 0; i < n; i++){ //percorre as linhas e vai adicionando os numeros desde a posição 0 a posição N
            System.out.print("Vetor[" + ("posicao " + i) + "]" + " = ");
            vetor[i] = leia.nextInt();}
        
        // ESCREVE TODOS OS ELEMENTOS DO VETOR
        
        System.out.println(""); //espaçamento estetico
            
        System.out.println("Os elementos do seu vetor sao: ");{
            for (int i = 0; i < n; i++){
                System.out.println(vetor[i]);}
        }
        
        // ESCREVE TODOS OS ELEMENTOS DO VETOR POR ORDEM INVERSA
        
        System.out.println(""); //espaço estetico
        
        System.out.println("Os elementos do seu vetor por ordem inversa são: ");{
            for (int i = vetor.length-1; i > -1; i--){
                
                System.out.println(vetor[i]);}
        }
        
        // EXISTENCIAS
        
        System.out.println(""); //espaço estetico
        
        System.out.print("Qual o valor a pesquisar: ");
        int numero = leia.nextInt();
        
        int ocorrencias = 0;
        
        for (int i=0; i < n; i++){ //precorre as linhas
                if ( vetor[i] == numero) //verifica se o numero escolhido esta contido no vetor e adiciona o a variavel ocorrencias 1 unidade de cada vez
                    ocorrencias ++;
                }
        if (ocorrencias == 1)
            System.out.println("O numero escolhido aparece " + ocorrencias + " vez no seu vetor.");
        else
            System.out.println("O numero escolhido aparece " + ocorrencias + " vezes no seu vetor.");
        
        System.out.println("");
        
        //MAIOR
        
        int maior = vetor[0]; // declara o maior como sendo o primeiro
        
        for (int i=0; i < n; i++){ //precorre as linhas
                if (vetor [i] > maior) // compara o numero com o maior (declarado como primeiro) e se for maior associa-o a variavel "maior"
                    maior = vetor [i];
        }
        System.out.println("Maior numero inserido é: " + maior);
        
        //MENOR
        
        int menor = vetor[vetor.length-1]; // declara o menor como sendo o primeiro
        
        for (int i=0; i < n; i++){ //precorre as linhas
                if (vetor [i] < menor) // compara o numero com o menor (declarado como primeiro) e se for menor associa-o a variavel "menor"
                    menor = vetor [i];
        }
        System.out.println("Menor numero inserido é: " + menor);
        

        //ACRECENTAR UM ELEMENTO AO VETOR EXISTENTE
        
        System.out.println("");//espaçamento estetico
 
        int []novoVetor = new int[vetor.length+1];
        
        System.out.print("Insira o novo valor para acrescentar ao seu Vetor: ");
        int valor = leia.nextInt();
        
        novoVetor[novoVetor.length-1] = valor;
        
        for (int i = 0; i < novoVetor.length-1; i++){
                novoVetor[i] = vetor[i];
        }
        
            
        System.out.println("Os elementos do seu vetor agora sao: ");{
            for (int i = 0; i < novoVetor.length; i++){
                System.out.println(novoVetor[i]);}
        }
        
                
        // ordenaçao do vetor de forma crescente pelo metodo InsertionSort
        System.out.println(""); //espaçamento estetico
        
        System.out.println("Os elementos do seu vetor ordenados de forma crescente pelo metodo InsertionSort são: ");
        
        insertionSortCrescente(novoVetor);
        
        
        
        // pesquisa Binaria
        
        System.out.println(""); //espaçamento estetico
        
        System.out.print("Qual o valor a pesquisar (pesquisa binaria): ");
        int num = leia.nextInt();
        
        pesquisaBinaria(num, novoVetor);
        
        // a pesquisa binaria so funciona com o vetor ordenado de forma crescente se o algoritmo estiver corretamente
        // escrito para comparar o maior e o menos entre o inicio, meio e fim.
        // para comparar de forma menor teria de reescrever o algoritmo de forma a calcular ao contrario
        
        
        
        
        // ordenaçao do vetor de forma decrescente pelo metodo InsertionSort
        System.out.println(""); //espaçamento estetico
        
        System.out.println("Os elementos do seu vetor ordenados de forma decrescente pelo metodo InsertionSort são: ");
        
        insertionSortDecrescente(novoVetor);
        
        


  

        
        // ORDENAÇÃO aplicando metodo de ordenação ARRAYS SORT
        
        System.out.println("");
        
        System.out.println("O seu vetor ordenado (pelo ARRAY SORT) de forma crescente fica:");
        Arrays.sort(novoVetor);
        for (int i = 0; i < novoVetor.length; i++){
            System.out.println(novoVetor[i]);
        }
        
        System.out.println(""); // espaçamento estetico
        
        System.out.println("O seu vetor ordenado (pelo ARRAY SORT) de forma decrescente fica:");
        Arrays.sort(novoVetor);
        for (int i = novoVetor.length-1; i > -1 ; i--){
            System.out.println(novoVetor[i]);
        }
        
            
                    
    }
    
    

        // ordenaçao do vetor de forma crescente pelo metodo InsertionSort

    public static void insertionSortCrescente(int[] novoVetor) {
        int j;
        int valor;
        int i;

        for (j = 1; j < novoVetor.length; j++)
        {
          valor = novoVetor[j];
          for (i = j - 1; (i >= 0) && (novoVetor[i] > valor); i--)
          {
             novoVetor[i + 1] = novoVetor[i];
           }
            novoVetor[i + 1] = valor;
        }

        for (i = 0; i < novoVetor.length; i++) // imprime o vetor
            System.out.println(novoVetor[i]);

        System.out.print("Usando metodo toString para imprimir vetor: ");
        System.out.println(Arrays.toString(novoVetor));     
    }


        // ordenaçao do vetor de forma decrescente pelo metodo InsertionSort

    public static void insertionSortDecrescente(int[] novoVetor) {
        int j;
        int valor;
        int i;

        for (j = 1; j < novoVetor.length; j++)
        {
          valor = novoVetor[j];
          for (i = j - 1; (i >= 0) && (novoVetor[i] < valor); i--)
          {
             novoVetor[i + 1] = novoVetor[i];
           }
            novoVetor[i + 1] = valor;
        }

        for (i = 0; i < novoVetor.length; i++) // imprime o vetor
            System.out.println(novoVetor[i]);

        System.out.print("Usando metodo toString para imprimir vetor: ");
        System.out.println(Arrays.toString(novoVetor));     
    }


        // PESQUSIA VETOR DE FORMA BINARIA


    public static void pesquisaBinaria(int num, int[] novoVetor) {

        int inicio = 0;         //Posição inicial do vetor.
        int meio = 0;          //Posição do meio do vetor.
        int fim = novoVetor.length - 1;  //Posição final do vetor.

        /* Enquanto a posição do inicio for menor ou igual a posição do fim,
          procura o valor de x dentro do vetor. */
        while(inicio <= fim) {
          meio = (fim + inicio) / 2; //Encontra o meio do vetor.

          System.out.println("Inicio: " + novoVetor[inicio] + " - Meio: " + novoVetor[meio] + " - Fim: " + novoVetor[fim]);
          System.out.println("Inicio: " + inicio + " - Meio: " + meio + " - Fim: " + fim);

          /* Se o valor que está no meio do vetor é igual ao valor procurado, 
            imprime que encontrou o valor e para de pesquisar. */
          if(novoVetor[meio] == num) {
            System.out.println("Encontrou o número " + num);
            break;
          }

          /* Este if serve para diminuir o tamanho do vetor pela métade. */
          /* Se o valor que está no meio do vetor for menor que o valor de x, 
            então o inicio do vetor será igual a posição do meio + 1. */
          if(novoVetor[meio] < num) {
            inicio = meio + 1;
          } else {
            /* Se o valor que está no meio do vetor for maior que o valor de x, 
              então o fim do vetor será igual a posição do meio - 1. */
            fim = meio - 1;
          }
        }

        /* Caso não encontre o valor pesquisado dentro do vetor,
          imprime que não encontrou o valor pesquisado. */
        if(inicio > fim) {
          System.out.println("Não encontrou o número " + num);
        }
    }

        
}
    



