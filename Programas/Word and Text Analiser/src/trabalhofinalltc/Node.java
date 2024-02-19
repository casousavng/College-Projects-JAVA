
package trabalhofinalltc;

/**
 * Classe que representa um nó em uma árvore binária.
 * Cada nó contém uma instância de Palavra, além de referências para seus filhos esquerdo e direito.
 * Utilizada para a construção de árvores e heaps.
 * @author andresousa e fábiopinto
 */

public class Node {
    private Palavra palavra; // Palavra armazenada no nó.
    private Node esquerda;   // Referência para o filho esquerdo.
    private Node direita;    // Referência para o filho direito.

    // Construtor sem parâmetros que inicializa o nó com valores nulos.
    public Node() {
        this.palavra = null;
        this.esquerda = null;
        this.direita = null;
    }
    
    // Construtor com parâmetros que inicializa o nó com uma palavra e referências para os filhos.
    public Node(String palavra, int ocorrencias, int linha, Node esquerda, Node direita) {
        this.palavra = new Palavra(palavra, ocorrencias, linha);
        this.esquerda = esquerda;
        this.direita = direita;
    }
    
    // Método para obter a palavra armazenada no nó.
    public Palavra getPalavra() {
        return palavra;
    }

    // Método para definir a palavra armazenada no nó.
    public void setPalavra(Palavra palavra) {
        this.palavra = palavra;
    }

    // Método para obter a localização para o filho esquerdo.
    public Node getEsquerda() {
        return esquerda;
    }

    // Método para definir a localização para o filho esquerdo.
    public void setEsquerda(Node esquerda) {
        this.esquerda = esquerda;
    }

    // Método para obter a localização para o filho direito.
    public Node getDireita() {
        return direita;
    }

    // Método para definir a localização para o filho direito.
    public void setDireita(Node direita) {
        this.direita = direita;
    }

    // Implementação do método toString (em modo Override) para gerar uma representação em string do nó.
    @Override
    public String toString() {
        return palavra.toString();
    }
}