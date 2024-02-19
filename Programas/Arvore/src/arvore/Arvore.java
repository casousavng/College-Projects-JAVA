/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arvore;

/**
 *
 * @author andresousa
 */
public class Arvore {
	private No raiz;

	public Arvore() {
		raiz = null;
	}

	public void adiciona(int e) {
		if (raiz == null) {
			raiz = new No(e);
		} else {
			No aux1 = raiz;
			No aux2 = raiz;

			while (aux1 != null) {
				aux2 = aux1;
				if (e > aux1.dado) {
					aux1 = aux1.dir;
				} else {
					aux1 = aux1.esq;
				}
			}

			if (e > aux2.dado) {
				aux2.dir = new No(e);
			} else if (e < aux2.dado) {
				aux2.esq = new No(e);
			} else {
				System.out.println("Erro! Elemento já existente na árvore.");
			}
		}
	}

	public void exibe(int opc) {
		if (raiz != null) {
			System.out.print("\n\n");
			switch (opc) {
				case 1:
					System.out.println("Pré-ordem: ");
					preOrdem(raiz);
					break;
				case 2:
					System.out.println("Ordem: ");
					ordem(raiz);
					break;
				case 3:
					System.out.println("Pós-ordem: ");
					posOrdem(raiz);
					break;
			}
			System.out.print("\n\n");
		} else {
			System.out.println("Erro! A árvore está vazia.");
		}
	}

	public void preOrdem(No no) {
		if (no != null) {
			System.out.printf("| %d |", no.dado);
			preOrdem(no.esq);
			preOrdem(no.dir);
		}
	}

	public void ordem(No no) {
		if (no != null) {
			ordem(no.esq);
			System.out.printf("| %d |", no.dado);
			ordem(no.dir);
		}
	}

	public void posOrdem(No no) {
		if (no != null) {
			posOrdem(no.esq);
			posOrdem(no.dir);
			System.out.printf("| %d |", no.dado);
		}
	}
        
          public int conta(No no){
          int resp=0;
	       if (no!=null){
				 resp = conta(no.esq)+
				 conta(no.dir)+ 1;
			 }
          return resp;
	}
          
          	public void profundidade(No no){
	       if (no!=null){
			    System.out.print(" "+no.dado);
				 profundidade(no.esq);
				 profundidade(no.dir);
			 }
	}
                
        	public void ordemSimetrica(No no){
	       if (no!=null){
				 ordemSimetrica(no.esq);
			    System.out.print(" "+no.dado);
				 ordemSimetrica(no.dir);
			 }
	}
          
          
}