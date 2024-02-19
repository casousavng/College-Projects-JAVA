/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestaoequipamentos;

/**
 *
 * @author andresousa
 */
public class Computador extends Equipamento {
    
    private int ram;    
    private int disco;
    private String processador;

    /**
     * Get the value of processador
     *
     * @return the value of processador
     */
    public String getProcessador() {
        return processador;
    }

    /**
     * Set the value of processador
     *
     * @param processador new value of processador
     */
    public void setProcessador(String processador) {
        this.processador = processador;
    }


    /**
     * Get the value of disco
     *
     * @return the value of disco
     */
    public int getDisco() {
        return disco;
    }

    /**
     * Set the value of disco
     *
     * @param disco new value of disco
     */
    public void setDisco(int disco) {
        this.disco = disco;
    }


    /**
     * Get the value of ram
     *
     * @return the value of ram
     */
    public int getRam() {
        return ram;
    }

    /**
     * Set the value of ram
     *
     * @param ram new value of ram
     */
    public void setRam(int ram) {
        this.ram = ram;
    }

    public Computador() {
        this(0,0,0.00,0,0,"");
    }

    public Computador(int numeroSerie, int anoFabrico, double preco, int ram, int disco, String processador) {
        super(numeroSerie, anoFabrico, preco);
        this.ram = ram;
        this.disco = disco;
        this.processador = processador;
    }
    
    public boolean comparaProcessador(Computador comp){
        return this.processador == comp.processador;
    }
    
    
    public void imprimirComputador() {
        super.imprimirEquipamento();
        System.out.println("RAM: " + ram + " GigaBytes");
        System.out.println("Disco: " + disco + " Gigabytes");
        System.out.println("Processador:" + processador);
    } 
    
    public int aumentaRam(int aumentoRam){
        return ram = ram + aumentoRam;
    }
    
    

    @Override
    public String toString() {
        return "Print Computador:" + "\nRam = " + ram + "\nDisco = " + disco + "\nProcessador = " + processador;
    }
    
    public String toStringTotal() {
        return super.toString() + "\nRam = " + ram + "\nDisco = " + disco + "\nProcessador = " + processador;
    }
    
    
    
    
    
    
    
    
    
    

    
}
