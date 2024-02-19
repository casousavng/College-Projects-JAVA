/*
 * Um problema, designado por Conjetura de Collatz ou Numeros de Granizo,  
 * permite gerar números através das seguintes regras: 
 * escolhe-se um número inteiro;
 * se for ímpar, multiplica-se por 3 e soma-se 1; 
 * se for par, divide-se por 2. 
 * Aplicando estas regras sucessivamente a cada número obtido 
 * obtém-se uma sequência de valores que termina sempre com a repetição dos
 * numeros 4, 2, 1, ...
 *
 * https://pt.wikipedia.org/wiki/Conjectura_de_Collatz
 */
package conjeturadecollatz;

import java.util.Scanner;

public class ConjeturaDeCollatz {

    public static void geraNumeros( int x, int n ){

        for( int i = 1; i<=n; i++ ){

           if( x%2 == 0 )
               x = x / 2;
           else
               x = x*3+1;

           System.out.println( x );
        }
    }
    
    public static void main(String[] args) {
        int x, n, i;
        Scanner leia = new Scanner( System.in );

       System.out.println( "Introduza o número de valores a gerar: " );
       n = leia.nextInt();

       System.out.println( "Introduza o valor inicial: " );
       x = leia.nextInt();

       geraNumeros( x, n );
    }
    
}
