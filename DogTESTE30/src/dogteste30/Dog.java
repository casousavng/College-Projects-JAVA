/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dogteste30;

class Dog extends Animal {
    String tamanho;

    public Dog(String raca, String cor, int idade, String tamanho) {
        super(raca, cor, idade);
        this.tamanho = tamanho;
    }
    
    public String getTamanho(){
        return tamanho;
    }
    
    public void setTamanho(String tamanho){
        this.tamanho = tamanho;
    }
    
    public boolean mesmoTamanho(Dog a1){
        return tamanho.equals( a1.tamanho);
    }
        
    @Override
    public String toString() {
        return "" + tamanho;
        }
    @Override
    public void print(){
        super.print();
        System.out.print("Tamanho: " + tamanho);
    }
    }
    


