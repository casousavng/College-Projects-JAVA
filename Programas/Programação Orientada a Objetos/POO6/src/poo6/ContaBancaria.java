/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo6;

/**
 *
 * @author andresousa
 */
public class ContaBancaria extends Banco1 {
    
    
    private static int conta = 0; 
    private String titular;
    private double saldo;

    /**
     * Get the value of saldo
     *
     * @return the value of saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Set the value of saldo
     *
     * @param saldo new value of saldo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Get the value of titular
     *
     * @return the value of titular
     */
    public String getTitular() {
        return titular;
    }

    /**
     * Set the value of titular
     *
     * @param titular new value of titular
     */
    public void setTitular(String titular) {
        this.titular = titular;
    }
        
    /**
     * Get the value of conta
     *
     * @return the value of conta
     */
    public static int getConta() {
        return conta;
    }

    public ContaBancaria() {
     this("",0);
        
    }

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
        this.conta = (int)Math.floor(Math.random() * (100) + 1);
    }
    
    public double deposito(double deposito){
        setSaldo((saldo + deposito));
        return saldo;
    }
    
    public double levantamento (double levantamento){
        if (levantamento > saldo)
            return 0;
        else
            saldo = getSaldo() - levantamento;
            return saldo;
    }
    
    @Override
    public String toString() {
        return "\nConta = " + conta + "\nSaldo = " + saldo + "€";
    }
    
 
    
    
  
    
    

    
}
