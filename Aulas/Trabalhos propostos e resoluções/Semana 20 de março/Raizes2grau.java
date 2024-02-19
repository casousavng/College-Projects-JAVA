
package raizes2grau;

import java.util.Scanner;

public class Raizes2grau {

    
    public static void main(String[] args) {
        Scanner leia = new Scanner( System.in );
        double a, b, c, disc, raiz1, raiz2;
        
        System.out.print( "Insira o valor de a: ");
        a = leia.nextDouble();
        System.out.print( "Insira o valor de b: ");
        b = leia.nextDouble();
        System.out.print( "Insira o valor de c: ");
        c = leia.nextDouble();
        
        disc = Math.pow(b, 2 ) - 4*a*c;
        
        if( disc >= 0 ){
            raiz1 = (-b + Math.sqrt( disc ) ) / ( 2*a);
            raiz2 = (-b - Math.sqrt( disc ) ) / ( 2*a);
            System.out.printf("raiz 1: %6.2f\nraiz 2: %6.2f\n", raiz1, raiz2 );
        }
        else
            System.out.println("As raizes sao imaginarias");
    }
}
