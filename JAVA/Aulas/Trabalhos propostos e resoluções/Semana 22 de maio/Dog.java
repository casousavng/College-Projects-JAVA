package dogs;

public class Dog {
    
    // variaveis de instancia
    private String breed;
    private int age;
    private String color;
    private String size;

    // construtores
    public Dog() {
        breed = "";
        age = 0;
        color = "";
        size = "";
    }

    public Dog(String breed, int age, String color, String size) {
        this.breed = breed;
        this.age = age;
        this.color = color;
        this.size = size;
    }

    // metodos de acesso
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if( age < 0 )
            age = 0;
        else
            this.age = age;
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

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    
    // outros metodos
    @Override
    public String toString() {
        return "Dog{" + "breed=" + breed + ", age=" + age + ", color=" + color + ", size=" + size + '}';
    }
   
}
