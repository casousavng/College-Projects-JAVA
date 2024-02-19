/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aulapratica_exercicio;

/**
 *
 * @author andresousa
 */
public class Aulapratica_exercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       
        // TODO code application logic here
        
        int a = 3, b= 8;
        while (a++ <= --b)
            
            // inicilamente o A usa o valor inicial so apos o ciclo é incrementado, no caso do B ele é decrementado antes de ciclo 
            // (de 8 passa a 7) e é comparado logo desde inicio ou seja 3<=7. Depois passa a incrementar o 3->4 e segue para 4<=6 (pois o 7 passou
            // a ser decrementado a 6 logo apos correr o ciclo.
            
            System.out.println("a = " + a + ", b = " + b);
    }
    
    
    
}
