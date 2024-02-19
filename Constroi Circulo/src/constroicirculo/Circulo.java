/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package constroicirculo;

/**
 *
 * @author andresousa
 */
public class Circulo {
   
    private double x;
    private double y;
    private double raio;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }
    
    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public Circulo() {
    }

    public Circulo(double x, double y, double raio) {
        this.raio = raio;
        this.x = x;
        this.y = y;
    }
    
    public double perimetro() {
        return (2*Math.PI)*raio;
    }
    
    public double area() {
        return Math.PI*(raio*raio);
    }
    
    // tem de ser void porque ele nao retorna o valor apenas assume o novo valor do raio como sendo raio + mais
    public void aumenta(double raioMais) {
        raio = (raio + raioMais);
    }

    public void diminui(double raioMenos) {
        raio = (raio - raioMenos);
    }
    
    public boolean comparaRaio(Circulo c){
        return perimetro() > c.perimetro();
        


    }

    
}

