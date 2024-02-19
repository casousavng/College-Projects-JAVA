/*
    Classe CartaoCliente
 */
package exerciciopoo3;


public class CartaoCliente {
    // variaveis de instancia
    private int numero;
    private String titular;
    private double pontos;
    
    // variavel de classe
    private static String nomeDoBanco;
    
    // construtor sem parametros
    public CartaoCliente(){
        numero = 0;
        titular = "";
        pontos = 0.0;
        nomeDoBanco = "Banco Bom";
    }
    
    // construtor com parametros
    public CartaoCliente( int numero, String titular ){
        pontos = 0;
        this.titular = titular;
        this.numero = numero;
        nomeDoBanco = "Banco Bom";
    }
    
    // metodos de acesso static
    public static String getNomeDoBanco(){
        return nomeDoBanco;
    }
    
    public static void setNomeDoBanco( String nomeDoBanco ){
        CartaoCliente.nomeDoBanco = nomeDoBanco;
    }
    
    public int getNumero(){
        return numero;
    }
    
    // metodos de acesso (de instancia)
    public void setNumero( int numero ){
        this.numero = numero;
    }
    
    public String getTitular(){
        return titular;
    }
    
    public void setTitular( String titular ){
        this.titular = titular;
    }
    
    public double getPontos(){
        return pontos;
    }
    
    public void setpontos( double pontos ){
        this.pontos = pontos;
    }
    
    // outros metodos de instancia
    public void credita( double pontos ){
        this.pontos += pontos;
    }
    
    public void debita( double pontos ){
        this.pontos -= pontos;
    }
    
    public void transfere( CartaoCliente c ){
        pontos = c.pontos;
        c.pontos = 0.0;
    }
    
    public void mostra(){
        System.out.println( "Pontos = " + pontos );
    }
    
    // sobreposicao (overriding) do metodo toString, herdado da classe Object
    @Override
    public String toString(){
        return "" + nomeDoBanco + ":" + numero+":"+titular+":"+pontos;
    }
}
