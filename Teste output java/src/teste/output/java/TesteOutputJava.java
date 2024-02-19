
package teste.output.java;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class TesteOutputJava {

    public static void main(String[] args) {
        
        int i = 10;
        double h = 5.2;
        char f = 'F';
        String s = "Olá";
        
        System.out.printf("i=%d,H=%f,F=%c,s=%s\n", i,h,f,s);
        System.out.println("");
        
        double a1 = 4.78905, a2 = 4.7, a3 = 5.8954, a4 = 5.0;
  
        System.out.printf("a1=%.2f,a2=%.2f,a3=%.2f,a4=%.2f\n", a1,a2,a3,a4);
        System.out.println("");
        
        
        double a = 4.78905;
        String numero1 = String.format("O numero formatado a duas casas decimais é: %,.2f", a);
        System.out.println(numero1);
        
        double b = 4.7;
        String numero2 = String.format("O numero formatado a duas casas decimais é: %,.2f", b);
        System.out.println(numero2);
        
        double c = 5.8954;
        String numero3 = String.format("O numero formatado a duas casas decimais é: %,.2f", c);
        System.out.println(numero3);
        
        double d = 5.0;
        String numero4 = String.format("O numero formatado a duas casas decimais é: %,.2f", d);
        System.out.println(numero4);
        
        System.out.println("");
        
        //exercicio 2
        double d2 = 0.456789;
        
        System.out.printf("d2 = %.3f %s", d2*100, "%\n");
        System.out.printf("d2 = %.2f %s", d2*100, "%\n");
        System.out.printf("d2 = %.1f %s", d2*100, "%\n");
        System.out.println("");
        
        // exercicio 3
        System.out.println("");
        
        double d3 = 0.456789;
        
        System.out.printf("d3 = %7.2f %s", d2*100, "%\n");
        System.out.printf("d3 = %10.2f %s", d2*100, "%\n");
        System.out.printf("d3 = %3.2f %s", d2*100, "%\n");
        System.out.println("");
        
        //exercicio 4
        
        Scanner num = new Scanner (System.in);
        System.out.print("Insira um numero: ");
        double n1 = num.nextDouble();
        System.out.print("Insira um numero: ");
        double n2 = num.nextDouble();
        System.out.printf("Media = %.3f %s", (n1+n2)/2, "\n");
        System.out.println("");
        
        // exercicio 5
        
        
        double x1, x2, media5;
    
        x1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o primeiro numero: "));
        x2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o segundo numero: "));
        
        media5 = (x1 + x2) / 2;
    
        JOptionPane.showMessageDialog(null, String.format("Media = %.3f\n", media5));
        
        
        // exercicio 6
        
        System.out.println("");
 
        System.out.printf("%s %s\n", "Nome","Morada");
        System.out.printf("%s %s\n", "Pedro","Porto");
        System.out.printf("%s %s\n", "Ana","Gaia");
        System.out.printf("%s %s\n", "Mariana","Coimbra");
        System.out.println("");
        
        System.out.printf("%10s %10s\n", "Nome","Morada");
        System.out.printf("%10s %10s\n","Pedro","Porto");
        System.out.printf("%10s %10s\n", "Ana","Gaia");
        System.out.printf("%10s %10s\n", "Mariana","Coimbra");
        System.out.println("");
        
        System.out.printf("%-10s %-10s\n", "Nome","Morada");
        System.out.printf("%-10s %-10s\n","Pedro","Porto");
        System.out.printf("%-10s %-10s\n", "Ana","Gaia");
        System.out.printf("%-10s %-10s\n", "Mariana","Coimbra");
        System.out.println("");
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
