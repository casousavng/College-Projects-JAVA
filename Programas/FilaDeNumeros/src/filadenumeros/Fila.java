/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package filadenumeros;

/**
 *
 * @author andresousa
 */
public class Fila {
    
    int []vetor = new int[10];
    int tamanho = 0;
    
    public int retiraDaFila(){
        
        int valor = -1;
    
        if (filaVazia()) {
            System.out.println("A fila está vazia!");
        } 
        else {
            valor = vetor[0];
            for (int i = 0; i < tamanho-1; i++) {
                vetor[i] = vetor[i+1];
            }
	   tamanho--;
	}

    return valor;
    } 
    
    public void insereNaFila(int valor){
        
        if (vetor.length == tamanho)
            System.out.println("A fila está cheia!");
        else
            vetor[tamanho++] = valor;
    }
    
    public int mostraElemento(int elemento){
        
        return vetor[elemento];
    }
    
    public boolean filaVazia(){
        
        return tamanho == 0;
    }
    
    public void mostraFila(){
        
        System.out.println("A fila é composta por:");
        
        for (int i = 0; i < vetor.length; i++){
            System.out.println(vetor[i]);
            
        }
        
    }

    

    
}
