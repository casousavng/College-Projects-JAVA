/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula17abril;

import java.util.Scanner;

/**
 *
 * @author andresousa
 */
public class Aula17abril {
    
    


    
    public static void main(String[] args) {
        int m, n;
        
        
        Scanner leia = new Scanner(System.in);
        
        System.out.print("Insira o numero de linhas: "); 
        m = leia.nextInt();
        
        System.out.print("Insira o numero de colunas: ");
        n = leia.nextInt();
        
        
        int [][]matriz = new int[m][n]; // inicia o vetor  e utiliza os valor de M E N com o numero de linhas M e colunas N pedidas nas linhas anteriores
        
        
        for (int i = 0; i < m; i++){ //percorre as linhas todas
            for (int j=0; j < n; j++){ //percorre as colunas todas
                System.out.print("matriz[" + i + "]" + "[" + j + "]" + " = ");
                matriz[i][j] = leia.nextInt();
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
        
        
        
    }
}

                

// fazer um programa que leia uma matriz de numeros inteiros com M linhas e N colunas e chame um metodo que retorne
// um vetor que guarde a soma dos elementos de cada coluna. O vetor com as somas deve ser escrito no programa principal.
        
        
    
    
    

