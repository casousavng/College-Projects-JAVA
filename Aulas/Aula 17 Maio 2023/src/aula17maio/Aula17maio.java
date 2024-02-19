/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula17maio;
import java.util.Scanner;

/**
 *
 * @author andresousa
 */
public class Aula17maio {
    

    
    public static void potencia10(int numero){
        
    /** 
    Escrever uma função recursiva que imprima em base 2 um número inteiro
    passado à função em base 10. Por exemplo, se a função receber como
    argumento o número 9 deverá imprimir 1001.
    */
        
        if (numero > 0){
            potencia10(numero / 2);
            System.out.print(numero%2);
        }
    }
    
    public static void combinacao(int base, int expoente){
        
        System.out.println("AINDA NAO CONSIGO FAZER!");
    }

    public static int fatorial(int numero){
        
        // implementar um algoritmo recursivo que calcule o factorial de um número inteiro
        
        if (numero == 1 || numero == 0)
            return 1;
        else
            return (numero * fatorial (numero-1));    
    }
    
    public static int potencia(int base, int expoente){
        
        // Implementarumalgoritmorecursivoquedetermineapotência(xn)deumnúmero inteiro.

        if (expoente == 0)
            return 1;
        if (expoente == 1)
            return base;
        else
            return base * potencia(base, expoente-1);
    }
    
    public static int somaUnitaria(int numeroA, int numeroB){
        
        // Escrever um algoritmo recursivo que permita somar dois números inteiros. 
        // Por exemplo, somar 4 com 5 equivale a somar 5 vezes 1 unidade a 4 (4+1+1+1+1+1=4+5=9).
        
        if (numeroB == 0)
            return numeroA;
        
        return 1 + somaUnitaria(numeroA, numeroB-1);
          
    } 
    
    public static int multiplicacao(int numeroA, int numeroB){
        
        // De uma forma análoga à do exercício anterior, escrever um algoritmo recursivo que permita multiplicar dois números inteiros.
        
        if (numeroA == 0 || numeroB == 0)
            return 0;
        if (numeroA == 1)
            return numeroB;
        if (numeroB == 1)
            return numeroA;

        return numeroA + multiplicacao(numeroA, numeroB-1);
    }
    
    public static int fibonacci(int limite){
        
        
        if (limite < 2)
            return limite;
        
        else
        return fibonacci(limite -1) + fibonacci(limite - 2) ;
  
    }
    
  
    
    
    
    
    
    public static void main(String[] args) {
        
        Scanner leitura = new Scanner( System.in );
        
        System.out.print("Digite um numero: ");
        int numero = leitura.nextInt();
        
        System.out.print("O numero escrito em base dois fica: ");
        potencia10(numero);
        System.out.println("");
        
        System.out.println("O fatorial de " + numero + " é: " + fatorial(numero));
        System.out.println("");
        
        System.out.print("Digite uma base: ");
        int base = leitura.nextInt();
        System.out.print("Digite um expoente: ");
        int expoente = leitura.nextInt();
        System.out.print("O produto da base " + base + " e o expoente " + expoente + " é igual a: " + potencia(base,expoente));
        System.out.println("");
        System.out.println("");
        
        System.out.print("Digite um numero A: ");
        int numeroA = leitura.nextInt();
        System.out.print("Digite um numero B: ");
        int numeroB = leitura.nextInt();
        System.out.println("A soma unitaria de " + numeroA + "+" + numeroB + " é igual a: " + somaUnitaria(numeroA, numeroB)) ;
        System.out.println("A multiplicação unitaria de " + numeroA + "x" + numeroB + " é igual a: " + multiplicacao(numeroA, numeroB));
        System.out.println("");
        
        
        System.out.print("Digite o limite para a Série de Fibonacci: ");
        int limite = leitura.nextInt();
        System.out.println("A Serie de fibonacci aceita os valores de: " + fibonacci(limite));
        fibonacci(limite);
        

        
        System.out.println("");
        
        
        
        
        // TODO code application logic here
    }
    
}
