/*
    Classe UsaCartaoCliente para teste da classe CartaoCliente
 */
package exerciciopoo3;


public class UsaCartaoCliente {
    
    public static void main( String []args ){
        
        CartaoCliente c1 = new CartaoCliente();
        c1.setTitular("Maria");
        c1.setNumero(200);

        CartaoCliente c2 = new CartaoCliente( 100, "Manuel" );
        
        c1.mostra();
        c2.mostra();
        
        c1.credita(45.5);
        
        c1.mostra();
        c2.mostra();
        
        c2.transfere( c1 );
        
        c1.mostra();
        c2.mostra();
        
        c2.debita(20.0);
        
        c1.mostra();
        c2.mostra();
        
        System.out.println( "Clientes de " + CartaoCliente.getNomeDoBanco() );
        System.out.println( c1 );
        System.out.println( c2 );
        
        CartaoCliente.setNomeDoBanco("Banco Mau");
        
        System.out.println( "Clientes de " + CartaoCliente.getNomeDoBanco() );
        System.out.println( c1 );
        System.out.println( c2 );
        
        
    }
}
