/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arvore;

/**
 *
 * @author andresousa
 */
public class No {
	public int dado;
	public No esq, dir;

	public No(int dado) {
		this.dado = dado;
		esq = null;
		dir = null;
	}
}
