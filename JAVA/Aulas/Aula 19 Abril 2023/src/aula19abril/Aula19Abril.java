/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula19abril;

import java.util.Scanner;

public class Aula19Abril {
    
public static void main(String[] args) {
                
        Scanner leia = new Scanner(System.in);
         
        int []vetor = new int[10]; // inicia o vetor dizendo que o mesmo dispoem de 10 posições
        
        System.out.println("Insira os valores para o seu Vetor.");
        for (int i = 0; i < 10; i++){ //percorre as linhas e vai adicionando os numeros desde a posição 0 a posição 9
            System.out.print("vetor[" + (i+1) + "]" + " = ");
            vetor[i] = leia.nextInt();
        }
        
    //SOMA
        int soma = 0;
        for (int i=0; i < 10; i++){ //precorre as linhas e realiza a soma adicionando a variavel soma o valor do vetor nas posições de 0 a 9
                soma = soma + vetor[i];
        }
        System.out.println("A soma dos numeros é: " + soma);
          
    //MEDIA
        double media = 0;
        media = (double) soma / vetor.length;
        System.out.println("A media dos numeros é: " + media);

    //MAIOR
        int maior = vetor[0]; // declara o maior como sendo o primeiro
        
        for (int i=0; i < 10; i++){ //precorre as linhas
                if (vetor [i] > maior) // compara o numero com o maior (declarado como primeiro) e se for maior associa-o a variavel "maior"
                    maior = vetor [i];
        }
        System.out.println("Maior numero inserido é: " + maior);
        
    //NUMERO de OCORRENCIAS
        System.out.print("Indique o numero que pretende pesquisar: ");
        int numero = leia.nextInt();
        
        int ocorrencias = 0;
        
        for (int i=0; i < 10; i++){ //precorre as linhas
                if ( vetor[i] == numero) //verifica se o numero escolhido esta contido no vetor e adiciona o a variavel ocorrencias 1 unidade de cada vez
                    ocorrencias ++;
                }
        if (ocorrencias == 1)
            System.out.println("O numero escolhido aparece " + ocorrencias + " vez no seu vetor.");
        else
            System.out.println("O numero escolhido aparece " + ocorrencias + " vezes no seu vetor.");
                   
    
}
}
