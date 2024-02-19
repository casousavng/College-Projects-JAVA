/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package polinomio;

import java.util.Scanner;

/**
 *
 * @author andresousa
 */

public class Inicio {
    
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        Polinomio polinomio = new Polinomio();
        
        double coeficiente;
        int expoente;
        
        System.out.println("POLINOMIOS");
        System.out.println("""
                           Adicione os seus termos.
                           NOTA: Escolha coeficiente zero para terminar a inser\u00e7\u00e3o.
                                 Por favor, evite inserir termos com expoentes iguais.""");
        
        do{
            System.out.print("Para construir um termo, indique o coeficiente: ");
            coeficiente = leia.nextDouble();
        
            if (coeficiente != 0){
                System.out.print("                         indique agora o expoente: ");
                expoente = leia.nextInt();
            }
            else
                break;
            
        polinomio.adicionaTermo(coeficiente, expoente);
                
        } while (coeficiente != 0);
       
        System.out.print("O seu polinomio atual é: ");
        polinomio.imprimir();
        
        System.out.print("Qual o termo que pretende remover (indique o expoente): ");
        int remover = leia.nextInt();
        polinomio.removeTermo(remover);
        System.out.print("Como fica o polinomio apos remover o termo: ");
        polinomio.imprimir();
        
        if (polinomio.grau() == -1){
            System.out.println("O seu polinomio não tem termos para apresentar.");
            System.exit(0);
        }
        else
            System.out.println("O seu polinomio é de " + polinomio.grau()+ "º grau.");
        
        
        System.out.println("O seu polinomio contém " + polinomio.contaTermos() + " termo(s)." );

        polinomio.ordenarPolinomio();
        System.out.print("O seu polinomio de forma ordenada por ordem descrescente do expoente fica: ");
        polinomio.imprimir();

        System.out.print("Para resolver o polinomio indique o valor de X: ");
        double x = leia.nextDouble();
        System.out.println("Sendo a variavel X = " + x + " o resultado deste polinomio é = " + polinomio.calculoValor(x));
        

    }
}
