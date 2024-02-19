/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polinomio;

/**
 *
 * @author andresousa
 */

public class Polinomio {
    
    private Termo inicio;
    
    public Polinomio() {
        inicio = null;
    }
    
    public void adicionaTermo(double coeficiente, int expoente) {
        
        Termo novoTermo = new Termo(coeficiente, expoente);
        
        if (inicio == null) {
            inicio = novoTermo;
        } else {
            Termo inicial = inicio;
            while (inicial.proximo != null) {
                inicial = inicial.proximo;
            }
            inicial.proximo = novoTermo;
        }
    }
        
    public void removeTermo(int expoente) {
        
        if (inicio == null) {
            return;
        }
        
        if (inicio.expoente == expoente) {
            inicio = inicio.proximo;
            return;
        }
        
        Termo inicial = inicio;
        
        while (inicial.proximo != null) {
            if (inicial.proximo.expoente == expoente) {
                inicial.proximo = inicial.proximo.proximo;
                return;
            }
            inicial = inicial.proximo;
        }
    }
    
    public void imprimirPolinomio(Termo inicial) {
        if (inicial == null) {
            return;
        }
        
        if (inicial.coeficiente > 0 && inicial.expoente > 0 )
            System.out.print(inicial.coeficiente + "x^" + inicial.expoente);
        else if (inicial.coeficiente < 0 && inicial.expoente > 0 )
            System.out.print("("+inicial.coeficiente + "x^" + inicial.expoente+")");
        else if (inicial.coeficiente < 0 && inicial.expoente < 0) 
            System.out.print("("+inicial.coeficiente + "x^("+ inicial.expoente+"))");
        else if (inicial.coeficiente > 0 && inicial.expoente < 0 || inicial.coeficiente > 0 && inicial.expoente < 0 )
            System.out.print(inicial.coeficiente + "x^" + "("+inicial.expoente+")");
        else if (inicial.coeficiente > 0 && inicial.expoente == 0)
            System.out.print(inicial.coeficiente);
        else if (inicial.coeficiente < 0 && inicial.expoente == 0)
            System.out.print("(" + inicial.coeficiente + ")");
        
        if (inicial.proximo != null) {
            System.out.print(" + ");
        }
        imprimirPolinomio(inicial.proximo);
    }
    
    public void imprimir() {
        
        imprimirPolinomio(inicio);
        System.out.println();
    }
    
    public int grau() {
        
        int grauMax = -1;
        
        Termo inicial = inicio;
                
        while (inicial != null) {
            grauMax = Math.max(grauMax, inicial.expoente);
            inicial = inicial.proximo;
        }
        return grauMax;
    }
    
    public int contaTermos() {
        
        int contador = 0;
        
        Termo inicial = inicio;
        
        while (inicial != null) {
            contador++;
            inicial = inicial.proximo;
        }
        return contador;
    }

    public void ordenarPolinomio() {
        
        // bubble sort
        
        Termo inicial, indice;
        
        if (inicio == null) {
            return;
        }

        for (inicial = inicio; inicial.proximo != null; inicial = inicial.proximo) {
            for (indice = inicial.proximo; indice != null; indice = indice.proximo) {
                if (inicial.expoente < indice.expoente) {
                    double meioCoeficiente = inicial.coeficiente;
                    int meioExpoente = inicial.expoente;
                    inicial.coeficiente = indice.coeficiente;
                    inicial.expoente = indice.expoente;
                    indice.coeficiente = meioCoeficiente;
                    indice.expoente = meioExpoente;
                }
            }
        }
    }
    
    public double calculoValor(double x) {
        
        double resultado = 0;
        
        Termo inicial = inicio;
        
        while (inicial != null) {
            resultado += inicial.coeficiente * Math.pow(x, inicial.expoente);
            inicial = inicial.proximo;
        }
        return resultado;
    }
}
    

