
package dogs;


public class Dogs {
    
    public static void main(String[] args) {
        
        // d1 instanciado usando o construtor sem parâmetros
        Dog d1 = new Dog();
        
        // d2 instanciado usando o construtor com parâmetros
        Dog d2 = new Dog( "Pitbull", "White", 2, "M");
        
        // d3 e d4 instanciados usando o construtor sem parâmetros
        Dog d3 = new Dog();
        Dog d4 = new Dog();
        
        // escreve o numeros de objetos criados
        System.out.println("Dogs created: " + Dog.getDogCounter() );
        
        // atribui valores aos atributos de d1
        d1.setBreed("doberman");
        d1.setColor( "black");
        d1.setAge( 5 );
        d1.setSize( "XL") ;
        
        // verifica se os objetos d1 e d2 possuem o mesmo valor no atributo breed
        if( d1.sameBreed(d2) )
            System.out.println("Mesma raça");
        else
            System.out.println("Raças diferentes");
        
        System.out.println("");
        
        // tentativa de alterar o atributo size de d2 com um valor invalido
        d2.setSize("Large");
        System.out.println(d2);
        
        // alteracao do atributo size de d2 com um valor valido
        d2.setSize("L");
        System.out.println(d2);
    }
}
