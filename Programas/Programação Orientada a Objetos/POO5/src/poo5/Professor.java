/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo5;

/**
 *
 * @author andresousa
 */
public class Professor extends Pessoa {
    
    private String docencia;    
    private char escalao;

    public char getEscalao() {
        return escalao;
    }

    public String getDocencia() {
        return docencia;
    }

    public Professor(String nome, char genero, int idade, String docencia, char escalao) {
        super(nome, genero, idade);
        this.docencia = docencia;
        this.escalao = escalao;
    }

    public Professor() {
        this("",' ',0,"",' ');
    }
    
    public void falar(){
        super.falar();
        System.out.print(" e sou Professor.");
    }

    @Override
    public String toString() {
        return super.toString() + "\nDocencia = " + docencia + "\nEscalao = " + escalao;
    }

    
    
   

    
    
    
    
    

}
