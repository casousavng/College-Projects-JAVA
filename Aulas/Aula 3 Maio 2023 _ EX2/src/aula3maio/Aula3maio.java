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
public class Aula3maio {

    public static int contador(String texto , String prefixo, int conta){
        
        int contador = 0;
        
        System.out.println("texto:" + texto);
        System.out.println("prefixo:" + prefixo);
        
        if (texto.startsWith(prefixo)){
            
        contador += 1;
        }
        return contador;
    }
    
    public static void main(String[] args) {
        
     Scanner leia = new Scanner(System.in);
    
     String texto = "";
     
     int conta = 0;
     
        System.out.print("Digite o pré-fixo: ");
        String prefixo = leia.next().toUpperCase();
        
     do{
                 
        System.out.print("Digite uma String ou FIM para terminar: ");
        texto = leia.next().toUpperCase();
        conta = contador(texto, prefixo, conta);
       
     } while (!texto.equals("FIM"));
     
        // usar o printf para impressao de dados formatados na forma de (%d, resultado)
     
        System.out.printf("Foram contadas %d iniciadas pelo prefixo indicado.\n", conta);
           
    }
    
}
