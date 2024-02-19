/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio.semana.pkg27.março;

import java.util.Scanner;

/**
 *
 * @author andresousa
 */
public class ExercicioSemana27Março {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // exercicio 1
     /*   
        Scanner leia = new Scanner(System.in);
        int opcao;
        
        double a = 0, b = 0;
        boolean operando = false;
        
        do {
            System.out.println("(1) Inserir Operandos");
            System.out.println("(2) Soma");
            System.out.println("(3) Subtração");
            System.out.println("(4) Multiplicação");
            System.out.println("(5) Divisão");
            System.out.println("(6) Sair");
            System.out.print("Escolha a sua opção: ");
            opcao = leia.nextInt();
            
            switch(opcao){
                case 1:
                    System.out.print("Insira o primeiro numero (A): ");
                    a = leia.nextInt();
                    System.out.print("Insira o segundo numero (B): ");
                    b = leia.nextInt();
                    System.out.println("Os numeros escolhidos são:  " + a + " e " + b);
                    System.out.println("");
                    operando = true;
                    break;
                case 2:
                    if (operando == false)
                        {
                        System.out.println("ATENÇÃO: Só pode realizar esta operação se tiver inserido os operandos no Ponto 1. ");
                        System.out.println("");
                        }
                    else{
                        System.out.println("A soma de (A + B) é igual a: " + (a+b));
                        System.out.println("");
                        };
                    break;
                case 3:
                    if (operando == false)
                        {
                        System.out.println("ATENÇÃO: Só pode realizar esta operação se tiver inserido os operandos no Ponto 1. ");
                        System.out.println("");
                        }
                    else{
                        System.out.println("A subtracção de (A - B) é igual a: " + (a-b));
                        System.out.println("");
                        };
                    break;
                case 4:
                    if (operando == false)
                        {
                        System.out.println("ATENÇÃO: Só pode realizar esta operação se tiver inserido os operandos no Ponto 1. ");
                        System.out.println("");
                        }
                    else{
                        System.out.println("A multiplicação de (A x B) é igual a: " + (a*b));
                        System.out.println("");
                        };
                    break;
                case 5:
                    if (operando == false)
                        {
                        System.out.println("ATENÇÃO: Só pode realizar esta operação se tiver inserido os operandos no Ponto 1. ");
                        System.out.println("");
                        }
                    if (b == 0)
                        {
                        System.out.println("Não é possivel realizar esta operação pois B = 0.");
                        System.out.println("");
                        };
                    else{
                        System.out.println("A divisão de (A / B) é igual a: " + (a/b));
                        System.out.println("");
                        };
                    break;
                case 6:
                    System.out.println("Obrigado por ter usado esta calculadora");
                    System.out.println("");
                    break;
                default:
                    System.out.println("Opção Inválida.")
                            ;
            }
        }while (opcao != 6);
        
      */
     
        // exercicio 2
        
        Scanner ler = new Scanner(System.in);
        
        int mes = 0, dia = 0;
        boolean mes_ativo = false;
        int escolha;

        
        do {
            System.out.println("(1) Insira o mês");
            System.out.println("(2) Primavera");
            System.out.println("(3) Verão");
            System.out.println("(4) Outono");
            System.out.println("(5) Inverno");
            System.out.println("(6) Sair");
            System.out.print("Escolha a sua opção: ");
            escolha = ler.nextInt();
            
            switch(escolha){
                case 1:
                    System.out.print("Insira o numero mês: ");
                    mes = ler.nextInt();
                    System.out.println("");
                    mes_ativo = true;
                    break;
                case 2:
                    if (mes_ativo == false)
                        {
                        System.out.println("ATENÇÃO: Só pode realizar esta operação se tiver escolhido o mês no Ponto 1.");
                        System.out.println("");
                        }
                    if (mes < 9 && mes > 12 )
                    {
                        System.out.print("Escolha o dia:");
                        dia = ler.nextInt();
                    }
                            if (dia >= 21 && dia != 22 )
                                System.out.println("Sim, é Primavera.");
                    else{
                        System.out.println("A data inserida não pertence a Primavera");
                        System.out.println("");
                        };
                    break;
                case 3:
                    if (mes_ativo == false)
                        {
                        System.out.println("ATENÇÃO: Só pode realizar esta operação se tiver escolhido o mês no Ponto 1.");
                        System.out.println("");
                        }
                    else{
                        System.out.println("A subtracção de (A - B) é igual a: ");
                        System.out.println("");
                        };
                    break;
                case 4:
                    if (mes_ativo == false)
                        {
                        System.out.println("ATENÇÃO: Só pode realizar esta operação se tiver escolhido o mês no Ponto 1.");
                        System.out.println("");
                        }
                    else{
                        System.out.println("A multiplicação de (A x B) é igual a: " );
                        System.out.println("");
                        };
                    break;
                case 5:
                    if (mes_ativo == false)
                        {
                        System.out.println("ATENÇÃO: Só pode realizar esta operação se tiver escolhido o mês no Ponto 1.");
                        System.out.println("");
                        }
                    else{
                        System.out.println("A divisão de (A / B) é igual a: " );
                        System.out.println("");
                        };
                    break;
                case 6:
                    System.out.println("Obrigado por ter usado esta calculadora");
                    System.out.println("");
                    break;
                default:
                    System.out.println("Opção Inválida.")
                            ;
            }
        }while (escolha != 6);
        
        
        
        
        
        
    }
    
}
