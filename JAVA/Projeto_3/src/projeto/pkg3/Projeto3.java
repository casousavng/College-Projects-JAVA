/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package projeto.pkg3;


public class Projeto3 {

    
    public static void main(String[] args) {
        

        Data teste1 = new Data(1,2,1900);
        
        
        System.out.println("(DATA de inicio por defeito 01/01/1900)");
        System.out.println("Data escolhida: "+ teste1);
        System.out.println("Dias Passados = " + teste1.contaDias());
        
    }

}
