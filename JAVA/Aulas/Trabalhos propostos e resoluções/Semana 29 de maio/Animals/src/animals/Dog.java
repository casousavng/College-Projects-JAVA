
package animals;

public class Dog extends Animal {
    
    private String size;
  
    public Dog() {
        this( "", "", 0, "");
    }
    public Dog(String breed, String color, int age, String size) {
        super( breed, color, age );
        this.size = size;
    }

    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }
    @Override
    public String toString(){
        return ""+size+"\n";
    }  
    @Override
    public void print(){
        super.print();
        System.out.println("Size  : " + size );
    }
    
    public boolean sameSize(Dog d ){
        return size.equals( d.size );
    }
}

