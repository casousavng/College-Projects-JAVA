
package areaperimetrotriangulos;

import java.util.Scanner;

public class AreaPerimetroTriangulos {

    // metodo para verificar se as medidas sao validas
    public static boolean triangulo( double a, double b, double c){
        return (a<b+c && b<a+c && c<a+b );
    }
    
    // metodo para classificar o triangulo
    public static String tipoTriangulo( double a, double b, double c){
        if( a==b && a==c )
        return "equilatero";
    else
        if( a!=b && a!=c && b!=c) 
            return "escaleno";
        else
            return "isosceles";
    }
    
    // metodo para calcular o perimetro
    public static double perimetro( double a, double b, double c ){
        return a+b+c;
    }
    
    // metodo para calcular a area pela formula de Heron
    public static double area( double a, double b, double c ){
        double p = (a+b+c)/2;
        return Math.sqrt( p * (p-a) * (p-b) * (p-c));
    }
    
    // programa principal
    public static void main(String[] args) {
        Scanner leia = new Scanner( System.in );
        double x, y, z;
        do{
            System.out.print("Insira a medida do primeiro lado: ");
            x = leia.nextDouble();
            System.out.print("Insira a medida do segundo  lado: ");
            y = leia.nextDouble();
            System.out.print("Insira a medida do terceiro lado: ");
            z = leia.nextDouble();
            
            if( triangulo( x, y, z ) ){
                System.out.println("As medidas sao validas");
                System.out.println("O triangulo e " + tipoTriangulo( x, y, z ));
                System.out.println("Perimetro = " + perimetro( x, y, z ) );
                System.out.println("Area = " + area( x, y, z ));
            }
            else
                System.out.println("Os valores inseridos nao podem ser as "
                        + "medidas dos lados de um triangulo");
            
        }while( x>0 && y>0 && z>0 );
    }
}
