
package maqvenda;

public class Produto {
    
    private String nome;    
    private double preco;
    private int quantidade;

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade < 0)
            this.quantidade = 0;
        else
            this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Produto() {
       this("",0,0);
    }

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return  "\nProduto: " + nome + 
                "\nPreço: " + preco + "€" +
                "\nStock: " + quantidade + "un." +
                "";
    }
    
    
    
    
    
    
    
    

    
}
