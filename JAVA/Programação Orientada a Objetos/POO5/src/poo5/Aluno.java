/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo5;

/**
 *
 * @author andresousa
 */
public class Aluno extends Pessoa {

    private int numero;
    private String turma;

    public String getTurma() {
        return turma;
    }

    public int getNumero() {
        return numero;
    }

    public Aluno(String nome, char genero, int idade, int numero, String turma) {
        super(nome, genero, idade);
        this.numero = numero;
        this.turma = turma;
    }

    public Aluno() {
        this("",' ',0,0,"");
    }
    
    @Override
    
    public void falar(){
        super.falar();
        System.out.print(" e sou um Aluno.");
    }

    @Override
    public String toString() {
        return super.toString() + "\nNumero = " + numero + "\nTurma = " + turma;
    }
    
    
    
    


    
    


    
}
