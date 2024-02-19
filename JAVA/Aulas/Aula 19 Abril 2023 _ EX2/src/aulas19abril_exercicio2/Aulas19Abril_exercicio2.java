/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aulas19abril_exercicio2;

import java.util.Scanner;

/**
 *
 * @author andresousa
 */
public class Aulas19Abril_exercicio2 {
    
    
    
        
      
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        Scanner leia = new Scanner(System.in);
        int opcao;
        do{
        
        
        System.out.println("1 - Inserir Alunos");
        System.out.println("2 - Pesquisar Nota");
        System.out.println("3 - Alterar nota");
        System.out.println("4 - Ordenação Alfabetica");
        System.out.println("5 - SAIR");
        System.out.print("OPÇÃO:");
        opcao = leia.nextInt();
        
       switch(opcao){
           case 1:
               inserirAlunos();
               break;
           case 2:
               pesquisarNota();
               break;
           case 3: 
               alterarNota();
               break;
           case 4: 
               ordenacaoAlfabetica()
               break;
           case 5:
               System.out.println("OBRIGADO");
               break;
           default:
               System.out.println("Opção Invalida.");
       }
       }while (opcao !=3);
                    
        
        

                }
        }
        
        int maior = matriz[0][0]; // declara o maior como sendo o primeiro
        int menor = matriz[0][0]; // declara o menor como sendo o primeiro
        
        for (int i=0; i < m; i++){ //precorre as linhas
            for(int j=0; j<n; j++){ //dentro do percurso das linhas, percorre as colunas
                if (matriz [i][j] > maior) // compara o numero com o maior (declarado como primeiro) e se for maior associa ao variavel "maior"
                    maior = matriz [i][j];
                if (matriz [i][j] < menor) // compara o numero que ecnontrar com o menor e se for menor associa a variabel "menor"
                    menor = matriz [i][j];
            }
            
            
        }
        
        System.out.println("Maior = " + maior + ", Menor = " + menor);
        
        
        int []vetorSomas = new int[n];
        
        somaDasColunas(vetorSomas, matriz);
        
        for (int i=0; i<n;i++){
            System.out.println("Soma das Linhas "+i+" = " + vetorSomas[i]);
        }
    
}

public static void inserirAlunos(int numero){

  int nota = 0;
                
        int [][][]matriz = new int[20][20][2]; // inicia o vetor  e utiliza os valor de M E N com o numero de linhas M e colunas N pedidas nas linhas anteriores
        
        //fazer arrays de nomes e arrays de notas
        
        for (int i = 0; i < 20; i++){ //percorre as linhas todas
            for (int j=0; j < 2; j++){ //percorre as colunas todas
                System.out.print("Aluno[" + (i+1) + "]" + "[" + nota + "]" + " = ");
                matriz[i][j] = leia.nextInt();
        
        
    }
    public static void pesquisaNota(int numero){
        
    }
    public static void alterarNota(int numero){
        
    }
    public static void ordenacaoAlfabetica(int numero){
        
    }



}
