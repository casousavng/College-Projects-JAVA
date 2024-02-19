/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula2maio;

/**
 *
 * @author andresousa
 */
public class Aula2maio {
    
    
    /*public static int soma (int a, int b){
       
         if (b == 0 )
             return a;
         else 
             return 1 + soma(a,b-1);
         }
    */
    
    /*public static void p(int n){
        if (n > 0){
            p(n-2);
            System.out.println(n);
            p(n-1);
        }
    }
    */
    
    
    
    // no exercicio abaixo escreves uma algoritmo que pesquisa e conta quantas vezes um determinado valor esta contido no vetor
    
    public static void ecreveVetor(int []x){
        for (int i = 0; i<x.length; i++)
            System.out.println(x[i]);
    }
    
    public static void escreverVetorRecursivo(int []x, int i){
    
        System.out.println(x[i]);
        if (i != x.length -1)
            escreverVetorRecursivo(x, i+1);     
    }
    
    public static int contaElemento(int[]v, int elemento, int i){
        if (i ==v.length)
            return 0;
        else
            if (elemento == v[i])
                return 1 + contaElemento(v, elemento, i+1);
            else
                return contaElemento(v, elemento, i+1);
    }
    
    
            
            
    public static void main(String[] args) {
        
       // System.out.println(soma(5,3));
        
       // p(4);
       
       int v[] = {5,4,3,2,1};
       escreverVetorRecursivo(v, 0);
       
       System.out.println("Contagem: " + contaElemento(v, 1, 0));
       
       
    }
    
}


