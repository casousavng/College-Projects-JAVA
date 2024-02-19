
package animals;

public class Cat extends Animal {
     
    private double weight;
  
    public Cat() {
        this( "", "", 0, 0.0);
    }
    public Cat(String breed, String color, int age, double weight) {
        super( breed, color, age );
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    @Override
    public String toString(){
        return ""+weight+"\n";
    }  
    public void print(){
        super.print();
        System.out.println("Weight: " + weight );
    }
    
    public boolean isHeavier(Cat c){
        return weight > c.weight;
    }
}

