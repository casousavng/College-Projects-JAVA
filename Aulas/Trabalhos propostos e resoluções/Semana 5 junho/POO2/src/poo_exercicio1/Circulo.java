/*
 * Classe Circulo
 */
package poo_exercicio1;

import java.awt.Graphics;

public class Circulo {
    
    // variaveis de instancia (atributos)
    private double x, y;
    private double raio;
    
    // construtor sem parametros
    public Circulo(){
        x = 0;
        y = 0;
        raio = 0;
    }
    
    // construtor com parametros
    public Circulo( double x, double y, double raio ){
        this.x = x;
        this.y = y;
        this.raio = raio;
    }
    
    // métodos de acesso: get e set por cada variável de instância
    public double getX(){
        return x;
    }
    
    public void setX( int x ){
        this.x = x;
    } 
    
    public double getY(){
        return y;
    }
    
    public void setY( int y ){
        this.y = y;
    } 
    
    public double getRaio(){
        return raio;
    }
    
    public void setRaio( int raio ){
        this.raio = raio;
    } 
    
    // metodo de instancia para calculo do perimetro
    public double perimetro(){
        return Math.PI * 2 * raio;
    }
    
    // metodo de instancia para calculo da area
    public double area(){
        return Math.PI * raio * raio;
    }
    
    // metodo de instancia para incremento do raio
    public void aumentaRaio( double incremento ){
        raio += incremento;
    }
    
    // metodo de instancia para decremento do raio
    public void diminuiRaio( double decremento ){
        raio -= decremento;
    }
    
    // metodo de instancia para verificar se o raio do circulo é maior do
    // o raio de um circulo passado por parametro
    public boolean raioMaiorQue( Circulo c ){
        return raio > c.raio ? true : false;
        // pode-se escrever apenas return raio > c.raio;
    }
    
    // escreve os atributos do circulo
    public void escreveCirculo(){
        System.out.println( "Centro: " + x + ", " + y );
        System.out.println( "Raio  : " + raio );
    }
    
    // converter para String
    @Override
    public String toString(){   
        return "Centro (" + x + ", " + y + "), Raio " + raio;
    }
}

