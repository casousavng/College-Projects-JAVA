/*
 * Classe Retangulo
 * O retangulo é representado pelas coordenadas dos pontos que definem a 
 * sua diagonal : (x1, y1) e' o extremo esquerdo da diagonal e (x2, y2) e'
 * o extremo direito.
 */
package poo_exercicio1;

public class Retangulo {
    // coordenadas do extremo esquerdo da diagonal
    private double x1, y1;
    // coordenadas do extremo direito da diagonal
    private double x2, y2;
    
    // construtor sem parametros
    public Retangulo(){
        x1 = 0.0;
        y1 = 0.0;
        x2 = 0.0;
        y2 = 0.0;
    }
    
    // construtor com parametros
    public Retangulo( double x1, double y1, double x2, double y2 ){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    
    // método que retorna a base
    public double base(){
        return Math.abs(x2-x1);
    }
    
    // método que retorna a altura
    public double altura(){
        return Math.abs(y2-y1);
    }
    
    // método que retorna o perimetro
    public double perimetro(){
        return 2*base() + 2*altura();
    }
    
    // método que retorna a area
    public double area(){
        return base()*altura();
    }
}

