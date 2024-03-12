
package projeto4;

public class Eletrodomestico {
    
    private String marca;
    private double potenciaMax;
    private boolean estado;

    public Eletrodomestico() {
        this.marca = null;
        this.potenciaMax = 0;
        this.estado = false;
    }
    
    public Eletrodomestico(String marca, double potenciaMax, boolean estado) {
        this.marca = marca;
        this.potenciaMax = potenciaMax;
        this.estado = estado;
    }
    
    Eletrodomestico(Eletrodomestico novo){
        System.out.println("Construtor de cópia chamado : ");
        marca = novo.marca;
        potenciaMax = novo.potenciaMax;
        estado = novo.estado; 
        
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPotenciaMax() {
        return potenciaMax;
    }

    public void setPotenciaMax(int potenciaMax) {
        this.potenciaMax = potenciaMax;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    //public int calculaPot(double potReal , double tempo){
    //   return potReal*tempo;
    //}
    @Override
    public String toString() {
        return "Eletrodomestico:"
             + "Marca = " + marca + 
               "Potencia = " + potenciaMax + 
               "Estado=" + estado;
    }
   
    
}
