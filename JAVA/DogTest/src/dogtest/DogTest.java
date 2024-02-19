

package dogtest;

import java.util.Scanner;

public class DogTest {


    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        Dog d1 = new Dog();
        
        Dog d2 = new Dog("Pitbull","M",4,"white");
        
        System.out.println(d1);
        System.out.println("");
        
        System.out.println(d2);
        System.out.println("");
        
        System.out.print("Insira a raça do cão: ");
        String a;
        a = leia.next();
        d1.setBreed(a);
        
        System.out.print("Insira o tamanho do cão: ");
        String b;
        b = leia.next();
        d1.setSize(b);
        
        System.out.print("Insira a idade do cão: ");
        int c;
        c = leia.nextInt();
        d1.setAge(c);
        
        System.out.print("Insira a cor do cão: ");
        String d;
        d = leia.next();
        d1.setColor(d);
        
        System.out.println("");
        
        System.out.println(d1);
        
  
        
        
                
                
    }
    
}
