/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maquinacalcular;

import java.util.Scanner;

/**
 *
 * @author andresousa
 */
public class FazCalculos2 {
    
        public static void main(String[] args) {
        
        double a, b;
        
        Scanner leia = new Scanner (System.in);
        
        System.out.print("Insira o primeiro valor: ");
        a = leia.nextDouble();
        System.out.print("Insira o segundo valor: ");
        b = leia.nextDouble();
        
        // TODO code application logic here
        Calculadora valor = new Calculadora (a, b);
        
        System.out.println("A soma de (A + B) é: " + valor.soma());
        System.out.println("A subtração de (A - B) é: " + valor.subtrai());
        System.out.println("A multiplicação de (A * B) é: " + valor.multiplica());
        System.out.println("A divisão de (A / B) é: " + valor.divide());

        
        
    
}
    

}
