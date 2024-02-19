/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora_java;

import java.util.Scanner;

/**
 *
 * @author andresousa
 */
public class Calculadora_java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // exercicio 1
        
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
        
        
        
        
        
    }
    
}