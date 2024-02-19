// Exercicios semana 10 de abril - exercicio 2

package numerocontrolo;

import java.util.Scanner;

public class NumeroControlo {

    public static int numAlg(int n){
        
        int s=0;

        while (n>0){
            n /= 10;
            s +=1;
        }
        return s;
    }

    public static void control(int n){
        
        int number;
        number = n;
        int alg, total = 0, num, control;

        alg = numAlg(n);

        System.out.println("Número de algarismos: " + alg);

        for (int i=1; i<=alg; i++){
            // recolhe os restos das divisões e soma a multiplicação pelo i
            num = n % 10;
            n /= 10;
            total += num*i;
            System.out.println(num + " * " + i);
        }

        System.out.println("Total: " + total);
        control = total % 7;
        System.out.println("Número de controlo: "+ control);
        System.out.printf("\nO número + o digito de controlo é : %d%d\n\n",number,control);
    }

    public static void main(String[] args) {
        
        int num, opcao;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Insira o número: ");
        num = input.nextInt();
        
        do{
            System.out.println("1- Imprimir o número com controlo");
            System.out.println("2- Sair");
            System.out.print("Escolha a opção: ");
            opcao = input.nextInt();
           
            switch (opcao){
                case 1:
                    control(num);
                    break;
                case 2:
                    break;
                default:
                    System.out.println("Número Inválido");
            }

        }while (opcao!=2);
    }
}