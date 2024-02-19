/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package filadenumeros;

/**
 *
 * @author andresousa
 */
public class FilaDeNumeros {

public static void main(String[] args) {
    
       
        // criação de uma fila - números inteiros
        Fila f = new Fila();
       
        // tenta retirar de fila vazia
        int n = f.retiraDaFila();
        
        // insere 3 elementos na fila
        f.insereNaFila(1);
        f.insereNaFila(2);
        f.insereNaFila(3);
        
        // percorre toda a fila 
        for( int i=0; i < 10; i++ ){
            System.out.println( "Elemento na posição " + i + ": " + f.mostraElemento(i)); // foi necessario adicionar o "i" neste ponto
        }
        
        // mostra o conteúdo da fila
        f.mostraFila();
        
        // retira todos os elementos da fila
        int i = 0;
        while( !f.filaVazia() )
            System.out.println("Retirou o elemento: " + f.retiraDaFila() );

        // insere 10 elementos na fila
        f.insereNaFila(10);
        f.insereNaFila(20);
        f.insereNaFila(30);
        f.insereNaFila(40);
        f.insereNaFila(50);
        f.insereNaFila(60);
        f.insereNaFila(70);
        f.insereNaFila(80);
        f.insereNaFila(90);
        f.insereNaFila(100);
       
        // não consegue inserir porque a fila está cheia
        f.insereNaFila(110);
        
        // mostra o conteúdo da fila
        f.mostraFila();
        
        // mostra o primeiro elemento da fila
        System.out.println("Primeiro da fila: " + f.mostraElemento(0));


            
    }
    
}

