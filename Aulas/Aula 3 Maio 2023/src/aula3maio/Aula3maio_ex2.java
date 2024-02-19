/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula3maio;

import java.util.Scanner;
/**
 *
 * @author andresousa
 */
public class Aula3maio_ex2 {
    
    public static int contadorABC(String texto , int contador){
        
        if (texto.startsWith("A") || texto.startsWith("B") || texto.startsWith("C")){
        contador += 1;
        }
        return contador;
    }
    
    public static void main(String[] args) {
        
     Scanner leia = new Scanner(System.in);
    
     String texto = "";
     
     int conta = 0;
        
     do{
                 
        System.out.print("Digite uma String ou FIM para terminar: ");
        texto = leia.next().toUpperCase();
        conta = contadorABC(texto, conta);
       
     } while (!texto.equals("FIM"));
     
        // usar o printf para impressao de dados formatados na forma de (%d, resultado)
     
        System.out.printf("Encontradas %d iniciadas por A, B, C\n", conta);
           
    }
    
}
