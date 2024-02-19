
package vetor10inteiros;

import java.util.Scanner;

public class Vetor10inteiros {
    
    public static void main(String[] args) {
        Scanner leia = new Scanner( System.in);
        int []v = new int[10];
        
        System.out.println("Leitura de elementos:");
        for( int i=0; i<v.length; i++){
            System.out.print("Elemento " + i + ": ");
            v[i] = leia.nextInt();
        }
        
        System.out.println("Soma dos elementos:");
        int soma = 0;
        for( int i=0; i<v.length; i++)
            soma += v[i];
        System.out.println(soma);
        
        System.out.println("Média dos elementos:");
        double media = (double)soma / v.length;
        System.out.printf( "%-6.2f\n", media );
        
        System.out.println("Maior elemento:");
        int maior = v[0];
        for( int i=1; i<v.length; i++)
            if( v[i] > maior )
                maior = v[i];
        System.out.println(maior);

        System.out.println("Número de ocorrências:");       
        System.out.print("Valor a procurar? ");
        int valor = leia.nextInt();
        int contador = 0;
        for( int i=0; i<v.length; i++)
            if( v[i] == valor )
                contador++;
        System.out.println("Ocorrências = " + contador);
    }
}
