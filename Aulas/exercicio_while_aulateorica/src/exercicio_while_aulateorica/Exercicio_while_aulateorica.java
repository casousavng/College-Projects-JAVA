/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio_while_aulateorica;

import java.util.Scanner;
/**
 * 
 * 
 *
 * @author andresousa
 */
public class Exercicio_while_aulateorica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  
        Scanner leia = new Scanner (System.in);
        int numero, n, s = 0;
        System.out.print("Insira um numero: ");
        numero = leia.nextInt();
        n = numero;
        while (n > 0){
            s += n%10;
            n /= 10;
    }
            System.out.println("A soma dos Algarismos de " + numero + " é " + s);
    

     int a;
     System.out.print("Insira um numero: ");
        int numeroA = leia.nextInt();
        a = numeroA;       
          
    
    int n1 = a % 10; // neste passo temos o resto da divisao de A por 10 ou seja 256/10 da 25 sobra o 6 (devido a ser inteiro) - ultimo algarismo
    int n2 = (a/10) % 10; // neste passo temos o resto da divisao de A por 10 novamente dividida por 10 para obter o segundo resto que é 5 - algarismo do meio
    int n3 = ((a/10)/10) % 10; // neste passo dividimos uma terceira vez o A por 10 para obter o primeiro algarismo de A e o respetivo resto que é 2 - primeiro algarismo
    
        System.out.println("n1=" + n3);
        System.out.println("n2=" + n2);
        System.out.println("n3=" + n1);
      
    }
    
}
