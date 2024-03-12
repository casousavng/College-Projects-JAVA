/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto4;

/**
 *
 * @author andresousa
 */
public class ColunaSom extends TV {
    
    private double potencia;    
    private boolean estado_coluna;

    public ColunaSom() {
        this.potencia = 0;
        this.estado_coluna = false;
    }

    public ColunaSom(double potencia, boolean estado_coluna, int canal, int volume, int tamanho_ecra) {
        //super(null, null, null, canal, volume, tamanho_ecra);
        this.potencia = potencia;
        this.estado_coluna = estado_coluna;
    }
    
        public boolean isEstado_coluna() {
        return estado_coluna;
    }

    public void setEstado_coluna(boolean estado_coluna) {
        this.estado_coluna = estado_coluna;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    
}
