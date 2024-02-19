/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo1;

/**
 *
 * @author andresousa
 */
class Retangulo {
    
    private double x1, y1, x2, y2;
    
    public Retangulo() {
        this(0,0,0,0);
    }

    public Retangulo(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

        // Calcula a base subtraindo o valor maior (x2) pelo menor (x1)
    public double base() {
        return Math.abs(x2 - x1);
    }
       // Calcula a altura subtraindo o valor maior (y2) pelo menor (y1)
    public double altura() {
        return Math.abs(y2 - y1);
    }
       // Calcula o perimetro aplicando os calculos obtidos da base e da altura aplicando a formula do calculo do perimetro do retangulo (2*base + 2*altura)
    public double perimetro() {
        return (2 * base()) + (2 * altura());
    }
      // Calcula a area aplicando os calculos obtidos da base e da altura aplicando a formula do calculo da area do retangulo (base * altura)   
    public double area() {
        return base() * altura();
    }
}
