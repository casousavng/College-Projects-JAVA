/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo6;

/**
 *
 * @author andresousa
 */
public class Banco1 {
    
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    
    ContaBancaria c1 = new ContaBancaria("Andre",0);
    
    System.out.println("(impressao do numero atribuido da conta 1 e o saldo)");
    System.out.println(c1.toString());
    System.out.println("");
    
    int valorDeposito = 100;
    c1.deposito(valorDeposito);
    System.out.println("Apos deposito de (" + valorDeposito + " euros) a conta numero " + c1.getConta() + " tem " + c1.getSaldo() + "€.");
    
    int valorLevantar = 20;   
    if (c1.levantamento(valorLevantar) == 0)
        System.out.println("O seu saldo nao lhe permite efetuar levantamentos.");
    else
        System.out.println("Apos levantamento (" + valorLevantar + " euros) a conta numero " + c1.getConta() + " tem " + c1.getSaldo() + "€.");
    
    valorDeposito = 200;
    c1.deposito(valorDeposito);
    System.out.println("Apos novo deposito de (" + valorDeposito + " euros) a conta numero " + c1.getConta() + " tem " + c1.getSaldo() + "€.");
    
    valorLevantar = 50;   
    if (c1.levantamento(valorLevantar) == 0)
        System.out.println("O seu saldo nao lhe permite efetuar levantamentos.");
    else
        System.out.println("Apos novo levantamento (" + valorLevantar + " euros) a conta numero " + c1.getConta() + " tem " + c1.getSaldo() + "€.");
    
    
    ContaBancaria c2 = new ContaBancaria("Jorge",5000);
    
    System.out.println("");
    
    System.out.println("(impressao do numero atribuido da conta 2 e o saldo)");
    System.out.println(c2.toString());
    System.out.println("");
 
 
      
            
       }
    
    
    
    
}
