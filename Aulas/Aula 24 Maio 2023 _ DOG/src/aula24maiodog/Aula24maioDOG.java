/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula24maiodog;

import java.util.Scanner;

/**
 *
 * @author andresousa
 */
public class Aula24maioDOG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        Dog d1 = new Dog();
        
        Dog d2 = new Dog("Pintbull", "White", 2, "M");
        
        Dog d3 = new Dog();
        
        d3.setBreed("Doberman");
        d3.setColor("Black");
        d3.setAge(5);
        d3.setSize("XL");
        
        System.out.print("Insira a raça do cão: ");
        String a;
        a = leia.next();
        d1.setBreed(a);
        
        System.out.print("Insira o tamanho do cão: ");
        String b;
        b = leia.next();
        d1.setSize(b);
        
        System.out.print("Insira a idade do cão: ");
        int c;
        c = leia.nextInt();
        d1.setAge(c);
        
        System.out.print("Insira a cor do cão: ");
        String d;
        d = leia.next();
        d1.setColor(d);
        
        System.out.println("");
        
        if (d1.sameBreed(d3))
            System.out.println("São da mesma raça.");
        else
            System.out.println("São de raças diferentes");
           
        
        System.out.println(d1);
        System.out.println("Dogs created: " + Dog.getDogCounter());
             
                
    }
    
}
