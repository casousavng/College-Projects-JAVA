
package exemplotp2;

/**
 *
 * @author andresousa
 */
public class Conta {

    private int numeroConta; 
    private String nomeTitular;
    private double saldo;

    /**
     * Get the value of numeroConta
     *
     * @return the value of numeroConta
     */
    public int getNumeroConta() {
        return numeroConta;
    }

    /**
     * Set the value of numeroConta
     *
     * @param numeroConta new value of numeroConta
     */
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    
     /**
     * Get the value of nomeTitular
     *
     * @return the value of nomeTitular
     */
    public String getNomeTitular() {
        return nomeTitular;
    }

    /**
     * Set the value of nomeTitular
     *
     * @param nomeTitular new value of nomeTitular
     */
    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

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

    // contrutor sem parametros para a super-classe "Conta"
    public Conta() {
        this(0,"",0.00);
    }

    // contrutor com parametros atribuidos para a super-classe "Conta"
    public Conta(int numeroConta, String nomeTitular, double saldo) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }
    
    // metodo para impressao da Conta pelo System.out.println
    public void imprimirConta() {
        System.out.println("Número de Conta: " + numeroConta);
        System.out.println("Nome do Titular: " + nomeTitular);
        System.out.println("Saldo: " + saldo + "€");
    }

    // metodo para impressao da Conta pelo sobrecarga do metodo toString
    @Override
    public String toString() {
        return "Número de Conta: " + numeroConta + "\nNome do Titular: " + nomeTitular + "\nSaldo: " + saldo + "€";
    }
    
    
    
    
    
    

    
    
    

    
}
