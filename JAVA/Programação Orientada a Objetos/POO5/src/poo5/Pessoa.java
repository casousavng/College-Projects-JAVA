/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo5;

public class Pessoa{

      private String nome;
      private char genero;
      private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
      
    public Pessoa(){
        this("",' ',0);
    }

    public Pessoa( String nome, char genero, int idade ){
        this.nome = nome;
        this.genero = genero;
        this.idade = idade;
    }

    public void falar(){
        System.out.print( "Sou uma pessoa");
    }

    @Override
    public String toString() {
        return "Nome = " + nome + "\nGenero = " + genero + "\nIdade = " + idade;
    }
    
        public static void main(String[] args) {
        // TODO code application logic here
        
        Aluno aluno1 = new Aluno("Carlos", 'M', 36, 5, "EI1");
        System.out.println(aluno1.toString());
        aluno1.falar();
        
        System.out.println("");
        System.out.println("");
        
        Professor prof1 = new Professor("Jorge", 'M', 50, "Programacao", 'B');
        System.out.println(prof1.toString());
        prof1.falar();
        
        System.out.println("");
}

}
