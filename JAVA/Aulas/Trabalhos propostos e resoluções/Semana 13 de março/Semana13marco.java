
package semana13marco;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Semana13marco {

    public static void main(String[] args) {
    
        // exercicio 1
        double a = 4.78905, b = 4.7, c = 5.8954, d = 5.0;
     
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        
        System.out.printf("a = %.2f\n",  a);
        System.out.printf("b = %.2f\n",  b);
        System.out.printf("c = %.2f\n",  c);
        System.out.printf("d = %.2f\n",  d);
        
        // exercicio2
        System.out.println();
        double d2 = 0.456789;
        
        System.out.printf("d2 = %.3f %s",  d2*100, "%\n" );
        System.out.printf("d2 = %.2f %s",  d2*100, "%\n" );
        System.out.printf("d2 = %.1f %s",  d2*100, "%\n" );
        
        // exercicio3
        System.out.println();
        double d3 = 0.456789;
        
        System.out.printf("d2 = %7.2f %s",  d3*100, "%\n" );
        System.out.printf("d2 = %10.2f %s", d3*100, "%\n" );
        System.out.printf("d2 = %3.2f %s",  d3*100, "%\n" );
        
        // exercicio4
        System.out.println();
        Scanner leia = new Scanner( System.in );
        double a4, b4, media4;
        
        System.out.print("Insira o primeiro numero: ");
        a4 = leia.nextDouble();
        System.out.print("Insira o segundo numero: ");
        b4 = leia.nextDouble();
        
        media4 = (a4 + b4) / 2;
        System.out.printf("media = %.3f\n",  media4 );
        
        // exercicio5
        System.out.println();
        double a5, b5, media5;
        
        a5 = Double.parseDouble( JOptionPane.showInputDialog(null, "Insira o primeiro numero: ") );
        b5 = Double.parseDouble( JOptionPane.showInputDialog(null, "Insira o segundo numero: ") );
        
        media5 = (a5 + b5) / 2;
        
        JOptionPane.showMessageDialog( null, String.format("media = %.3f\n",  media5 ) );
        
        // exercicio6
        System.out.println();
        // sem controlar o tamanho das strings
        System.out.printf("%s %s\n",  "Nome", "Morada" );
        System.out.printf("%s %s\n",  "Pedro", "Porto" );
        System.out.printf("%s %s\n",  "Ana", "Gaia" );
        System.out.printf("%s %s\n",  "Mariana", "Coimbra" );
        
        System.out.println();
        // com tamanho das strings fixo - 10 caracteres
        System.out.printf("%10s%10s\n",  "Nome", "Morada" );
        System.out.printf("%10s%10s\n",  "Pedro", "Porto" );
        System.out.printf("%10s%10s\n",  "Ana", "Gaia" );
        System.out.printf("%10s%10s\n",  "Mariana", "Coimbra" );
        
        // exercicio7
        System.out.println();
        System.out.printf("%-10s%-10s\n",  "Nome", "Morada" );
        System.out.printf("%-10s%-10s\n",  "Pedro", "Porto" );
        System.out.printf("%-10s%-10s\n",  "Ana", "Gaia" );
        System.out.printf("%-10s%-10s\n",  "Mariana", "Coimbra" );
        
        // exercicio8
        JOptionPane.showMessageDialog( null, String.format("%-10s\t%10s\n",  "Nome", "Morada") + 
                                             String.format("%-10s\t%10s\n",  "Pedro", "Porto") +
                                             String.format("%-10s\t%10s\n",  "Ana", "Gaia") +
                                             String.format("%-10s\t%10s\n",  "Mariana", "Coimbra"));        
    }
    
}
