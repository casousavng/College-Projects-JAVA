/*
 * Teste da classe Circulo
 */
package poo_exercicio1;

public class ConstroiCirculo {
    
    public static void main(String[] args) {
        
        // cria duas instância da classe Circulo
        Circulo c1 = new Circulo( 1.0, 1.0, 5.0 );
        Circulo c2 = new Circulo( 5.0, 2.0, 3.0 );
        
        // escreve o circulo (primeira instancia) e o respetivo perimetro e area
        System.out.println( "Primeira instancia");
        c1.escreveCirculo();
        System.out.println( "Perimetro: " + c1.perimetro() + " Area: " + c1.area());
        
        System.out.println();
        
        // escreve o circulo (segunda instancia) e o respetivo perimetro e area
        System.out.println( "Segunda instancia");
        c2.escreveCirculo();
        System.out.println( "Perimetro: " + c2.perimetro() + " Area: " + c2.area());
        
        System.out.println();
                
        // aumenta o raio da primeira instância usando o valor 2.0
        c1.aumentaRaio( 2.0 );
        
        // diminui o raio da segunda instância usando o valor 1.5
        c2.diminuiRaio(1.5 );
        
        // escreve o circulo e o respetivo perimetro e area
        // para escrever o circulo usa os métodos de acesso
        System.out.println( "Primeira instancia");
        System.out.println( "Centro: " + c1.getX() + ", " + c1.getY() );
        System.out.println( "Raio  : " + c1.getRaio() );
        System.out.println( "Perimetro: " + c1.perimetro() + " Area: " + c1.area());
        
        System.out.println();
        
        // escreve o circulo e o respetivo perimetro e area
        // para escrever o circulo usa os métodos de acesso
        System.out.println( "Segunda instancia");
        System.out.println( "Centro: " + c2.getX() + ", " + c2.getY() );
        System.out.println( "Raio  : " + c2.getRaio() );
        System.out.println( "Perimetro: " + c2.perimetro() + " Area: " + c2.area());
        
        System.out.println();
        
        // verifica se o raio da primeira instância é maior do que o raio da segunda
        if( c1.raioMaiorQue( c2 ) == true )
            System.out.println( "O raio da primeira instância é maior");
        else
            System.out.println( "O raio da primeira instância é menor ou igual");
     
        System.out.println();
        
        // escreve as instancias usando o metodo escreveCirculo
        System.out.println("Escreve com metodo escreveCirculo()");
        c1.escreveCirculo();
        c2.escreveCirculo();
        
        System.out.println();
        
        // escreve as instancias com System.out.println()
        // o formato é o que estiver definido no metodo toString da classe Circulo
        System.out.println("Escreve com System.out.println()");
        System.out.println(c1);
        System.out.println(c2);
        
        // desenho de um circulo através da classe Desenha
        Circulo c3 = new Circulo( 300, 300, 200 );
        Circulo c4 = new Circulo( 500, 600, 100 );
        Circulo c5 = new Circulo( 600, 600, 50 );
        
        new Desenha( c3 );
        new Desenha( c4 );
        new Desenha( c5 );
        
        
        
    }
    
    
    
}
