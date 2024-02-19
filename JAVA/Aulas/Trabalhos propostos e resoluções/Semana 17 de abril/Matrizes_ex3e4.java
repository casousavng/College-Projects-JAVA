
package exerciciosmatrizes;

import java.util.Scanner;

public class ExerciciosMatrizes {

    // método para somar as colunas de uma matriz
    // guardando o somatório num vetor 
    // o vetor v e' passado por referencia
    public static void somaDasColunas( int []v, int [][]m ){
        if( v.length == m[0].length ){
            for( int i=0; i<m[0].length; i++ ){
                v[i] = 0;
                for( int j=0; j<m.length; j++ )
                    v[i] += m[j][i]; 
            }
        }
    }
    
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        int m; // linhas da matriz
        int n; // colunas da matriz
        
        System.out.print("Insira o número de linhas da matriz: ");
        m = leia.nextInt();
        
        System.out.print("Insira o número de colunas da matriz: ");
        n = leia.nextInt();
        
        int [][]matriz = new int[m][n];
        
        // leitura de valores para a matriz
        for( int i=0; i<m; i++ ){
            for( int j=0; j<n; j++ ){
                System.out.print("matriz["+i+"]"+"["+j+"]"+" = ");
                matriz[i][j] = leia.nextInt();
            }
        }
        
        int maior = matriz[0][0];
        int menor = matriz[0][0];
        
        // procura maior e menor valor
        for( int i=0; i<m; i++ ){
            for( int j=0; j<n; j++ ){
                if( matriz[i][j] > maior )
                    maior = matriz[i][j];
                if( matriz[i][j] < menor )
                    menor = matriz[i][j];
            }
        }
        
        System.out.println("Maior = " + maior + ", Menor = " + menor );
        
        int []vetorSomas = new int[n];
        
        somaDasColunas( vetorSomas, matriz );
        
         for( int i=0; i<n; i++ ){
             System.out.println("Soma da linha "+i+" = "+ vetorSomas[i]);
         }
    }
}
