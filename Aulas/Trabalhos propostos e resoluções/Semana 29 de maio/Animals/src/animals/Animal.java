
package animals;


public class Animal {
    
    private static int animalCounter = 0;
    private String breed;
    private String color;
    private int age;
  
    public Animal() {
        this( "", "", 0 );
    }
    public Animal(String breed, String color, int age ) {
        this.breed = breed;
        this.color = color;
        this.age   = age;
        animalCounter++;
    }
   
    public static int getAnimalCounter(){
        return animalCounter;
    }
    
    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if( age >=0 && age <= 25)
            this.age = age;
        else
            System.out.println("Idade inválida");
    }
    @Override
    public String toString(){
        return ""+breed+", "+color+", "+age+"\n";
    } 
    public void print(){
        System.out.println("Breed : " + breed );
        System.out.println("Color : " + color );
        System.out.println("Age   : " + age );
    }
    
    public boolean sameBreed( Animal a ){
        return breed.equals( a.breed );
    }
}
