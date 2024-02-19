/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dogteste30;

import java.util.Scanner;


/**
 *
 * @author andresousa
 */
public class DogTESTE30 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        System.out.println("Insira os dados do Dog:");
        System.out.print("Raca: ");
        String racaDog = scanner.nextLine();
        System.out.print("Cor: ");
        String corDog = scanner.nextLine();
        System.out.print("Idade: ");
        int idadeDog = scanner.nextInt();
        System.out.print("Tamanho: ");
        String tamanhoDog = scanner.next();

        Dog d1 = new Dog(racaDog, corDog, idadeDog, tamanhoDog);
        Dog d2 = new Dog("pastor", "branco", 10, "S");
        
        System.out.println("");

        System.out.println("Insira os dados do cat:");
        scanner.nextLine();
        System.out.print("Raca:");
        String racaCat = scanner.nextLine();
        System.out.print("Cor: ");
        String corCat = scanner.nextLine();
        System.out.print("Idade: ");
        int idadeCat = scanner.nextInt();
        System.out.print("Peso: ");
        int pesoCat = scanner.nextInt();
        System.out.println("");

        Cat c1 = new Cat(racaCat, corCat, idadeCat,pesoCat);
        Cat c2 = new Cat("persa","cinzento",5,10);
               
        d1.print();
        System.out.println("");
        System.out.println("");
        d2.print();
        System.out.println("");
        System.out.println("");
        c1.print();
        System.out.println("");
        System.out.println("");
        c2.print();
        System.out.println("");
        
        if( d1.mesmaRaca(d2) || d1.mesmaRaca(c1) || d1.mesmaRaca(c2) || d2.mesmaRaca(c1) || d2.mesmaRaca(c2) || d1.mesmaRaca(c2) || d2.mesmaRaca(c2) || c1.mesmaRaca(c2))
            System.out.println("Existem animais com a mesma raça.");
        else
            System.out.println("Todos os animais são de raças diferentes.");
        
        System.out.println("");
        
        if (d1.mesmoTamanho(d2))
            System.out.println("Existem 2 caes do mesmo tamanho");
        else
            System.out.println("NÂO EXISTEM CAES COM O MESMO TAMANHO.");

       
        
        System.out.println( "Numero de animais criados: " + Animal.getAnimalCounter());
        

        
        
    }
}