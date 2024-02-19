
package javatetse;

import java.util.Scanner;

public class TesteJava {

    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        System.out.print("Insira um numero: ");
        int n = leia.nextInt();
        
        Scanner leianome = new Scanner(System.in);
        System.out.print("Qual o seu nome: ");
        String nome = leianome.nextLine();
        
        
        /*  println - passa o texto na linha seguinte, imprime na linha seguinte
            print - mantem o texto na mesma linha, imprime na mesma linha
        
            criar uma string
            exemplo: string S = "ola";
        */
        
        
        System.out.println("N = " + n);
        System.out.println("Nome: " + nome);
        System.out.println("");
    }
    
}
