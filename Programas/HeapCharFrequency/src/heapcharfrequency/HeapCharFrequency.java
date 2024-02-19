/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package heapcharfrequency;

/**
 *
 * @author andresousa
 */
import java.util.Scanner;

public class HeapCharFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        System.out.println("Digite um texto:");
        String texto = scanner.nextLine();
        
        
        // Contagem da frequência de caracteres
        int[] frequencyArray = new int[256]; // Assumindo caracteres ASCII
        for (char c : texto.toCharArray()) {
            frequencyArray[c]++;
        }

        // Pergunta ao usuário pela variável n
        System.out.println("Digite o valor de n:");
        int n = scanner.nextInt();

        // Mostra os n caracteres mais frequentes
        System.out.println("Os " + n + " caracteres mais frequentes são:");
        for (int i = 0; i < n; i++) {
            char maxChar = findMax(frequencyArray);
            if (maxChar == '\0') {
                break; // Não há mais caracteres para mostrar
            }

            int frequency = frequencyArray[maxChar];
            System.out.println(maxChar + ": " + frequency + " vezes");

            frequencyArray[maxChar] = 0; // Marca o caractere como processado
        }

        scanner.close();
    }

    // Encontra o caractere com a maior frequência no array
    private static char findMax(int[] frequencyArray) {
        int maxFrequency = 0;
        char maxChar = '\0';

        for (char c = 0; c < frequencyArray.length; c++) {
            if (frequencyArray[c] > maxFrequency) {
                maxFrequency = frequencyArray[c];
                maxChar = c;
            }
        }

        return maxChar;
    }
}
