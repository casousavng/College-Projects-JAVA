/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestaoequipamentos;

/**
 *
 * @author andresousa
 */
public class Equipamento {
    
    private int numeroSerie;    
    private int anoFabrico;
    private double preco;

    /**
     * Get the value of preco
     *
     * @return the value of preco
     */
    public double isPreco() {
        return preco;
    }

    /**
     * Set the value of preco
     *
     * @param preco new value of preco
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }


    /**
     * Get the value of anoFabrico
     *
     * @return the value of anoFabrico
     */
    public int getAnoFabrico() {
        return anoFabrico;
    }

    /**
     * Set the value of anoFabrico
     *
     * @param anoFabrico new value of anoFabrico
     */
    public void setAnoFabrico(int anoFabrico) {
        if (anoFabrico < 2020)
            this.anoFabrico = 2020;
        else
            this.anoFabrico = anoFabrico;
    }


    /**
     * Get the value of numeroSerie
     *
     * @return the value of numeroSerie
     */
    public int getNumeroSerie() {
        return numeroSerie;
    }

    /**
     * Set the value of numeroSerie
     *
     * @param numeroSerie new value of numeroSerie
     */
    public void setNumeroSerie(int numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public Equipamento() {
        this(0,0,0.00);
    }

    public Equipamento(int numeroSerie, int anoFabrico, double preco) {
        this.numeroSerie = numeroSerie;
        this.anoFabrico = anoFabrico;
        this.preco = preco;
    }
    
    public void imprimirEquipamento() {
        System.out.println("Numero de Serie: " + numeroSerie);
        System.out.println("Ano de Fabrico: " + anoFabrico);
        System.out.println("Preço:" + preco + " €");
    } 

    @Override
    public String toString() {
        return numeroSerie + ":" + anoFabrico + ":" + preco;
    }
    
    
    
    
    

    
}
