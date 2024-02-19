/*
 * Exemplo de métodos de manipulação de strings
 */

package operacoes_strings;

import java.util.Scanner;

public class Operacoes_strings {
   
    // conta o número de ocorrências de um carácter
    public static int countChar( String s, char c ){
        
        int contador = 0;
        for( int i=0; i<s.length(); i++ )
            if( s.charAt(i) == c )
                contador++;
        return contador;
        
    }
    
    // substitui um carácter por outro
    public static String replaceChar( String s, char r, char c ){
        
        String s2 = "";
        for( int i=0; i<s.length(); i++ )
            if( s.charAt(i) == r )
                s2 += c;
            else
                s2 += s.charAt(i);
        return s2;
        
    }
       
    // inverte uma string
    public static String inverte( String s ){
        
        String t = "";
        char []c = new char[ s.length() ];
        
        c = s.toCharArray();
        
        for( int i=s.length()-1; i>=0; i-- )
            t += c[i];
        
        return t;
        
    }
    
    // verifica se um texto dado é um palíndromo
    public static boolean palindromo2( String s ){
        
        char []c = new char[ s.length()];       
        c = s.toCharArray();
        
        for( int i = 0; i < s.length()/2; i++ ){
            if( c[i] != c[s.length() - 1 - i] )
                return false;
        }
        return true;
    }

    public static boolean palindromo( String s ){
        
        s = removeBlanksToLowercase( s );
        
        for( int i = 0; i < s.length()/2; i++ ){
            if( s.charAt(i) != s.charAt(s.length() - 1 - i) )
                return false;
        }
        return true;
    }
    
    // remove espaços em branco de uma string
    public static String removeBlanks( String s ){
        char []ca = new char[ s.length()];
        String so = "";
        ca = s.toCharArray();
        for( int i = 0; i < s.length(); i++ ){
            if( ca[i] != ' ' )
                so += ca[i];
        }
        
        return so;
    }
    
    // remove espaços em branco e converte caracteres para minúscula
    public static String removeBlanksToLowercase( String s ){
        char []ca = new char[ s.length()];
        String so = "";
        ca = s.toCharArray();
        for( int i = 0; i < s.length(); i++ ){
            if( ca[i] != ' ' )
                so += ca[i];
        }
        
        so = so.toLowerCase();
        
        return so;
    }
    
    // indica o índice da última ocorrência de um carácter numa string - versão com array
    public static int lastOccur( String s, char c ){
        
        char []ca = new char[ s.length()];
        int last = -1;
        ca = s.toCharArray();
        for( int i = 0; i < s.length(); i++ ){
            if( ca[i] == c )
                last = i;
        }
        return last;
    }
    
    // indica o índice da última ocorrência de um carácter numa string
    public static int lastOccur2( String s, char c ){
        
        int last = -1;
        for( int i = 0; i < s.length(); i++ ){
            if( s.charAt(i) == c )
                last = i;
        }
        return last;
    }
    
    // apresenta o primeiro e último nome de uma string representando
    // um nome completo convertendo para maiusculas as primeiras letras
    public static String firstLast( String nome ){
        String firstName = "", lastName = "";
        int last = 0, first = 0;
        for( int i = 0; i < nome.length(); i++ ){
            if( nome.charAt(i) == ' ' && i != nome.length()-1 ){
                if( first == 0 )
                    first = i;
                last = i+1;
            }
        }
        
        firstName = nome.substring(0, first);
        lastName  = nome.substring(last, nome.length());
        
        String firstChar = firstName.substring( 0, 1 ).toUpperCase();
        firstName = firstChar + firstName.substring(1, firstName.length() );
        
        firstChar = lastName.substring( 0, 1 ).toUpperCase();
        lastName = firstChar + lastName.substring(1, lastName.length() );
        
        return firstName + " " + lastName;
    }
    
    // duplica todos os caracteres de uma string
    // 5. Escrever um método que duplica todos os caracteres de uma string passada por parâmetro.
    public static String duplicateChars( String s ){
        
        String resultado = "";
        for( int i = 0; i < s.length(); i++ ){
            resultado += s.charAt(i);
            resultado += s.charAt(i);
        }
        return resultado;
    }
    
    public static String 
    
    // programa principal com exemplificação de alguns dos métodos acima
    public static void main(String[] args) {
        
        String s1;
        Scanner leitura = new Scanner( System.in );

        System.out.println( "Introduza uma string: " );
        s1 = leitura.nextLine();
        
        System.out.println( removeBlanks( s1 ) );
        
        System.out.println( removeBlanksToLowercase( s1) );
        
        System.out.println( lastOccur( s1, 'c') );
        
        String s2;
        System.out.println( "Introduza um nome completo: " );
        s2 = leitura.nextLine();
        
        // este método dá erro se não existir mais do que um nome
        // como resolver?
        System.out.println( "Primeiro e último: " + firstLast(s2));
        
        String s3;
        System.out.println( "Introduza uma string: " );
        s3 = leitura.nextLine();
        System.out.println( "Palavra invertida: " + inverte( s3 ) );
        
        if( palindromo( s3 ) )
            System.out.println( "É um palindromo" );
        else
            System.out.println( "Não é um palindromo" );
        
        String s4 = "exemplo";
        char c1 = 'e';
        char c2 = 'o';
        
        System.out.println( "Contagem do caracter " + c1 + " em " + s4 + ": " + countChar( s1, c1 ));
        
        System.out.println( "troca de " + c1 + " por " + c2 + ": " + replaceChar( s4, c1, c2 ));
      
        String s5;
        System.out.println( "Introduza uma string: " );
        s5 = leitura.nextLine();
        s5 = removeBlanks( s5 );
        System.out.println( "Resultado: " + duplicateChars( s5 ) );
    }
}
