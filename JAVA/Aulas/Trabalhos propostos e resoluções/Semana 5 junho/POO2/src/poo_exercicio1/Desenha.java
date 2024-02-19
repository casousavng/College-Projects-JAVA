// drawOval - https://chortle.ccsu.edu/java5/notes/chap36/ch36_5.html
// https://www.delftstack.com/howto/java/draw-a-circle-in-java/?utm_content=cmp-true
// https://www.oracle.com/java/technologies/painting.html#

package poo_exercicio1;

import javax.swing.*;
import java.awt.*;

public class Desenha extends JFrame{
    
    private int x;
    private int y;
    private int largura;
    private int altura;
    
    public Desenha( Circulo c ){
        
       largura = 2 * (int)(c.getRaio());
       altura  = 2 * (int)(c.getRaio());
       
       x = (int)c.getX() - (int)c.getRaio();
       y = (int)c.getY() - (int)c.getRaio();
       
       setTitle("Drawing a Circle");
       setSize( 1400, 800 );
       setVisible(true);
       setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawOval(x, y, largura, altura);
    }
        
    public static void main(String[] args) {


    }
}
