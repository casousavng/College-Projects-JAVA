/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dogteste30;

class Cat extends Animal {
    int peso;

    public Cat(String raca, String cor, int idade, int peso) {
        super(raca, cor, idade);
        this.peso = peso;
    }
    
    public int getPeso(){
        return peso;
    }
    
    public void setPeso(int peso){
        this.peso = peso;
    }
    
    @Override
    public String toString() {
        return "" + peso;
        }
    @Override
    public void print(){
        super.print();
        System.out.println("Peso: " + peso);
    }
    }
