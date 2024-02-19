

package dogtest;

public class Dog {
    
    private String breed;
    private String size;
    private int age;
    private String color;


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
        if (age < 0)
            age = 0;
        else
            this.age = age;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
            this.size = size;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    
    public Dog() {
        breed = "";
        size = "";
        age = 0;
        color = "";
    }
    
    public Dog(String breed, String size, int age, String color) {
        this.breed = breed;
        this.size = size;
        this.age = age;
        this.color = color;
    }
    
    @Override
    public String toString() {
        return "Dog = {" + "breed=" + breed + ", size=" + size + ", age=" + age + ", color=" + color + '}';
    }
    
    

    
    

    
    
    
}
