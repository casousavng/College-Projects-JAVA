
package exemplotp2;

/**
 *
 * @author andresousa
 */
public class ContaOrdem extends Conta {
    
    private double saldoMinimo;
    private boolean contaOrdenado;
    
   /**
     * Get the value of saldoMinimo
     *
     * @return the value of saldoMinimo
     */
    public double getSaldoMinimo() {
        return saldoMinimo;
    }

    /**
     * Set the value of saldoMinimo
     *
     * @param saldoMinimo new value of saldoMinimo
     */
    public void setSaldoMinimo(double saldoMinimo) {
        this.saldoMinimo = saldoMinimo;
    }

    /**
     * Get the value of contaOrdenado
     *
     * @return the value of contaOrdenado
     */
    public boolean isContaOrdenado() {
        return contaOrdenado;
    }

    /**
     * Set the value of contaOrdenado
     *
     * @param contaOrdenado new value of contaOrdenado
     */
    public void setContaOrdenado(boolean contaOrdenado) {
        this.contaOrdenado = contaOrdenado;
    }

    // contrutor sem parametros para a classe "ContaOrdem"
    public ContaOrdem() {
        this(0,"",0.00,0.00,false);
    }
    
    // contrutor com parametros atribuidos para a classe "ContaOrdem"
    public ContaOrdem(int conta, String nomeTitular, double saldo,double saldoMinimo, boolean contaOrdenado) {
        super(conta,nomeTitular,saldo);
        this.saldoMinimo = saldoMinimo;
        this.contaOrdenado = contaOrdenado;
    }
    
    // metodo que retorna/imprime a informaçao da comparaçao de 
    // saldo minimo entre duas Contas a Ordem sendo inferior, igual ao superior.
    public String comparaSaldoMinimo(ContaOrdem co){
        if (this.saldoMinimo < co.saldoMinimo)
            return "A Conta 1 tem um Saldo Minimo INFERIOR a Conta 2.";
        else if (this.saldoMinimo == co.saldoMinimo) 
            return "A Conta 1 tem um Saldo Minimo IGUAL a Conta 2.";
        else 
            return "A Conta 1 tem um Saldo Minimo SUPERIOR a Conta 2.";  
    }
    
    // criei este conversor para converter o resultado Boolean True/False em String Sim/Não
    public String conversor(boolean contaOrdenado) {
        if (contaOrdenado == true)
            return "Sim";
        else
            return "Não";
    }

    public void imprimirContaOrdem() {
        super.imprimirConta();
        System.out.println("Saldo minimo: " + saldoMinimo + "€");
        System.out.println("Conta ordenado? " + conversor(contaOrdenado));
    }    

    @Override
    public String toString() {
        return super.toString() + "\nSaldo minimo: " + saldoMinimo + "€" + "\nConta Ordenado? " + conversor(contaOrdenado);
    }
    
    
    
    
    


}
