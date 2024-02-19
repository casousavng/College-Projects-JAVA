/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula8maio;

import java.util.Arrays;
import java.util.Scanner;


/**
 *
 * @author andresousa
 */
public class Aula8maio {
    
    // Somar todos os elementos de um array.
    // escrito com ciclos
    
    public static int somaArray (int []array){
        
        int soma = 0;
        
        for(int i = 0; i < array.length; i++)
            soma = soma + array[i];
        return soma;
    }
     
    
    // Escrever os elementos de um array por ordem inversa (do fim para o início).
    // escrito com cilclos
    
    public static void inverterArray (int []array){
        
        int []novo = new int[array.length];
        int a = 0;
        
        for (int i = 0; i < array.length; i++){
            novo[array.length -1 -i] = array[i];
        }
        
        for (int i = 0; i < array.length; i++){
            array[i] = novo[i];
        }
    }
    
    // Pesquisar a existência de um elemento num array.
    public static int pesquisaElemento(int []array, int elemento){
        
        for (int i = 0; i < 5; i++){           
            if (array[i] == elemento)
                return 0;          
         } return 1;
    }
    
    // Calcular a potência de um número (base e expoente inteiros
    // escrito de forma com ciclo
    public static int potencia(int base, int expoente){
        
        int resultado = 1;
        
        for (int i = 0; i < expoente; i++ ){
            resultado *= base;
  
        } 
        return resultado;
    }
    
    // Calcular a potência de um número (base e expoente inteiros)
    // escrito  SEM ciclo
    
    public static int potencia2(int base, int expoente){
        
        if (expoente == 0)
            return 1;
        
        if (expoente == 1){
            return base;
            
        }
        int resultado = base * potencia2(base, expoente - 1);
        System.out.println("Base = " + base);
        System.out.println("Expoente - 1 = " + (expoente));
        System.out.println("Resultado = " + resultado);
        return resultado;
        
    } 
    
    // Indicar qual a sequência gerada por f(400) sendo f definido como:
    public static void f(int n){
        if (n > 0){
            f(n/4 - 50);
            f(n/2 - 20);
            System.out.println(n);
        }
        
    }



    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leitura = new Scanner( System.in );
        
        int []array = {1,2,3,4,5,6};
        
        System.out.println("A soma do array é: " + somaArray(array));
        
        // imprime o array tranformando em String
        inverterArray(array);
        System.out.println("O array invertido fica: " + Arrays.toString(array));
        
        //imprime individualmente o array por posição
        System.out.print("O array invertido fica: ") ;
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i]) ;
        }
        
        System.out.println("");
        
        System.out.print("Qual o elemento que pretende pesquisar: ");
        int elemento = leitura.nextInt();
        
        if (pesquisaElemento(array, elemento) == 0)
            System.out.println("O valor " + elemento + " esta presente no array.");
        else
            System.out.println("O valor " + elemento + " NÃO esta presente no array.");
        
        
    // Calcular o produto de dois números inteiros usando apenas somas (5 x 4
    // equivale a adicionar 5 sucessivamente 4 vezes: 20 = 5 + 5 + 5 + 5)
    
        System.out.print("Digite o primeiro numero (exemplo 5): ");
        int n1 = leitura.nextInt();
        System.out.print("Digite o segundo numero (exemplo 4): ");
        int n2 = leitura.nextInt();
        
        System.out.print("O produto dos dois numeros apenas realizando somas fica: ");
        for (int i = n2; i != 0; i--){
            System.out.print(n1);
            if (i > 1)
            System.out.print("+");
                    
        }
        
        System.out.println(""); // espaçamento dos programas entre sim
        System.out.println("");
        
        
    // Calcular a potência de um número (base e expoente inteiros)
    
        System.out.print("Digite a base (exemplo 5): ");
        int b = leitura.nextInt();
        System.out.print("Digite o expoente (exemplo 4): ");
        int e = leitura.nextInt();
        int resultado = potencia(b,e);
        System.out.println("O resultado deste calculo é: " + resultado);
        
        System.out.println("");
        System.out.println("O resultado SEM CICLOS é: " + potencia2(b, e));
        
        
    // Indicar qual a sequência gerada por f(400) sendo f definido como:

    
        System.out.println("A sequencia gerador por F(400) é: ");
        f(400);

        
        System.out.println("");
            
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

        
                
        
        
    }
    
}
