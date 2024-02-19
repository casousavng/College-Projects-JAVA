/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package constroicirculo;

/**
 *
 * @author andresousa
 */
public class ConstroiCirculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Circulo circ1 = new Circulo(1.0, 1.0, 5.0);
        Circulo circ2 = new Circulo(5.0, 2.0, 3.0);
        
             
        System.out.println("O perimetro do Circulo 1 é: " + circ1.perimetro());
        System.out.println("A area do Circulo 1 é: " + circ1.area());
        System.out.println("O perimetro do Circulo 2 é: " + circ2.perimetro());
        System.out.println("A area do Circulo 2 é: " + circ2.area());
        System.out.println("");
        
        if (circ1.comparaRaio(circ2))
            System.out.println("O raio do Circulo 1 é maior.");
        else
            System.out.println("O raio do Circulo 1 é menor.");
        
        System.out.println("");
        
        // ao chamar o subprograma aumenta com o contrutor circ1 ele aumenta o parametro proposto neste caso em 2 unidade
        circ1.aumenta(2.0);        
        circ2.diminui(1.5);
        
        // ao dar este print ele ja assume o raio alterado para +2
        System.out.println("O perimetro do Circulo 1 (aumentando o raio em 2.0 unidades) é: " + circ1.perimetro());
        System.out.println("A area do Circulo 1 (aumentando o raio em 2.0 unidades) é: " + circ1.area());
        
        System.out.println("O perimetro do Circulo 2 (diminuindo o raio em 1.5 unidades) é: " + circ2.perimetro());
        System.out.println("A area do Circulo 2 (diminuindo o raio em 1.5 unidades) é: " + circ2.area());
        
        

        
        
            
                    
    }
    
}
