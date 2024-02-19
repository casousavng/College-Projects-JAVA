/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dogteste30;

public class Animal {
    
    private static int animalCounter = 0;
    
    private String raca;
    private String cor;
    private int idade;

    public Animal(String raca, String cor, int idade) {
        this.raca = raca;
        this.cor = cor;
        this.idade = idade;
        animalCounter ++;
    }

    public static int getAnimalCounter(){
        return animalCounter;
        }
    
    public void print(){
        System.out.println("Raca: " + raca );
        System.out.println("Cor: " + cor );
        System.out.println("Idade: " + idade );
    }
        
    public boolean mesmaRaca(Animal a1){
        return raca.equals( a1.raca );
    }

        
        
}







