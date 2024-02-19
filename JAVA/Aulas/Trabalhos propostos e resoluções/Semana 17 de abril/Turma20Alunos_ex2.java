
package turma20alunos;

import java.util. Scanner;

public class Turma20Alunos {

    public static final int ALUNOS = 20;
    
    public static void inserirAlunos( String[]a, double[]n ){
        
        Scanner leia = new Scanner( System.in);
        for( int i=0; i<ALUNOS; i++ ){
            System.out.println( "Aluno " + (i+1) );
            System.out.println( "Nota?");
            n[i] = leia.nextDouble();
            leia.nextLine();
            System.out.println( "Nome do aluno?");
            a[i] = leia.nextLine();
            
        }
    }
    
    public static void listaAlunos( String[]a, double[]n ){
        
        for( int i=0; i<ALUNOS; i++ ){
            System.out.print( (i+1) );
            System.out.print( " " + a[i] + " ");
            System.out.println( n[i] );
        }
    }
    
    public static void pesquisaNota( String []a, double []n ){
        
        Scanner leia = new Scanner( System.in) ;
        System.out.println( "Insira o número do aluno a pesquisar");
        int posicao = leia.nextInt();
        if( posicao >= 1 && posicao <= ALUNOS ){
            int i = 0;
            while( i != posicao-1 && i < ALUNOS )
                i++;
            
            if( i != ALUNOS )
                System.out.println( "Nota de " + a[i] + " = " + n[i] );
        }
        else
            System.out.println( "Número inválido!" );
    }
    
    public static void alteraNota( String []a, double []n ){
        
        Scanner leia = new Scanner( System.in) ;
        System.out.println( "Insira o número do aluno a alterar");
        int posicao = leia.nextInt();
        if( posicao >= 1 && posicao <= ALUNOS ){
            int i = 0;
            while( i != posicao-1 && i < ALUNOS )
                i++;
            if( i != ALUNOS ){
                System.out.println( "Insira a nova nota de " + a[i] );
                n[i] = leia.nextDouble();
            }
        }
        else
            System.out.println( "Número inválido!" );
    }
    
    public static void selectionSort( String []a, double []n ) { 

      int i, j, k; 
      String min; 
      double min2;
      for( i=0; i<ALUNOS; i++ ){ 
            k = i; 
            min = a[k]; 
            min2 = n[k];
            for( j=i+1; j<ALUNOS; j++ ){ 
                  if( a[j].compareTo( min ) < 0 ) { 
                    k = j; 
                    min = a[k]; 
                    min2 = n[k];
                  } 
            }
            a[k] = a[i]; 
            n[k] = n[i];
            a[i] = min; 
            n[i] = min2;
      } 
} 


    
    public static void main(String[] args) {
        
        String []nomes = new String[ALUNOS];
        double []notas = new double[ALUNOS];
        int opcao;
        Scanner leia = new Scanner( System.in) ;
        
        do{
            System.out.println( "1 - Inserir alunos" );
            System.out.println( "2 - Pesquisar nota" );
            System.out.println( "3 - Alterar nota" );
            System.out.println( "4 - Listagem de alunos" );
            System.out.println( "5 - Ordenação alfabética" );
            System.out.println( "6 - Sair" );
            
            opcao = leia.nextInt();
            
            switch( opcao ){
                case 1:
                    inserirAlunos( nomes, notas );
                    break;
                case 2:
                    pesquisaNota( nomes, notas );
                    break;
                case 3:
                    alteraNota( nomes, notas );
                    break;
                case 4:
                    listaAlunos( nomes, notas );
                    break;
                case 5:
                    selectionSort( nomes, notas );
                    break;
                case 6:
                    System.exit(0);
            }
            
        }while( opcao != 6);
    }
    
}
