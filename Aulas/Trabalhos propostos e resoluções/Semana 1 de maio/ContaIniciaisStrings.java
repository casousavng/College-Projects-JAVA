/*
    Le sucessivamente uma sequencia de strings até ser lida a string "FIM"
    Conta as strings iniciadas por A, B, ou C
*/

package containiciaisstrings;

import java.util.Scanner;

public class ContaIniciaisStrings {

    // metodo que verifica se a string inicia por A, B ou C
    // retorna o contador incrementado em caso afirmativo
    public static int contaIniciais( String s, int c ){
        
        char i = s.charAt(0);
        if( i == 'A' || i == 'B' || i == 'C' )
            c++;
        return c;
    }
    public static void main(String[] args) {
        
        Scanner leia = new Scanner( System.in );
        String str;
        
        // contador de strings iniciadas por A, B ou C
        int conta = 0;
        
        do{
            
            System.out.println( "Insira uma string ou FIM para terminar: ");
            str = leia.nextLine().toUpperCase();
            conta = contaIniciais( str, conta );
            
        } while( !str.equals("FIM") );
     
        System.out.printf( "Encontradas %d strings iniciadas por A, B ou C\n", conta );
    }
}
