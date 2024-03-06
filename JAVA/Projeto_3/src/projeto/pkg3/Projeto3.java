/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package projeto.pkg3;


public class Projeto3 {

    
    public static void main(String[] args) {
        

        Data teste1 = new Data(15,3,2022,false);
        
        
        System.out.println("(DATA de inicio por defeito 01/01/1900)");
        System.out.println("Data escolhida: "+ teste1);
        System.out.println("Dias Passados = " + teste1.contaDias());
        
                Data nova = new Data (2022, 3 , 15 ,false);
                Data outro = new Data();
                
                //Data novo = (Data)nova.clone();
                
                //String dataSistema = outro.getDataSistema(); // atribuir data Sistema
                //System.out.println(novo);
                
                //System.out.println(dataSistema.equals(novo)); // verificar se são iguais as datas
                Data novaData = new Data(nova);
                System.out.println(novaData);
                System.out.println("Dias passados: " + nova.contaDias());
        
    }

}
