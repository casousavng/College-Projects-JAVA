
package trabalhofinalltc;
/**
 * Classe que representa um nó em uma lista encadeada de linhas.
 * Cada nó contém uma linha, uma referência para o próximo nó, e uma referência para a lista de linhas.
 * Utilizada para armazenar as linhas em que uma palavra ocorre.
 * @author andresousa e fábiopinto
 */

public class NodeLista {
    
    private final int linha;    // Número da linha
    private NodeLista proximo;  // Referência para o próximo nó na lista
    public NodeLista linhas;    // Referência para a lista de linhas

    // Construtor sem parametros que iniciliza o NodeLista
    public NodeLista() {
        this.linha = 0;
        this.proximo = null;
        this.linhas = null;
    }
    
    // Construtor que inicializa um nó com um número de linha
    public NodeLista(int linha) {
        this.linha = linha;
        this.proximo = null;     
    }
    
    // Método para obter o número da linha
    public int getLinha() {
        return linha;
    }

    // Método para definir o número da linha e adicionar à lista ordenada, se não estiver presente
    public void setLinha(int linha) {
        
        if (!contemLinha(linha, linhas)) {
            
            // Cria um novo nó com o número da linha
            NodeLista novoNode = new NodeLista(linha);

            if (linhas == null || linha < linhas.linha) {
                // Adiciona no início se a lista estiver vazia ou o valor é menor que o primeiro nó
                proximo = linhas;
                linhas = novoNode;
            } 
            else {
                // Encontra o local adequado para inserção ordenada
                NodeLista anterior = null;
                NodeLista atual = linhas;

                while (atual != null && linha > atual.linha) {
                    anterior = atual;
                    atual = atual.proximo;
                }
                // Insere o novo nó entre o anterior e o atual
                anterior.proximo = novoNode;
                novoNode.proximo = atual;
            }
        }
    }
    
    // metodo que verifica se a linha já está presente na lista
    private boolean contemLinha(int linha, NodeLista linhas) {
       
        NodeLista atual = linhas;
        while (atual != null) {
            if (atual.linha == linha) {
                return true;
            }
            atual = atual.proximo;
        }
        return false;
    }
 
    // Método para obter o próximo nó na lista
    public NodeLista getProximo() {
        return proximo;
    }

    // Método para definir o próximo nó na lista
    public void setProximo(NodeLista proximo) {
        this.proximo = proximo;
    }
    
    // Converte a lista de linhas para uma representação de string no Output visual do Netbeans
    public String linhasToString() {
        
        StringBuilder resultado = new StringBuilder();
        NodeLista linhaString = linhas;
        
        // Itera sobre os nós da lista de linhas
        while (linhaString != null) {
            resultado.append(linhaString.toString()); // Adiciona a representação em string do nó atual ao resultado
            
            // Verifica se há um próximo nó na lista
            if (linhaString.proximo != null) {
                // Verifica se o próximo nó é igual ao nó da lista principal (linhas)
                if ( linhas.equals(linhaString));
                    resultado.append(", "); // Adiciona uma vírgula e um espaço ao resultado se não for o último nó
            }
            // Move para o próximo nó na lista
            linhaString = linhaString.proximo;
        }

        return resultado.toString(); // Retorna a representação em string das linhas
    }
    
    // Converte a lista de linhas para uma representação de string para exportação no ficheiro CSV
    public String linhasToPrint() {
        
        StringBuilder resultadoPrint = new StringBuilder();
        NodeLista linhaPrint = linhas;
        
        // Itera sobre os nós da lista de linhas
        while (linhaPrint != null) {
            resultadoPrint.append(linhaPrint.toString()); // Adiciona a representação em string do nó atual ao resultado
            
            // Verifica se há um próximo nó na lista
            if (linhaPrint.proximo != null) { 
                
                // Verifica se o próximo nó é igual ao nó da lista principal (linhas)
                if ( linhas.equals(linhaPrint));
                    resultadoPrint.append("/"); // Adiciona um / ao resultado se não for o último nó
            }
            // Move para o próximo nó na lista
            linhaPrint = linhaPrint.proximo;
        }

        return resultadoPrint.toString(); // Retorna a representação em string das linhas para xportação
    }
    
    // Implementação do método toString (em modo Override) para gerar uma representação de string do nó
    @Override
    public String toString() {
        return Integer.toString(linha);
    }
}