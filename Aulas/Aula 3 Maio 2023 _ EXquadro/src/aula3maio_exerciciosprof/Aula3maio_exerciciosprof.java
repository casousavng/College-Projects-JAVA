/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula3maio_exerciciosprof;

import java.util.Scanner;

/**
 *
 * @author andresousa
 */
public class Aula3maio_exerciciosprof {
    
    // inverte uma string
    //3. Escrever um método para inverter uma string passada por parâmetro
    public static String inverte( String s ){
        
        String t = "";
        char []c = new char[ s.length() ];
        
        c = s.toCharArray();
        
        for( int i=s.length()-1; i>=0; i-- )
            t += c[i];
        
        return t;
        
    }
    
    // remove espaços em branco de uma string
    // 4. Escrever um método para remover todos os espaços em branco de uma string passada por parâmetro.
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
    

    // conta o número de ocorrências de um carácter
    // 6. Escrever um método para contar todas as ocorrências de um carácter dentro de uma string.
    public static int countChar( String s, char c ){
        
        int contador = 0;
        for( int i=0; i<s.length(); i++ )
            if( s.charAt(i) == c )
                contador++;
        return contador;
        
    }
    
    // apresenta o primeiro e último nome de uma string representando um nome completo convertendo para maiusculas as primeiras letras
    // 7. Escrever um método que apresenta o primeiro e último nome de uma string representando um nome completo, convertendo para maiúsculas as primeiras letras.
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
    
    //8. Escrever um método para contar o número de caracteres dentro de uma string (sem usar o método length() da classe String).
    public static int contaCaracteres(String s){
    
        int contador = 0;
        for( int i=0; i<s.length(); i++ )
                contador++;
        return contador;  
    }
    
    // substitui um carácter por outro
    // 9. Escrever um método para substituir um carácter por outro dentro de uma string (sem usar o método replace() da classe String).
    public static String replaceChar( String s, char r, char c ){
        
        String s2 = "";
        for( int i=0; i<s.length(); i++ )
            if( s.charAt(i) == r )
                s2 += c;
            else
                s2 += s.charAt(i);
        return s2;
        
    }
    
        // 10. Escrever um programa para ler uma frase e verificar se uma determinada string aparece nessa frase e a partir de que posição.
    public static int pesquisaPalavra(String s6, String s7){
        
        int posicao = s6.indexOf(s7);
        
        if (posicao >= 0)
            return posicao;
        else 
            return 0;
           
    }
       
    // EXTRA EXERCICIOS
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
    

    // EXTRA EXERCICIOS
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
    
    // EXTRA EXERCICIOS
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
    
    // EXTRA EXERCICIOS
    // indica o índice da última ocorrência de um carácter numa string
    public static int lastOccur2( String s, char c ){
        
        int last = -1;
        for( int i = 0; i < s.length(); i++ ){
            if( s.charAt(i) == c )
                last = i;
        }
        return last;
    }
    

    // programa principal com exemplificação de alguns dos métodos acima
    public static void main(String[] args) {
        
        String s1;
        Scanner leitura = new Scanner( System.in );

        System.out.println( "Introduza uma string: " );
        s1 = leitura.nextLine();
        
        System.out.println( removeBlanks( s1 ) );
        
        System.out.println( removeBlanksToLowercase( s1) );
        
        System.out.println("A string tem: " + contaCaracteres(s1));
        
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
        
        String s6;
        System.out.println("Intruduza uma frase: ");
        s6 = leitura.nextLine();
        String s7;
        System.out.println("Intruduza a palavra que quer pesqusiar: ");
        s7 = leitura.nextLine();
        System.out.println("Na frase '" + s6 + "', a palavra '" + s7 + "' aparece na posição: " + pesquisaPalavra(s6,s7));
    }
}
