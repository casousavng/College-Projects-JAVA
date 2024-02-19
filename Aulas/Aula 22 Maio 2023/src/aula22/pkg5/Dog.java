/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula22.pkg5;

/**
 *
 * @author andresousa
 */
public class Dog {
    
    private String breed;
    private String size;
    private int age;
    private String color;
    
    // construtor sem paramentros
    
    public Dog(){
        breed = "";
        color = "";
        age = 0;
        size = "";
    }
    
    // construtor sem paramentros com metodo "this"
    //
    // public Dog(){
    //    this("","",0,"");
    // }
    
    
    // contrutor com paramentros
    
    public Dog(String breed, String color, int age, String size){
        this.breed = breed;
        this.color = color;
        this.age = age;
        this.size = size;
        
    }
    
        public static void main(String[] args) {
            
            int x = 123;
            
            System.out.println(x);
        
        }
    
}
