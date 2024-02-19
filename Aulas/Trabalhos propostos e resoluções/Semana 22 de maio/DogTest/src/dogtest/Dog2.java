
package dogtest;


public class Dog {
    
    // variavel de classe - contador de objetos criados
    private static int dogCounter = 0;

    // variaveis de instancia
    private String breed;
    private String size;
    private int age;
    private String color;

    // construtor sem parametros
    public Dog() {
        // chama o outro construtor parametros nulos
        Dog("", "", 0, "");
    }

    // construtor com parametros
    public Dog(String breed, String size, int age, String color) {
        this.breed = breed;
        this.size = size;
        this.age = age;
        this.color = color;
        dogCounter++;
    }

    // metodo de classe para acesso a variavel de classe
    public static int getDogCounter(){
        return dogCounter;
    }

    // metodos de acesso (sao metodos de instancia)
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
        if( age>=0 && age <= 25)
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

    // metodo para sobrecarga (override) do metodo toString (metodo pre-definido)
    @Override
    public String toString() {
        return "Dog{" + "breed=" + breed + ", size=" + size + ", age=" + age + ", color=" + color + '}';
    }

}
