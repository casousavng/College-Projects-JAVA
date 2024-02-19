package metodos_recursivos;

public class Metodos_recursivos {
    
    public static int combinacoes( int n, int p ){
        if( n == p || p == 0 ){
            return 1;
        }
        if( p == 1 ){
            return n;
        }
        return combinacoes( n-1, p ) + combinacoes( n-1, p-1 );
    }
     
    public static int combinacoes2( int n, int p ){
        return fatorial( n ) / ( fatorial( p ) * fatorial( n-p ));
    }
   
    public static int fatorial( int n ){
        
        if( n == 0 || n== 1 ){
            return 1;
        }
         
        return n * fatorial( n-1 );
    }
    
    public static void binario( int n ){
        
        if( n == 0)
            return;
        
        binario( n/2 );
        System.out.print( n%2 );
    }
    
    public static int produto( int a, int b ){
        
        if( b == 1 )
            return a;
        if( a == 1 )
            return b;
        else
            return a + produto( a, b-1 );
    }
    
    public static int soma( int a, int b ){
        
        if( b == 0 )
            return a;
        else
            return 1 + soma( a, b-1 );
    }
        
    public static int potencia( int base, int expoente ){
        
        if( expoente == 0 )
            return 1;
        if( expoente == 1 )
            return base;
        return base * potencia( base, expoente-1 );
    }
    
    public static void p( int n ){
        if( n > 0 ){
            p( n-2 );
            System.out.println( n );
            p( n-1 );
        }
    }
    
    public static void f( int n ){
        if( n > 0 ){
            f( n/4 - 50 );
            f( n/2 - 20 );
            System.out.println( n );
        }
    }
    
    public static void main(String[] args) {
        System.out.println("fatorial: " + fatorial( 5 ));
        System.out.println("soma: " + soma( 5, 4 ));
        System.out.println("produto: " + produto( 5, 4 ));
        System.out.println("potencia: " + potencia( 2, 3 ));
        System.out.println("");
        p( 4 );
        System.out.println("");
        f( 400 );
        
    }
}