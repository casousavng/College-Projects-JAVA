
package descontoclasseprodutos;

import java.util.Scanner;

public class DescontoClasseProdutos {
    
    public static void main(String[] args) {
        Scanner leia = new Scanner( System.in );
        String classe;
        
        System.out.print("Insira a classe do produto (3 caracteres): ");
        classe = leia.nextLine();

        switch( classe ){
            case "VEG":
                System.out.println("Desconto de 0,15");
                break;
            case "LAT":
            case "CER":
            case "AGU":
                System.out.println("Desconto de 0,10");
                break;
            case "RES":
                System.out.println("Desconto de 0,01");
                break;
            default:
                System.out.println("Classe invalida!");  
        }
    }
}
