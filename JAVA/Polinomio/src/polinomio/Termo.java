/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polinomio;

/**
 *
 * @author andresousa
 */

public class Termo {
    
    int expoente;
    double coeficiente;
    Termo proximo;
    
    public int getExpoente() {
        return expoente;
    }

    public void setExpoente(int expoente) {
        this.expoente = expoente;
    }

    public double getCoeficiente() {
        return coeficiente;
    }

    public void setCoeficiente(double coeficiente) {
        this.coeficiente = coeficiente;
    }

    public Termo getProximo() {
        return proximo;
    }

    public void setProximo(Termo proximo) {
        this.proximo = proximo;
    }
    
    public Termo() {
        expoente = 0;
        coeficiente = 0;
        proximo = null;       
    }
    
    public Termo(double coeficiente, int expoente) {
        this.coeficiente = coeficiente;
        this.expoente = expoente;
        this.proximo = null;
    }


}
