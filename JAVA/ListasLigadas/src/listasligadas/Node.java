/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listasligadas;

/**
 *
 * @author andresousa
 */
public class Node {
    
    private int numero;
    private Node proximo;
    
    public Node(){
        numero = 0;
        proximo = null;
    }
    
    public Node(int numero) {
        this.numero = numero;
        this.proximo = null;    
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Node getProximo() {
        return proximo;
    }

    public void setProximo(Node proximo) {
        this.proximo = proximo;
    }
    
    


    
    
    
    
    

    
    
    
    
    
}
