
package trabalhofinalltc;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

/**
 * Esta classe foi criada para fazer a leitura dos ficheiros de texto e
 * respetiva escrita do ficheiro em .csv
 * 
 * @author andresousa e fábiopinto
 */

public class FicheiroTexto {
    
    //Propriedade para extração dos ficheiros csv para o ambiente de trabalho (obtenção do destibo do ambiente de trabalho do utilizador)
    String caminhoDesktop = System.getProperty("user.home") + "/Desktop/";
    String caminhoDesktopOneDrive = System.getProperty("user.home") + "OneDrive/Desktop/"; //pode ser necessaria para algum tipo de utilizadores que usem o OneDrive com upload do Desktop
        
 
    public BufferedReader leitorFicheiro; // Objeto para a leitura de arquivos
    public BufferedWriter escritaFicheiro; // Objeto para a escrita de arquivos
    
    // Método para abrir um arquivo para leitura

    public void abreLeitura(String ficheiro) throws IOException {
        leitorFicheiro = new BufferedReader(new FileReader(ficheiro));
    }
    
    // Método para ler uma linha do arquivo
    public String leLinha() throws IOException{
        return leitorFicheiro.readLine();
    }
    
    // Grava os dados de frequência de caracteres num arquivo CSV    
    public void gravarDadosCSVfrequenciaCaracteres(char caracter, int freq, double media) {
        
        String nomeFicheiroCSV = "CSV_export_characters.csv";
        String caminhoFicheiroCSV_ch = caminhoDesktop + nomeFicheiroCSV;

        try (BufferedWriter escritaFicheiro = new BufferedWriter(new FileWriter(caminhoFicheiroCSV_ch, true))) {
           
            if (freq == 0) // como inicialmente a frequencia de cada caractere é zero, usando este metodo cria o cabeçalo do ficheiro CSV
                escritaFicheiro.write("Character" + "," + "Frequency" + "," + "Avg(%)");
            else
                escritaFicheiro.write(caracter + "," + freq + "," + String.format("%.1f", media).replace(",", ".")); // exporta formatado com uma casa decimal e substitui a virgula por um ponto
            escritaFicheiro.newLine();
            
        } 
        catch (IOException erro) {
            System.err.println("Error writing data to CSV file: " + erro.getMessage());
        }
    }
    
    // Grava os dados de frequência de palavras num arquivo CSV
    public void gravarDadosCSVfrequenciaPalavras(String palavra, int freq, String linha) {
        
        String nomeFicheiroCSV = "CSV_export_words.csv";
        String caminhoFicheiroCSV_words = caminhoDesktop + nomeFicheiroCSV;
        
        try (BufferedWriter escritaFicheiro = new BufferedWriter(new FileWriter(caminhoFicheiroCSV_words, true))) {
            
            if (freq == 0) // como inicialmente a frequencia da palavra é zero, usando este metodo cria o cabeçalo do ficheiro CSV
                escritaFicheiro.write("Word" + "," + "Occurrences" + "," + "Line(s)");
            else
                escritaFicheiro.write(palavra + "," + freq + "," + linha); 
            escritaFicheiro.newLine();
        } 
        catch (IOException erro) {
            System.err.println("Error writing data to CSV file: " + erro.getMessage());
        }
    }
}
