package trabalhofinalltc;

/**
 * Classe que representa estatísticas de caracteres num texto.
 * Calcula e exibe os caracteres mais frequentes num texto, juntamente com as suas frequências e percentagens de ocorrência.
 * Utiliza um Max Heap para encontrar os caracteres mais frequentes.
 * Armazena os resultados num array de Strings e oferece a opção de gravar num arquivo CSV.
 * @author @author andresousa e fábiopinto
 */

public class Caracteres {

    FicheiroTexto ficheiroTexto = new FicheiroTexto(); // Instância da classe FicheiroTexto para operações de gravação em arquivo.

    final private char caracter; // Variável final que indica os caracteres.
    final private int frequencia; // Variável final que indica a frequência dos caracteres.
    private String[] txt; // Array de Strings que armazena o texto final.
    int numCar = 0; // Contador de caracteres no array.

    // Construtor padrão que inicializa o objeto com valores padrão.
    public Caracteres() {
        this.caracter = ' ';
        this.frequencia = 0;
        this.txt = new String[30];
    }
    
    // Construtor que aceita valores específicos para caracter e frequência.
    public Caracteres(char caracter, int frequencia) {
        this.caracter = caracter;
        this.frequencia = frequencia;
    }

    // Método para obter o caractere.
    public char getCaracter() {
        return caracter;
    }

    // Método para obter a frequência do caractere.
    public int getFrequencia() {
        return frequencia;
    }

    // Método para obter o array de Strings que armazena o texto final.
    public String[] getTxt() {
        return txt;
    }

    // Método para definir o array de Strings que armazena o texto final.
    public void setTxt(String[] txt) {
        this.txt = txt;
    }

    /**
     * Encontra os caracteres com a maior frequência no array usando Max Heap.
     * Calcula as estatísticas de frequência, gera uma representação em texto e grava num arquivo CSV.
     * @param texto O texto a ser analisado.
     * @param qtdCarAnalisar A quantidade de caracteres a serem analisados.
     * @param totalCaracteres O total de caracteres no texto.
     */
    public void ContaCar(String texto, int qtdCarAnalisar, int totalCaracteres) {

        // Contagem da frequência de caracteres através do método de comparação pelo código ASCII.
        int[] frequencia1 = new int[128]; // Assumindo os 128 caracteres possíveis do código ASCII.

        for (char c : texto.toCharArray()) {
            if (c < 128) { // Verifica se o código ASCII é válido para evitar ArrayIndexOutOfBoundsException.
                frequencia1[c]++;
            }
        }

        // Construir um Max Heap manualmente.
        Caracteres[] maxHeap = new Caracteres[qtdCarAnalisar];
        int heapSize = 0;

        // Adicionar caracteres ao Max Heap.
        for (int i = 0; i < frequencia1.length; i++) {
            if (frequencia1[i] > 0) {
                char caracter1 = (char) i;
                Caracteres cf = new Caracteres(caracter1, frequencia1[i]);
                if (heapSize < qtdCarAnalisar) {
                    maxHeap[heapSize] = new Caracteres(caracter1, frequencia1[i]);
                    heapifyUp(maxHeap, heapSize);
                    heapSize++;
                } else {
                    if (cf.getFrequencia() > maxHeap[0].getFrequencia()) {
                        maxHeap[0] = cf;
                        heapifyDown(maxHeap, 0, heapSize);
                    }
                }
            }
        }

        // Mostra os n caracteres mais frequentes.
        System.out.println("Here's the list of the " + qtdCarAnalisar + " characters that appear most frequently in this text.");
        ficheiroTexto.gravarDadosCSVfrequenciaCaracteres(' ', 0, 0.00);

        for (int i = 0; i < qtdCarAnalisar && heapSize > 0; i++) {
            Caracteres cf = maxHeap[0];
            char caracter1 = cf.getCaracter();
            int freq = cf.getFrequencia();
            double media = ((double) freq / (double) totalCaracteres) * 100;

            // Imprime o caractere, a frequência e a porcentagem de ocorrência.
            System.out.print(caracter1 + ": " + freq + " times " + "(FR=");
            System.out.printf("%.1f" + "%%)\n", media);
            ficheiroTexto.gravarDadosCSVfrequenciaCaracteres(caracter1, freq, media);

            double mediaRedonda = Math.round(media * 10.0) / 10.0;
            txt[numCar] = ("Letter " + caracter1 + ": " + freq + " times " + "(FR=" + mediaRedonda + "%)");
            numCar += 1;

            // Remove o máximo do heap e ajusta o heap.
            maxHeap[0] = maxHeap[heapSize - 1];
            heapSize--;
            heapifyDown(maxHeap, 0, heapSize);
        }
    }

    // Método para ajustar o heap para cima (usado ao inserir).
    // index a 0 indica o elemento que foi inserido recentemente 
    public static void heapifyUp(Caracteres[] heap, int index) {
        while (index > 0) {
            // Calcula o índice do pai no heap.
            int parentIndex = (index - 1) / 2;

            // Compara a frequência do elemento atual com a do pai.
            if (heap[index].getFrequencia() > heap[parentIndex].getFrequencia()) {
                // Se a frequência do elemento atual for maior que a do pai, troca os elementos.
                swap(heap, index, parentIndex);
                // Atualiza o índice para o pai e repete o processo.
                index = parentIndex;
            } else {
                // Se a condição de max heap for mantida, encerra o loop.
                break;
            }
        }
    }

    // Método para ajustar o heap para baixo (usado ao remover o máximo).
    // Index 0 representa o elemento que foi removido e heapsize o tamnho atual do heap
    public static void heapifyDown(Caracteres[] heap, int index, int heapSize) {
        while (true) {
            // Calcula os índices dos filhos esquerdo e direito.
            int leftChildIndex = 2 * index + 1;
            int rightChildIndex = 2 * index + 2;
            int largestIndex = index;

            // Compara a frequência do elemento atual com a do filho esquerdo, se existir.
            if (leftChildIndex < heapSize && heap[leftChildIndex].getFrequencia() > heap[largestIndex].getFrequencia()) {
                largestIndex = leftChildIndex;
            }

            // Compara a frequência do elemento atual com a do filho direito, se existir.
            if (rightChildIndex < heapSize && heap[rightChildIndex].getFrequencia() > heap[largestIndex].getFrequencia()) {
                largestIndex = rightChildIndex;
            }

            // Se o índice do elemento atual for diferente do índice do maior filho,
            // troca os elementos e atualiza o índice para o filho.
            if (index != largestIndex) {
                swap(heap, index, largestIndex);
                index = largestIndex;
            } else {
                // Se a condição de max heap for mantida, encerra o loop.
                break;
            }
        }
    }

    // Método para trocar elementos no heap.
    // Indice [i] para o primeiro elemento [j] para o segundo elemento 
    public static void swap(Caracteres[] heap, int i, int j) {
        // Troca os elementos nos índices i e j no heap.
        Caracteres temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    // Sobrescrita do método toString para gerar uma representação em string do array de resultados.
    @Override
    public String toString() {
        StringBuilder textoFinal = new StringBuilder();
        for (String linha : txt) {
            if (linha == null)
                break;
            textoFinal.append(linha).append("\n");
        }
        return textoFinal.toString();
    }
}