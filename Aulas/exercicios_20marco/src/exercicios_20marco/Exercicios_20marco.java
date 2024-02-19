
package exercicios_20marco;

import java.util.Scanner;



public class Exercicios_20marco {

    public static void main(String[] args) {
        // TODO code application logic here
        
    // EXERCICIO 1    
        
        Scanner num = new Scanner (System.in);
        System.out.print("Insira o primeiro numero: ");
        int n1 = num.nextInt();
        System.out.print("Insira segundo numero: ");
        int n2 = num.nextInt();
        System.out.print("Insira terceiro numero: ");
        int n3 = num.nextInt();
               
        
        
        if (n1 > n2 && n1 > n3 && n2 > n3)
            System.out.println("N1=" + n1 + " > " + "N2=" + n2 + " > " + "N3=" + n3);
        else
            if (n2 > n1 && n2 > n3 && n1 > n3)
                System.out.println("N2=" + n2 + " > " + "N1=" + n1 + " > " + "N3=" + n3);
                else
                    if (n3 > n1 && n3 > n2 && n2 > n1)
                        System.out.println("N3=" + n3 + " > " + "N2=" + n2 + " > " + "N1=" + n1);
                    else
                        System.out.println("N3=" + n3 + " > " + "N1=" + n1 + " > " + "N2=" + n2);
                
         
        
        
        
        
      // EXERCICIO 2
      
      
        Scanner raiz = new Scanner (System.in);
        System.out.print("Insira o valor de A: ");
        double a = num.nextDouble();
        System.out.print("Insira o valor de B: ");
        double b = num.nextDouble();
        System.out.print("Insira o valor de C: ");
        double c = num.nextDouble();
        
        double descriminante = Math.pow(b,2)-4*(a*c);
        System.out.println(descriminante);
        
        double resultado1 = 0;
        double resultado2 = 0;
      
        if (descriminante < 0)
            System.out.println("As raizes são imaginarias!");
            else
                resultado1 = (-b - (Math.sqrt((Math.pow(b,2))-4*a*c))) / 2*a;
                System.out.print(resultado1);
                resultado2 = (-b + (Math.sqrt((Math.pow(b,2))-4*a*c))) / 2*a;
                System.out.print(resultado2);
        
            
               
        
         
    }
    
}
