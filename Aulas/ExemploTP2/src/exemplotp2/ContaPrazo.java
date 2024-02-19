
package exemplotp2;

/**
 *
 * @author andresousa
 */
public class ContaPrazo extends Conta {
        
    private int prazo;
    private double taxa;
    
    public int getPrazo() {
        return prazo;
    }

    public void setPrazo(int prazo) {
        this.prazo = prazo;
    }
    
    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    // contrutor sem parametros para a classe "ContaPrazo"
    public ContaPrazo() {
        this(0,"",0.00,0,0.00);
    }

    // contrutor com parametros atribuidos para a classe "ContaPrazo"
    public ContaPrazo(int conta, String nomeTitular, double saldo, int prazo, double taxa) {
        super(conta,nomeTitular,saldo);
        this.prazo = prazo;
        this.taxa = taxa;
    }
    
    public boolean mesmaTaxa(ContaPrazo cp){
        return this.taxa == cp.taxa;
    }

    
    public void imprimirContaPrazo() {
        super.imprimirConta();
        System.out.println("Conta a Prazo: " + prazo + " dias");
        System.out.println("Taxa de Juro: " + taxa + "%");
    }    

    @Override
    public String toString() {
        return super.toString() + "\nConta a Prazo: " + prazo + " dias" + "\nTaxa de Juro: " + taxa + "%";
    }
    
    
    
    

    
}
