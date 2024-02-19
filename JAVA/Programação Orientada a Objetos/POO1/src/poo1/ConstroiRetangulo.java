/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo1;

/**
 *
 * @author andresousa
 */
class ConstroiRetangulo {
    
    public void medidas() {
        
        Retangulo ret1 = new Retangulo(2.0, 1.0, 4.0, 5.0);
             
        System.out.println("A medida da Base é: " + ret1.base());
        System.out.println("A medida da Altura é: " + ret1.altura());
        System.out.println("O Perímetro total é: " + ret1.perimetro());
        System.out.println("A Área total é: " + ret1.area());
    }
}