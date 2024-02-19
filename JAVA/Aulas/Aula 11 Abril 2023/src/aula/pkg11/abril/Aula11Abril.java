/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula.pkg11.abril;

import java.util.Scanner;

/**
 *
 * @author andresousa
 */
public class Aula11Abril {
    
    public static double area(double a, double b,double c, double p) {
                        
    return Math.sqrt(p*(p-a)*(p-b)*(p-c));
}
    
    public static double perimetro(double a,double b,double c) {
            
    return (a+b+c)/2;
            
    }

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leia = new Scanner(System.in);
        
        double a = 0, b = 0, c = 0;
        
        System.out.print("Insira o valor de (A): ");
        a = leia.nextInt();
        System.out.print("Insira o valor de (B): ");
        b = leia.nextInt();
        System.out.print("Insira o valor de (C): ");
        c = leia.nextInt();
        
        double p = perimetro(a,b,c);
        
        System.out.println("O Perimetro é de: " + perimetro(a,b,c));
        System.out.println("A Area é de: " + area(a,b,c,p));


}
}