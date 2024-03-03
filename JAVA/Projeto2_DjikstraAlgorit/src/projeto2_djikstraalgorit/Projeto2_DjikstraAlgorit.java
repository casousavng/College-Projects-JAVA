/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projeto2_djikstraalgorit;

import java.util.*;

class Grafo {
    private Map<String, Map<String, Integer>> cidades;

    public Grafo() {
        this.cidades = new HashMap<>();
    }

    public void adicionarCaminho(String cidadeA, String cidadeB, int distancia) {
        cidades.computeIfAbsent(cidadeA, k -> new HashMap<>()).put(cidadeB, distancia);
        cidades.computeIfAbsent(cidadeB, k -> new HashMap<>()).put(cidadeA, distancia);
    }

    public Map<String, Integer> obterCidadesAdjacentes(String cidade) {
        return cidades.getOrDefault(cidade, Collections.emptyMap());
    }
}

public class Projeto2_DjikstraAlgorit {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        Grafo grafo = new Grafo();
        
        // A1 Sentido: Lisboa -> Porto
        grafo.adicionarCaminho("Lisboa", "Leiria", 176);
        grafo.adicionarCaminho("Leiria", "Aveiro", 127); 
        grafo.adicionarCaminho("Aveiro", "Porto", 76);
        grafo.adicionarCaminho("Lisboa", "Coimbra", 204);  // A1
        grafo.adicionarCaminho("Coimbra", "Aveiro", 66);  // A1

        // A1 Sentido: Porto -> Lisboa
        grafo.adicionarCaminho("Porto", "Aveiro", 76);
        grafo.adicionarCaminho("Leiria", "Lisboa", 176);
        
        grafo.adicionarCaminho("Aveiro", "Coimbra", 66);  // A1
        grafo.adicionarCaminho("Coimbra", "Lisboa", 204);  // A1

        // Ligações diretas secundárias - A1 
        grafo.adicionarCaminho("Braganca", "Porto", 222);  // A4
        grafo.adicionarCaminho("Porto", "Braganca", 222);  // A4
        grafo.adicionarCaminho("Guarda", "Braganca", 262);  // A24
        grafo.adicionarCaminho("Braganca", "Guarda", 262);  // A24
        grafo.adicionarCaminho("Guarda", "Castelo Branco", 139);  // A23
        grafo.adicionarCaminho("Castelo Branco", "Guarda", 139);  // A23

        // Ligações secundárias entre cidades - A1 
        grafo.adicionarCaminho("Lisboa", "Faro", 278);  // A2
        grafo.adicionarCaminho("Faro", "Lisboa", 278);  // A2
        grafo.adicionarCaminho("Porto", "Braga", 53);  // A3
        grafo.adicionarCaminho("Braga", "Porto", 53);  // A3

        // Autoestrada A2
        grafo.adicionarCaminho("Lisboa", "Albufeira", 278);
        grafo.adicionarCaminho("Albufeira", "Lisboa", 278);

        // Autoestrada A3
        grafo.adicionarCaminho("Porto", "Braga", 53);
        grafo.adicionarCaminho("Braga", "Porto", 53);

        // Autoestrada A4
        grafo.adicionarCaminho("Braganca", "Porto", 222);
        grafo.adicionarCaminho("Porto", "Braganca", 222);

        // Autoestrada A6
        grafo.adicionarCaminho("Lisboa", "Evora", 134);
        grafo.adicionarCaminho("Evora", "Lisboa", 134);
        grafo.adicionarCaminho("Evora", "Beja", 99);
        grafo.adicionarCaminho("Beja", "Evora", 99);

        // Autoestrada A7
        grafo.adicionarCaminho("Braga", "Guimaraes", 49);
        grafo.adicionarCaminho("Guimaraes", "Braga", 49);

        // Autoestrada A23
        grafo.adicionarCaminho("Guarda", "Castelo Branco", 139);
        grafo.adicionarCaminho("Castelo Branco", "Guarda", 139);

        // Autoestrada A25
        grafo.adicionarCaminho("Braganca", "Guarda", 262);
        grafo.adicionarCaminho("Guarda", "Braganca", 262);

        // Autoestrada A28
        grafo.adicionarCaminho("Porto", "Viana do Castelo", 94);
        grafo.adicionarCaminho("Viana do Castelo", "Porto", 94);
        grafo.adicionarCaminho("Braga", "Viana do Castelo", 36);
        grafo.adicionarCaminho("Viana do Castelo", "Braga", 36);

        // Autoestrada A8
        grafo.adicionarCaminho("Lisboa", "Leiria", 133);
        grafo.adicionarCaminho("Leiria", "Lisboa", 133);

        // Autoestrada A10
        grafo.adicionarCaminho("Lisboa", "Alverca", 34);
        grafo.adicionarCaminho("Alverca", "Lisboa", 34);

        // Autoestrada A12
        grafo.adicionarCaminho("Alverca", "Vila Franca de Xira", 40);
        grafo.adicionarCaminho("Vila Franca de Xira", "Alverca", 40);

        // Autoestrada A13
        grafo.adicionarCaminho("Coimbra", "Evora", 162);
        grafo.adicionarCaminho("Evora", "Coimbra", 162);

        // Autoestrada A15
        grafo.adicionarCaminho("Santarem", "Leiria", 41);
        grafo.adicionarCaminho("Leiria", "Santarem", 41);

        // Autoestrada A16
        grafo.adicionarCaminho("Cascais", "Sintra", 23);
        grafo.adicionarCaminho("Sintra", "Cascais", 23);

        // Autoestrada A17
        grafo.adicionarCaminho("Leiria", "Aveiro", 118);
        grafo.adicionarCaminho("Aveiro", "Leiria", 118);

