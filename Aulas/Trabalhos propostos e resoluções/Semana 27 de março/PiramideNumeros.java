/*
 * Piramides de numeros:
 * piramide normal
 * piramide invertida
 * piramide so' com metade direita
 * piramide so' com metade esquerda
 */
package piramidenumeros;
import javax.swing.*;

public class PiramideNumeros {

    public static void main(String[] args) {
        
        int n;
        
        do{
           n = Integer.parseInt( JOptionPane.showInputDialog( null, "Insira um numero para a piramide (1 a 9)"));
        } while( n < 1 || n > 9 );
        
        System.out.println("Piramide:");
        System.out.println();
        
        for( int i=1; i<=n; i++ ){
            
            for( int j=n-i; j>=1; j-- ){
                System.out.print( " " );
            }
            
            for( int j=1; j<=i; j++ ){
                System.out.print( j );
            }
           
            for( int j=i-1; j>=1; j-- ){
                System.out.print( j );
            }
            
            System.out.println();
        } 
       
        System.out.println();
        System.out.println("Piramide invertida:");
        System.out.println();
       
        for( int i=n; i>=1; i-- ){
            
            for( int j=n-i; j>=1; j-- ){
                System.out.print( " " );
            }           
           
            for( int j=1; j<=i; j++ ){
                System.out.print( j );
            }
            
            for( int j=i-1; j>=1; j-- ){
                System.out.print( j );
            }
            
            System.out.println();
        }  
        
        System.out.println();
        System.out.println("Meia piramide - direita:");
        System.out.println();
       
        for( int i=1; i<=n; i++ ){
           
            System.out.print(i);
           
            for( int j=i-1; j>=1; j-- ){
                System.out.print(j);
           }
           
            System.out.println();
       }
       
        System.out.println();
        System.out.println("Meia piramide - esquerda:");
        System.out.println();
       
        for( int i=1; i<=n; i++ ){
           
            for( int j=n-1; j>=i; j-- ){
                System.out.print(" ");
            }
           
            for( int j=1; j<=i; j++ ){
                System.out.print(j);
            }
           
            System.out.println();
       }  
    }  
}
