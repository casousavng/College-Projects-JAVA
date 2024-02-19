/*
 * Estações do ano
 */
package estacoesdoano;

import java.util.Scanner;

public class EstacoesDoAno {
    
    public static void primavera( int dia, int mes ){
        
        if( mes == 4 || mes == 5 )
            System.out.println( "Estação correcta!");
        else{
            if( mes == 3 && dia >= 21 )
                System.out.println( "Estação correcta!");
            else
                if( mes == 6 && dia < 21 )
                    System.out.println( "Estação correcta!");
                else
                    System.out.println( "Estação incorrecta!");
        }
    }
    
    public static void verao( int dia, int mes ){
        
        if( mes == 7 || mes == 8 )
            System.out.println( "Estação correcta!");
        else{
            if( mes == 6 && dia >= 21 )
                System.out.println( "Estação correcta!");
            else
                if( mes == 9 && dia < 21 )
                    System.out.println( "Estação correcta!");
                else
                    System.out.println( "Estação incorrecta!");
        }
    }
    
    public static void outono( int dia, int mes ){
        
        if( mes == 10 || mes == 11 )
            System.out.println( "Estação correcta!");
        else{
            if( mes == 9 && dia >= 21 )
                System.out.println( "Estação correcta!");
            else
                if( mes == 12 && dia < 21 )
                    System.out.println( "Estação correcta!");
                else
                    System.out.println( "Estação incorrecta!");
        }
    }
    
     public static void inverno( int dia, int mes ){
        
        if( mes == 1 || mes == 2 )
            System.out.println( "Estação correcta!");
        else{
            if( mes == 12 && dia >= 21 )
                System.out.println( "Estação correcta!");
            else
                if( mes == 3 && dia < 21 )
                    System.out.println( "Estação correcta!");
                else
                    System.out.println( "Estação incorrecta!");
        }
    }
     
    // método alternativo que testa todas as estações
    // retorna true se a estação for válida e
    // retorna false se a estação não for válida
    public static boolean verificaEstacao( int dia, int mes, int i ){
        
        int j = i+3;
        if( mes == i && dia >= 21 )
                return true;
        else{
            if( mes == 12 ){
                i = 0;
                j = 12;
            }
            if( mes == i+1 || mes == i+2 )
                return true;
            else {
                System.out.println("j = " + j + " mes = " + mes );
                if( mes == j && dia < 21 )
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        
        int dia=0, mes=0, opcao;
        boolean dados = false;
        Scanner leitura = new Scanner( System.in );
        
        do{
            System.out.println( "1 - Inserir o mês");
            System.out.println( "2 - Primavera");
            System.out.println( "3 - Verão");
            System.out.println( "4 - Outono");
            System.out.println( "5 - Inverno");
            System.out.println( "6 - Sair");
            System.out.print( "Opção? ");
            opcao = leitura.nextInt();
            
            switch( opcao ){
                
                case 1:
                    
                     do{
                        System.out.print("Insira o mês: ");
                        mes = leitura.nextInt();
                    }while( mes<1 || mes>12 );
                     
                    if( mes == 3 || mes == 6 || mes == 9 || mes == 12 ){
                        do{
                            System.out.print("Insira o dia: ");
                            dia = leitura.nextInt();
                        } while( dia<1 || dia > 31);
                    }
                    else
                        dia = 0;
        
                    System.out.println();
                    dados = true;
                    break;
                    
                case 2:
                   
                    if( dados ){     
                        
                        primavera( dia, mes ); 
                        
//                      em alternativa, pode-se chamar um só metodo
//                      para verificar todas as estações
                        if( verificaEstacao( dia, mes, 3 ) )
                            System.out.println( "Estação correcta!");
                        else
                            System.out.println( "Estação incorrecta!");                    
                    }
                    break;
                    
                case 3:
                   
                    if( dados ){
                        verao( dia, mes ); 
                        
//                  em alternativa, pode-se chamar um só metodo
//                  para verificar todas as estações
                        if( verificaEstacao( dia, mes, 6 ) )
                            System.out.println( "Estação correcta!");
                        else
                            System.out.println( "Estação incorrecta!");   
                    }    
                    break;
                    
                case 4:
                                             
                    if( dados ){
                        
                         outono( dia, mes );
                        
//                      em alternativa, pode-se chamar um só metodo
//                      para verificar todas as estações
                        if( verificaEstacao( dia, mes, 9 ) )
                            System.out.println( "Estação correcta!");
                        else
                            System.out.println( "Estação incorrecta!");   
                    }    
                    break;
                    
                 case 5:
                    if( dados ){
                        
                        inverno( dia, mes ); 
                        
//                      em alternativa, pode-se chamar um só metodo
//                      para verificar todas as estações
                        if( verificaEstacao( dia, mes, 12 ) )
                            System.out.println( "Estação correcta!");
                        else
                            System.out.println( "Estação incorrecta!");                         
                    }  
                    break;       
            }           
        } while( opcao != 6 );      
        
    }
}
