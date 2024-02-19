// Exercicios semana 10 de abril - exercicio 1

package numeros;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Gonçalo Pinho | ispg2019102732 | 25-03-2020 | Programação e computadores | 1ºAno 2ºSemestre |
 */
public class Numeros {

    //verifica o numero de digitos que o numero tem (p.e 123 = 3 digitos)
    public static int digitos(int numero) {
        int digito, nDigitos = 0;
        while (numero != 0) {
            digito = numero % 10;
            numero /= 10;
            nDigitos++;
        }
        return nDigitos;
    }

    //encontrar o inverso do numero (p.e 123 = 321)
    public static int inverso(int numero) {
        int inverso;
        inverso = 0;
        while (numero != 0) {
            int digito = numero % 10;
            inverso = inverso * 10 + digito;
            numero /= 10;
        }
        return inverso;
    }

    //soma dos digitos (p.e 123 = 1+2+3 = 6)
    public static int soma(int numero) {
        int soma;
        soma = 0;

        while (numero != 0) {
            soma = soma + numero % 10;
            numero = numero / 10;
        }
        return soma;
    }

    //calculo da media da soma dos digitos (p.e 123 = 1+2+3/3 = 6/3 = 2)
    public static double mediaSoma(int numero) {
        int contador = 0, soma = 0;

        while (numero != 0) {
            ++contador;
            soma = soma + numero % 10;
            numero = numero / 10;
        }
        return (double) soma / contador;
    }

    //verificação se o numero inserido é perfeito (p.e  6 tem como divisores 1, 2 e 3 e a soma deles é igual ao número: 1+2+3=6)
    public static boolean perfeito(int numero) {
        int i, soma = 0;
        for (i = 1; i < numero; i++) {
            if (numero % i == 0) {
                soma = soma + i;
            }
        }
        return soma == numero;
    }

    public static void main(String[] args) {
        
        //declaração de variaveis.
        int numero;
        Scanner scan = new Scanner(System.in);
        
        //verificação se o utilizador inseriu números e não outro tipo de caracteres.
        try {
            System.out.println("Insira um numero inteiro:");
            numero = scan.nextInt();
            //verificação se o utilizador inseriu numero positivos.
            if (numero < 0) {
            System.out.println("Só pode inserir números inteiros!");
        }

        //RESULTADOS
        //contagem de digitos
        System.out.println("O numero inserido tem: " + digitos(numero));
        //inverso
        System.out.println("Inverso: " + inverso(numero));
        //capicua
        if (inverso(numero) == numero) {
            System.out.println("O numero é uma capicua!");
        } else {
            System.out.println("O numero não é uma capicua!");
        }
        
        //soma dos digitos
        System.out.println("A soma dos digitos é: " + soma(numero));

        //numero perfeito
        if (perfeito(numero)) {
            System.out.println("O numero é perfeito!");
        } else {
            System.out.println("O numero não é perfeito!");
        }

        //soma da media
        System.out.println("A media da soma dos digitos é: " + mediaSoma(numero));
        } catch (InputMismatchException excepcao) {
            //caso o utilizador tenha inserido outro tipo de caracteres sem ser numeros a seguinte mensagem aparece.
            System.out.println("Só pode inserir números!");
        }     
    }
}
