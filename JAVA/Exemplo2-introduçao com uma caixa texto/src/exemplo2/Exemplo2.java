package exemplo2;

import javax.swing.JOptionPane;


public class Exemplo2 {
    
        public static void main(String[] args) {
        
    int x;
    
    x = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira um numero inteiro: "));
    
    JOptionPane.showMessageDialog(null, "O numero intruduzido foi " + x + ".");

    }
    
}
