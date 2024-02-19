/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maqvenda;

/**
 *
 * @author andresousa
 */
public class MaquinaVenda {
    
    private String tipo;
    private String estado;
    private double dinheiro;
    private int totalVendas;
    private int totalProdutos;
    
    private Produto []produtos;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
     
    public int getTotalProdutos() {
        return totalProdutos;
    }

    public void setTotalProdutos(int totalProdutos) {
        this.totalProdutos = totalProdutos;
    }

    public int getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(int totalVendas) {
        this.totalVendas = totalVendas;
    }

    double getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(double dinheiro) {
        this.dinheiro = dinheiro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
        
       
    }
    
    public void adicionarProduto(String nome, double preco, int quantidade){
        if (totalProdutos < 50){
            Produto produto = new Produto(nome, preco, quantidade);
            produtos[totalProdutos] = produto;
            totalProdutos++;
            }
    }
        
    public void inserirDinheiro(double montante){
            dinheiro += montante;

    }
    
    public double precoProduto(String nome){
        for (int i = 0; i < totalProdutos; i++){
            if (produtos[i].getNome().equals(nome))
                return produtos[i].getPreco();
        }return 0;  
    } 
    
    public boolean vendaProduto(String nome){
        if (estado.equals("OK")){                                                    // testa se a maquina esta Ok para fornecer
            for (int i = 0; i < totalProdutos; i++){                                        // percorre o total dos produtos desde o indice 0
                if(produtos[i].getNome().equals(nome)){                              // testa se o nome do produto a comprar consta na maquina
                    if (produtos[i].getQuantidade() > 0){                                   // verifica se a QTD do produto é maior que zero
                       double preco = produtos[i].getPreco();                               // recolhe o preço do produto no vetor
                       produtos[i].setQuantidade(produtos[i].getQuantidade() - 1);          // reduz a quantidade do produto em uma unidade
                       dinheiro += preco;                                                   // adiciona ao valor em caixa o montante pago
                       totalVendas++;                                                       // adiciona ao contador de venda uma unidade
                       return true;
                    } 
                }      
            }   
        }
        else
            return false;
        return false;
    }
    
    public void listaProdutosDetalhada(){
        for (int i = 0; i < totalProdutos; i++ ){
            System.out.println(produtos[i].toString());
        } 
    } 
    
    public void listaProdutos(){
        for (int i = 0; i < totalProdutos; i++){
            System.out.println(produtos[i].getNome());
        }
    }
    
    /*
    public void totalProdutos(){
        for(int i = 0; i < totalProdutos; i++){
            produtos[i].getQuantidade() += produtos[i].setQuantidade();
        }        
    }
    */
    
    public void adicionarStock(String nome, int stock){
        for (int i = 0; i < totalProdutos; i++){
            if (produtos[i].getNome().equals(nome))
                produtos[i].setQuantidade(produtos[i].getQuantidade() + stock);
        }
    } 
     
    public MaquinaVenda(String tipo, String estado, double dinheiro, int totalVendas, int totalProdutos) {
        this.tipo = tipo;
        this.estado = estado;
        this.dinheiro = dinheiro;
        this.totalVendas = totalVendas;
        this.totalProdutos = totalProdutos;
        this.produtos = new Produto[50];
    }

    public MaquinaVenda() {
        this("","",0,0,0);    
    }

    @Override
    public String toString() {
        return "-INFO-" + 
                "\nEstado Atual: " + estado +
                "\nTipo de Produtos: " + tipo +
                "\nDinheiro em caixa: " + dinheiro + "€" +
                "\nTotal de Artigos a Venda: " + (totalProdutos) + " artigos." +
                "\nTotal de Vendas: " + totalVendas
                ;
    }  
       
}

