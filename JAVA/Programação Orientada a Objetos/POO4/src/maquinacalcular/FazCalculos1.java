/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maquinacalcular;

/**
 *
 * @author andresousa
 */
public class FazCalculos1 {
    
    public static void main(String[] args) {
        
        Calculadora valor = new Calculadora(2.7, 5.2);
                
        System.out.println("A soma de (A + B) é: " + valor.soma());
        System.out.println("A subtração de (A - B) é: " + valor.subtrai());
        System.out.println("A multiplicação de (A * B) é: " + valor.multiplica());
        System.out.println("A divisão de (A / B) é: " + valor.divide());
        
        
        
        
    }
    

    
    
}
