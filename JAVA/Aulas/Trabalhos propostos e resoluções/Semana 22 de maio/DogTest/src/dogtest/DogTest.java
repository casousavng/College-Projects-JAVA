
package dogtest;

import java.util.Scanner;

public class DogTest {

   
    public static void main(String[] args) {
       Scanner leia = new Scanner(System.in); 
        
       Dog d1 = new Dog();
       
       Dog d2 = new Dog( "Pitbull", "M", 4, "white");
       
       d1.setBreed("labrador");
       
       System.out.println(d2);
       System.out.println(d1);
       
        System.out.println("Insira a idade do cao");
        int a;
        a = leia.nextInt();
        d1.setAge(a);
        
        System.out.println(d1);
        

        System.out.println( "Numero de objetos criados: " + Dog.getDogCounter() );
        
    }
    
}
