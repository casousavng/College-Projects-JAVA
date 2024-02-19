
package operadorternario;

import java.util.Scanner;

public class OperadorTernario {

    public static void main(String[] args) {
        Scanner leia = new Scanner( System.in );
        int nota;
        
        System.out.print( "Insira a nota: ");
        nota = leia.nextInt();
        
        // resolucao com if...else
        if( nota >= 10 )
            System.out.println("Parabéns!");
        else
            System.out.println("Marque novo exame.");
        
        // resolucao com operador ternario
        String s = nota>=10 ? "Parabéns!" : "Marque novo exame.";
        System.out.println( s );
        
        // resolucao com operador ternario - alternativa sem ser necessaria a variavel s
        System.out.println(nota>=10 ? "Parabéns!" : "Marque novo exame.");
    }
    
}
