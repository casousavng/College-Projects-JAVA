
package calculadoraaritmetica;

import java.util.Scanner;

public class CalculadoraAritmetica {

    // metodos que implementam as operacoes aritmeticas
    public static int soma( int o1, int o2 ){
    	int r = o1 + o2;
        return r;
    } 
    
    public static int subtrai( int o1, int o2 ){
        if( o1 > o2 )
            return o1 - o2;
        else
            return -1;
    } 
    
    public static int multiplica( int o1, int o2 ){
        return o1 * o2;
    } 
    
    public static int divideInteiro( int o1, int o2 ){
        return o1 / o2;
    } 
    
    public static int restoDivisao( int o1, int o2 ){
        return o1 % o2;
    } 
    
    public static double divide( int o1, int o2 ){
        return (double)o1 / o2;
    }
    
    // programa principal
    public static void main(String[] args) {
        
        Scanner leia = new Scanner( System.in );
        int opcao, op1 = -1, op2 = -1;
        boolean operandos = false;
        
        do{
            System.out.println("(1) Inserir operandos"); 
            System.out.println("(2) Soma");
            System.out.println("(3) Subtração");
            System.out.println("(4) Multiplicação");
            System.out.println("(5) Divisão ");
            System.out.println("(6) Sair");
            opcao = leia.nextInt();
            
            switch( opcao ){
                case 1:
                    
                    do{
                        System.out.println("Insira o primeiro operando:");
                        op1 = leia.nextInt();
                        System.out.println("Insira o segundo operando:");
                        op2 = leia.nextInt();
                        if( op1 < 0 || op2 < 0 )
                            System.out.println( "Erro: os operandos devem ser numeros inteiros nao negativos.");
                       
                    } while( op1 < 0 || op2 < 0 );
                    
                    operandos = true;
                    
                    break;
                    
                case 2:
                    if( operandos ){
                        System.out.printf("%d + %d = %d\n", op1, op2, soma(op1, op2 ));
                    }
                    else
                        System.out.println( "Erro: operandos nao inseridos.");
                    
                    break;
                    
                case 3:
                    if( operandos){
                        int r = subtrai( op1, op2 );
                        if( r != -1 )
                            System.out.printf("%d - %d = %d\n", op1, op2, r );
                        else
                            System.out.println( "Erro: o primeiro operando é inferior ao segundo.");
                    }   
                    else
                        System.out.println( "Erro: operandos nao inseridos.");
                    
                    break;
                    
                case 4:
                    if( operandos){
                        System.out.printf("%d x %d = %d\n", op1, op2, multiplica(op1, op2 ));
                    }
                    else
                        System.out.println( "Erro: operandos nao inseridos.");
                    
                    break;
                    
                case 5:
                    if( operandos){
                        if( op2 != 0 ){
                            System.out.printf("Divisao inteira com quociente %d e resto %d\n", 
                                               divideInteiro( op1, op2 ), restoDivisao( op1, op2 ));
                            System.out.printf("%d / %d = %.2f\n", op1, op2, divide(op1, op2 ));
                        }
                        else
                            System.out.println( "Erro: segundo operando igual a 0.");
                    }
                    else
                        System.out.println( "Erro: operandos nao inseridos.");
                    
                    break;
                
                case 6:
                    System.out.println( "Fim do programa!");
                    break;
                    
                default:
                    System.out.println( "Erro: opcao invalida.");
                
            }
  
        }while( opcao != 6 );
        
    }
    
}
