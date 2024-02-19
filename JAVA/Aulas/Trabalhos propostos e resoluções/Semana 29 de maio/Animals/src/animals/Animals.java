
package animals;

public class Animals {

    public static void main(String[] args) {
        
        Animal a1 = new Animal();
        Animal a2 = new Cat( "Persian", "White", 3, 3.5 );
        
        Dog d1 = new Dog( "Pitbull", "White", 2, "M" );
        Dog d2 = new Dog( "Doberman", "Black", 5, "XL" );
        
        Cat c1 = new Cat( "Persian", "Grey", 4, 4.1 );
        Cat c2 = new Cat( "Siamese", "White", 2, 3.8 );
        
        a1.print();
        System.out.println("");
        
        a2.print();
        c1.print();
        if( a2.sameBreed(c1) )
            System.out.println("É da mesma raça");
        else
            System.out.println("São de raças diferentes");
        
        System.out.println("");
        
        d1.print();
        d2.print();
        if( d1.sameSize(d2) )
            System.out.println("É do mesmo tamanho");
        else
            System.out.println("São de tamanhos diferentes");
          
        System.out.println("");
        
        c1.print();
        c2.print();
        if( c1.isHeavier(c2) )
            System.out.println("É mais pesado");
        else
            System.out.println("Não é mais pesado");
        
        System.out.println("");
          
        System.out.println("Total de animais: " + Animal.getAnimalCounter() );
        // Obtem-se o mesmo resultado chamando o método getAnimalCounter()
        // a partir das subclasses
        System.out.println("Total de animais: " + Cat.getAnimalCounter() );
        System.out.println("Total de animais: " + Dog.getAnimalCounter() );
        
        // array do tipo Animal com 4 elementos
        Animal []animals = new Animal[4];
        
        // os elementos do array podem ser objetos Dog ou Cat
        animals[0] = c1;
        animals[1] = d1;
        animals[2] = c2;
        animals[3] = d2;
        
        System.out.println("\nConteúdo do array:");
        for( Animal a : animals ){
            a.print();
            System.out.println("");
        }
    }
}
