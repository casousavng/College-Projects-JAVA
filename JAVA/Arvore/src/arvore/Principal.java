/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arvore;
import java.util.Scanner;
/**
 *
 * @author andresousa
 */
public class Principal {
    
public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Arvore arvore = new Arvore();
		int opc, e;

		do {
			System.out.println("1 - Adiciona elemento\n2 - Exibe árvore\n9 - Sair");
			opc = input.nextInt();

			switch (opc) {
				case 1:
					System.out.print("Elemento: ");
					e = input.nextInt();
					arvore.adiciona(e);
					break;
				case 2:
					System.out.println("  1 - Pré-ordem\n  2 - Ordem\n  3 - Pós-ordem");
					opc = input.nextInt();
					arvore.exibe(opc);
			}
		} while (opc != 9);
	}
}
