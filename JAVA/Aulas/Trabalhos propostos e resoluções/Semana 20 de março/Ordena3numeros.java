
package ordena3numeros;

import java.util.Scanner;

public class Ordena3numeros {
    
    public static void main(String[] args) {
        Scanner leia = new Scanner( System.in );
        int x, y, z;
        
        System.out.print( "Insira o primeiro número: ");
        x = leia.nextInt();
        System.out.print( "Insira o segundo número : ");
        y = leia.nextInt();
        System.out.print( "Insira o terceiro número: ");
        z = leia.nextInt();
        
        if( x == y && x == z )
            System.out.println( "Os três números são iguais " );
        else{
            if( x == z )
                    System.out.println("Há dois números iguais: " + x );
            if( y == z )
                    System.out.println("Há dois números iguais: " + y ); 
            if( x == y )
                    System.out.println("Há dois números iguais: " + y );             
        }
                
        if( x > y )
            if( x > z )
                if( y > z )
                    System.out.println( z + " < " + y + " < " + x );
                else
                    System.out.println( y + " < " + z + " < " + x );
            else
                if (y > z)
                    System.out.println( z + " < " + x + " < " + y );
                else
                    System.out.println( y + " < " + x + " < " + z );
        else 
            if( x < z )
                if( y > z )
                    System.out.println( x + " < " + z + " < " + y );
                else
                    System.out.println( x + " < " + y + " < " + z );
            else
                if (y > z)
                    System.out.println( z + " < " + x + " < " + y );
                else
                    System.out.println( y + " < " + x + " < " + z );
    }
}
