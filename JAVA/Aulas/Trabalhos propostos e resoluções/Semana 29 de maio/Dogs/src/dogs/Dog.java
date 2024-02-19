
package dogs;

public class Dog {
    
    // variavel de classe
    private static int dogCounter = 0;
    
    // variaveis de instancia
    private String breed;
    private String color;
    private int age;
    private String size;
  
     // construtor sem parâmetros
    public Dog() {
        // chama o outro construtor
        this( "", "", 0, "");
    }
    // construtor com parâmetros (com validacao do atributo size)
    public Dog(String breed, String color, int age, String size) {
        this.breed = breed;
        this.color = color;
        this.age   = age;
        switch( size ){
            case "S":
            case "M":
            case "L":
            case "XL":
                this.size = size;
                break;
            default:
                this.size = "";
        }
        dogCounter++;
    }
    
    // metodo de classe
    public static int getDogCounter(){
        return dogCounter;
    }
    
    // metodos de acesso (sao tambem metodos de instancia)
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
        this.age = age;
      
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        switch( size ){
            case "S":
            case "M":
            case "L":
            case "XL":
                this.size = size;
                break;
            default:
                System.out.println("Invalid size!");
                this.size = "";
        }
    }
    
    // outros metodos de instancia
    
    // sobrecarga (override) do metodo toString
    // constroi uma string com os valores dos atributos de um objeto
    @Override
    public String toString(){
        return ""+breed+", "+color+", "+age+", "+size+"\n";
    }
    
    // escreve todos os atributos de um objeto
    public void print(){
        System.out.println("Breed: " + breed );
        System.out.println("Color: " + color );
        System.out.println("Age  : " + age );
        System.out.println("Size : " + size );
    }
    
    // metodo para verificar se dois caes sao da mesma raca
    public boolean sameBreed(Dog d ){
        return breed.equals( d.breed );
    }
}
