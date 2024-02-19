/*

Escrever um programa em Java para ler 3 números inteiros, e escrevê-los por ordem crescente. 
O programa deverá apresentar os resultados na forma: menor_numero < numero_do_meio < numero_maior.
O programa deverá apresentar uma mensagem caso existam números iguais.

*/

import java.util.Scanner;

public class OrdenarNumeros {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.print("Digite o primeiro número: ");
      int num1 = input.nextInt();

      System.out.print("Digite o segundo número: ");
      int num2 = input.nextInt();

      System.out.print("Digite o terceiro número: ");
      int num3 = input.nextInt();

      // Verifica se há números iguais
      if(num1 == num2 || num1 == num3 || num2 == num3) {
         System.out.println("Existem números iguais!");
      } else {
         int menor, meio, maior;

         // Ordena os números
         if(num1 < num2 && num1 < num3) {
            menor = num1;
            if(num2 < num3) {
               meio = num2;
               maior = num3;
            } else {
               meio = num3;
               maior = num2;
            }
         } else if(num2 < num1 && num2 < num3) {
            menor = num2;
            if(num1 < num3) {
               meio = num1;
               maior = num3;
            } else {
               meio = num3;
               maior = num1;
            }
         } else {
            menor = num3;
            if(num1 < num2) {
               meio = num1;
               maior = num2;
            } else {
               meio = num2;
               maior = num1;
            }
         }

         // Exibe os números em ordem crescente
        System.out.printf("%d < %d < %d\n", menor, meio, maior);
    }
}


