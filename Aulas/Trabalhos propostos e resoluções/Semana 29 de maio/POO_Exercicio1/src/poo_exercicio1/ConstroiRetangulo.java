/*
 * Teste da classe Retangulo
 */
package poo_exercicio1;

public class ConstroiRetangulo {
    
    public static void main(String[] args) {
        
        // criar o retangulo de coordenadas 2.0, 1.0, 4.0, 5.0
        // r e' uma instancia da classe retangulo
        Retangulo r = new Retangulo( 2.0, 1.0, 4.0, 5.0 );
        
        System.out.println( "Base     : " + r.base() );
        System.out.println( "Altura   : " + r.altura() );
        System.out.println( "Perimetro: " + r.perimetro() );
        System.out.println( "Area     : " + r.area() );
        

    }
}
