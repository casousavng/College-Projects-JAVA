/*
    Le sucessivamente uma sequencia de strings até ser lida a string "FIM"
    Conta as strings iniciadas por por um prefixo inserido pelo utilizador
    Apresenta também o total de strings lidas
*/
    
package containiciaisstrings;

import java.util.Scanner;

public class ContaIniciaisStrings {
    
    // metodo que verifica se a string inicia por por um prefixo
    // retorna o contador incrementado em caso afirmativo
    public static int contaIniciais( String s, String p, int c ){
        
        if( s.startsWith(p) )
            c++;
        return c;
    }
    
    public static void main(String[] args) {
        
        Scanner leia = new Scanner( System.in );
        String str, prefixo;
        
        // contador do total de strings lidas
        int total = 0;
        
        // contador de strings iniciadas pelo prefixo 
        int conta = 0;
        
        System.out.println( "Insira o prefixo:" );
        prefixo = leia.nextLine().toUpperCase();
        
        do{
            total++;
            System.out.println( "Insira uma string ou FIM para terminar: ");
            str = leia.nextLine().toUpperCase();
            conta = contaIniciais( str, prefixo, conta );
            
        } while( !str.equals("FIM"));
     
        System.out.printf( "Encontradas %d strings iniciadas por %s ", conta, prefixo );
        System.out.printf( "num total de %d strings lidas\n", total );
    }
    
}
