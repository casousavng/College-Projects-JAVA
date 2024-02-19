/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listasligadas;
import java.util.Scanner;

/**
 *
 * @author andresousa
 */
public class ListasLigadas {
    
    public static Node inicio = new Node();
    
    public static Node insereInicio(Node inicio, Node novo){
        
        novo.setProximo(inicio);
        inicio = novo;
        
        return novo;
    }
    
    public static Node insereFim(Node inicio, Node novo){
        if( inicio == null ){
            inicio = novo;
        }
        else{
            Node n = inicio;
            while( n.getProximo() != null ){
                n = n.getProximo();
            }
            n.setProximo(novo);
        }
    return inicio;
    }
    
    public static void listar(Node inicio){
        if( inicio == null ){
            System.out.println( "A lista está vazia!");
        }
        if( inicio != null ){
            System.out.print( inicio.getNumero() + " -> " );
            inicio.setProximo(inicio);
        }
        System.out.println( "null");
    }
    
    public static void listarRecursivo(Node inicio){
        if( inicio != null ){
            System.out.print( inicio.getNumero() + " -> " );
            listarRecursivo( inicio.getProximo() );
        }
        else
            System.out.println( "null");
    }
    
    public static int pesquisaValor( Node inicio, int valor ){
        int posicao = 1;
        if( inicio == null )
            System.out.println( "A lista está vazia!" );
        else{
            while(inicio != null )
            if( inicio.getNumero() != valor ){
                posicao++;
                inicio = inicio.getProximo();
            } else
                return posicao;
        }
            return 0; 
    }
    
    
    public static int eliminarFim(){
    int fim = -1;
        if (inicio.getProximo()==null) {
			fim=inicio.getNumero();
			inicio=null;
		} else {
			Node aux1 = inicio;
			Node aux2 = null;
			while (aux1.getProximo() != null){
				aux2=aux1;
				aux1=aux1.getProximo();
			}
			fim = aux1.getNumero();
			aux2.setProximo(null);
		}
	    return fim;
	 }
    
    
   


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                
        Scanner leia = new Scanner(System.in);
        
        System.out.print("Insira valores para iniciar (escolha 0 para terminar): ");
        int numeroInicio = leia.nextInt();
        
        Node novo = new Node(numeroInicio);
        
        insereInicio(inicio,novo);
        
        System.out.print("Qual o numero inteiro a adicionar no fim: ");
        int numeroFim = leia.nextInt();
        
        insereFim(inicio,novo);
        
        System.out.println("A sua lista esta desta forma: ");
        listar(inicio);
        
        System.out.println("A sua lista apresentada de forma recursiva esta: ");
        listarRecursivo(inicio);
        
        System.out.println("Qual o valor que pretende pesquisar: ");
        int valor = leia.nextInt();
        pesquisaValor(inicio,valor);
        
        System.out.println("O valor que constava no final da lista foi eliminado.");
        eliminarFim();   
        
        
        
        
        
        
        
        /*

        

        
 
        

    
        

       
        
        */
        

    }
}
    

