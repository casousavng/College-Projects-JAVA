
package aula24maiodog;

public class Dog {
    
    private String breed;
    private String size;
    private int age;
    private String color;
    private static int dogCounter = 0;
    
    
    public boolean sameBreed(Dog d){
        return breed.equals(d.breed);   
    }
    
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if (size.equals("S") || size.equals("M") || size.equals("L") || size.equals("XL")){
            this.size = size;
        }
        else
            this.size = "NA"; 

    }
    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 25)
            this.age = age;
    }
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public static int getDogCounter(){
        return dogCounter;
    }
    
    public Dog() {
        this ("","",0,"");
    }
    
    public Dog(String breed, String size, int age, String color) {
        this.breed = breed;
        this.size = size;
        this.age = age;
        this.color = color;
        dogCounter++;
    }
    
    @Override
    public String toString() {
        return "Dog = {" + "breed=" + breed + ", size=" + size + ", age=" + age + ", color=" + color + '}';
    }
    
    

    
    

    
    
    
}