        // Autoestrada A22
        grafo.adicionarCaminho("Lagos", "Vila Real de Santo António", 132);
        grafo.adicionarCaminho("Vila Real de Santo António", "Lagos", 132);

        // Autoestrada A23
        grafo.adicionarCaminho("Leiria", "Guarda", 260);
        grafo.adicionarCaminho("Guarda", "Leiria", 260);

        // Autoestrada A24
        grafo.adicionarCaminho("Viseu", "Chaves", 161);
        grafo.adicionarCaminho("Chaves", "Viseu", 161);

        // Autoestrada A25
        grafo.adicionarCaminho("Aveiro", "Vilar Formoso", 196);
        grafo.adicionarCaminho("Vilar Formoso", "Aveiro", 196);

        // Autoestrada A27
        grafo.adicionarCaminho("Viana do Castelo", "Ponte de Lima", 25);
        grafo.adicionarCaminho("Ponte de Lima", "Viana do Castelo", 25);

        // Autoestrada A28
        grafo.adicionarCaminho("Porto", "Caminha", 95);
        grafo.adicionarCaminho("Caminha", "Porto", 95);

        // Autoestrada A29
        grafo.adicionarCaminho("Aveiro", "Vila Nova de Gaia", 54);
        grafo.adicionarCaminho("Vila Nova de Gaia", "Aveiro", 54);

        // Autoestrada A32
        grafo.adicionarCaminho("Oliveira de Azemeis", "Vila Nova de Gaia", 33);
        grafo.adicionarCaminho("Vila Nova de Gaia", "Oliveira de Azemeis", 33);

        // Autoestrada A33
        grafo.adicionarCaminho("Lisboa", "Setubal", 37);
        grafo.adicionarCaminho("Setubal", "Lisboa", 37);

        // Autoestrada A41
        grafo.adicionarCaminho("Porto", "Aveiro", 62);
        grafo.adicionarCaminho("Aveiro", "Porto", 62);

        // Autoestrada A42
        grafo.adicionarCaminho("Pacos de Ferreira", "Porto", 24);
        grafo.adicionarCaminho("Porto", "Pacos de Ferreira", 24);

        // Autoestrada A43
        grafo.adicionarCaminho("Porto", "Gondomar", 16);
        grafo.adicionarCaminho("Gondomar", "Porto", 16);

        // Autoestrada A44
        grafo.adicionarCaminho("Vila Nova de Gaia", "Porto", 9);
        grafo.adicionarCaminho("Porto", "Vila Nova de Gaia", 9);

        // Via Regional Interior
        grafo.adicionarCaminho("Porto", "Maia", 3);
        grafo.adicionarCaminho("Maia", "Porto", 3);

        
        System.out.print("""
                         ALGORITMO DE DIJKSTRA PARA DISTANCIAS MINIMAS.
                         
                         Verificacao de distancias minimas entre duas cidades nacionais usando apenas Auto-Estradas (AE).
                         Comtempla as seguintes cidades e/ou localidades:
                         Albufeira, Alverca, Aveiro, Beja, Braga, Braganca, Caminha, Cascais, Castelo Branco, Chaves, Coimbra, Evora, 
                         Guarda, Guimaraes, Gondomar, Lagos, Leiria, Lisboa, Maia, Oliveira de Azemeis, 
                         Pacos de Ferreira, Ponte de Lima, Porto, Santarem, Setubal,  Sintra, Torres Novas, Viana do Castelo, 
                         Vila Nova de Gaia, Vila Franca de Xira, Vila Nova de Santo Antonio, Vilar Formoso e Viseu.
                         """);
        

        System.out.print("\nDigite o local de origem: ");
        String cidadeOrigem = scanner.nextLine();

        System.out.print("Digite o local de destino: ");
        String cidadeDestino = scanner.nextLine();

        dijkstra(grafo, cidadeOrigem, cidadeDestino);


    }

    public static void dijkstra(Grafo grafo, String origem, String destino) {
        Map<String, Integer> distancia = new HashMap<>();
        Map<String, String> anterior = new HashMap<>();
        PriorityQueue<String> filaPrioridade = new PriorityQueue<>(Comparator.comparingInt(distancia::get));

        distancia.put(origem, 0);
        filaPrioridade.add(origem);

        while (!filaPrioridade.isEmpty()) {
            String cidadeAtual = filaPrioridade.poll();

            for (Map.Entry<String, Integer> vizinho : grafo.obterCidadesAdjacentes(cidadeAtual).entrySet()) {
                String cidadeVizinha = vizinho.getKey();
                int pesoCaminho = vizinho.getValue();
                int novaDistancia = distancia.get(cidadeAtual) + pesoCaminho;

                if (novaDistancia < distancia.getOrDefault(cidadeVizinha, Integer.MAX_VALUE)) {
                    distancia.put(cidadeVizinha, novaDistancia);
                    anterior.put(cidadeVizinha, cidadeAtual);
                    filaPrioridade.add(cidadeVizinha);
                }
            }
        }

        List<String> caminho = new ArrayList<>();
        String cidade = destino;

        while (cidade != null) {
            caminho.add(cidade);
            cidade = anterior.get(cidade);
        }

        Collections.reverse(caminho);
        
        if (distancia.get(destino)==null)
            System.out.println("""
                               
                               NAO FOI POSSIVEL ESTIMAR A DISTANCIA.
                               - Ou a origem/destino nao se encontra comteplada pela nossa base de dados,
                               - Ou nao existe um caminho direto apenas por Auto Estradas para a rota definida.
                               - POR FAVOR: Verifique se digitou corretamente ambos os locais.
                               """);
        else{
            System.out.println("Caminho mais curto apenas por AE de " + origem + " para " + destino + ": " + caminho);
            System.out.println("Distancia total: " + distancia.get(destino) + "km");}
    }
}