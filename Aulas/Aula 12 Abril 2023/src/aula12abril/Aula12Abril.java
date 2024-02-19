/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula12abril;

import java.util.Scanner;

/**
 *
 * @author andresousa
 */
public class Aula12Abril {
    
    
   public static int conta(int numero) {
                  
    int s=0, c=0;
    while (numero > 0){
        s += numero % 10;
        numero /= 10;
        c++;
    }
    return c; 
       
   }
    
   public static int soma(int numero) {
       
    int s=0;
    while (numero > 0){
        s += numero % 10;
        numero /= 10;
    }
    return s;
    }
   
   public static double media(int numero){
       
    int n = numero;
    double num = n;
    double d = 0;
    int s=0, c=0;
    while (numero > 0){
        s += numero % 10;
        numero /= 10;
        c++;
    }
    d = (double)s/c;
    return d;   
   }
   
   public static int invertido(int numero){
       
       int inverso;
       inverso = 0;
       while (numero != 0){
           int digito = numero % 10;
           inverso = inverso * 10 + digito;
           numero /= 10;
       }
       return inverso;
   }
   
   public static int capicua(int numero){
       
    if (numero == invertido(numero))
        return 1;
    else
        return 0; 
   
   }
   
   public static int digitoControlo(int numero){
       
       int dig, soma = 0;
       for (int i = 1; numero > 0; i++){
            int digito = numero %10;
            soma += digito * i;
            numero = numero / 10;
                    }
       
       dig = soma % 7;
       return dig;
                    
       
   }
   
   public static boolean perfeito(int numero){ 
       int i, soma = 0;
       for (i = 1; i<numero; i++){
           if (numero % i == 0) {
               soma = soma +i;
           }
       }
       return soma == numero;
   }
   

    public static void main(String[] args) {
        // TODO code application logic here
  
        Scanner leia = new Scanner (System.in);
        int numero, s = 0;
        
        System.out.print("Insira um numero: ");
        numero = leia.nextInt();
        System.out.println("O numero digitado (" + numero + ") dispoem de " + conta(numero) + " algarismos.");
        System.out.println("A soma de todos os algarismo que compoem o numero (" + numero + ") é: " + soma(numero));
        System.out.println("A media dos numero que compoem o numero (" + numero + ") é: " + media(numero));
        System.out.println("O numero (" + numero + ") escrito de forma inversa fica: " + invertido(numero));
        if (capicua(numero) == 1)
            System.out.println("O numero é capicua.");
        else
            System.out.println("O numero não é capicua.");
        if (perfeito(numero))
            System.out.println("O numero é perfeito.");
        else
            System.out.println("O numero não é perfeito.");
 
        System.out.println("O numero de controlo é " + digitoControlo(numero) + " originando um numero final: " + numero + digitoControlo(numero));

        
            
    
    
        
    }
    
}
