package fibonacci;

public class Fibonacci {

    public static void fib( int i, int max, int f1, int f2 ){
        if( i == max )
            return;
        if( f1 == 1 && f2 == 1 ){
            System.out.println( f1 );
            System.out.println( f2 );
        }
        System.out.println( (f1+f2) );
        fib( i+1, max, f2, f1+f2 );
    }
   
    public static void main(String[] args) {
        // exemplo com os 20 primeiros números da série de Fibonacci
        fib( 1, 20, 1, 1 );
    }

}
