
package ficheirosjava;

import java.io.IOException;
import java.util.Scanner;

public class FicheirosJava {

     public static void main(String[] args) throws IOException{
         
        Scanner leia = new Scanner( System.in );
        Ficheiro f1 = new Ficheiro();
        Ficheiro f2 = new Ficheiro();
        String linha;
        
        System.out.println( "Qual o nome do ficheiro para escrever?" );
        f1.abreEscrita( leia.nextLine() );    // ficheiro para escrita
        
        // introduz as linhas para o ficheiro fxw.txt
        // termina quando for lida a palavra "fim"
        
        
        System.out.println( "Teste com ficheiros:");
        do{
            System.out.println( "Introduza uma linha para o ficheiro:");
            linha = leia.nextLine();
            f1.escreveLinha(linha);
        } while( !linha.equals("fim"));
        
        f1.fechaEscrita();   // Necessario senao o ficheiro fica vazio
        
        System.out.println( "Qual o nome do ficheiro para ler?" );
       
        f2.abreLeitura( leia.nextLine() );   // ficheiro para leitura
        
        // le o conteudo do ficheiro
        do{
            linha = f2.leLinha();
            if( linha != null )
                System.out.println( "Linha lida do ficheiro: "+linha);
        }while( linha != null );
    }
}
