/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto4;

/**
 *
 * @author andresousa
 */
public class TV extends Eletrodomestico{
    
    private int canal;    
    private int volume;
    private int tamanho_ecra;

    public TV() {
        this.canal = 0;
        this.volume = 0;
        this.tamanho_ecra = 0;
        
    }

    public TV(String marca, double potenciaMax, boolean estado, int canal, int volume, int tamanho_ecra) {
        //super(marca, potenciaMax, estado);
        this.canal = canal;
        this.volume = volume;
        this.tamanho_ecra = tamanho_ecra;
    }
    
    public TV (TV nova){
        System.out.println("Construtor de Copia Chamado: ");
        canal = nova.canal;
        volume = nova.volume; 
        tamanho_ecra = nova.tamanho_ecra;
    }
    
    public int getTamanho_ecra() {
        return tamanho_ecra;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }


    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    @Override
    public String toString() {
        super.toString();
        return "TV{" + "canal=" + canal + ", volume=" + volume + ", tamanho_ecra=" + tamanho_ecra + '}';
    }
    
    
    
    

    
}

