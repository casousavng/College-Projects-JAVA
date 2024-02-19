/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maqvenda;

import java.util.Scanner;

/**
 *
 * @author andresousa
 */
public class TestaMaqVenda {
    
 public static void main(String[] args) {
     
    Scanner leia = new Scanner(System.in);
     
    int opcao = 0, opcao1 = 0, opcao2 = 0, opcao5 = 0;
     
     // gerar uma maquina de venda (para  poder testar)
     
    MaquinaVenda maq1 = new MaquinaVenda("TABACO","OK",0.00,0,0);
     
     // adicionar produtos (para poder testar)
            
    maq1.adicionarProduto("Camel", 4.50, 2);
    maq1.adicionarProduto("Marlboro", 5.50, 3);
    maq1.adicionarProduto("JPS", 5.25, 4);

    do{
        System.out.println("MAQUINA DE VENDA AUTOMATICA");
        System.out.println("- Escolha o seu Menu -");
        System.out.println("(1) - Utilizador");
        System.out.println("(2) - Administrador");
        System.out.println("(3) - Sair");
        System.out.print("Opcao: ");
        opcao = leia.nextInt();
        
        switch(opcao){

            case 1: 
                do{
                    System.out.println("");
                    System.out.println("MENU UTILIZADOR");
                    System.out.println("(1) - Lista de Produtos (Simples)");
                    System.out.println("(2) - Lista de Produtos (Detalhada)");
                    System.out.println("(3) - Verificar Preço Produto");
                    System.out.println("(4) - Comprar Produtos");
                    System.out.println("(5) - SAIR");
                    System.out.print("Opcao: ");
                    opcao2 = leia.nextInt();
                        switch (opcao2){
                            case 1: 
                                // imprime lista de produtos apenas com o nome dos mesmos
                                System.out.println("");
                                System.out.println("_Lista Produtos por Nome_");
                                maq1.listaProdutos();
                                break;
                            case 2:
                                // imprime lista produtos detalhada com nome, preco e quantidade
                                System.out.println("");
                                System.out.println("_Lista Produtos Detalhada_");
                                maq1.listaProdutosDetalhada();
                                break;
                            case 3:
                                // verificar preco de produto pedindo ao cliente o nome do produto
                                System.out.println("");
                                System.out.print("Qual o nome do produto que pretende verificar (Case Sensitive)? ");
                                String opcao3 = leia.next();
                                if (maq1.precoProduto(opcao3) == 0)
                                    System.out.println("O Produto digitado nao existe.");
                                else
                                    System.out.println("Preço de "+opcao3+": " + maq1.precoProduto(opcao3)+"€");
                                break;
                            case 4:
                                // comprar produtos (por nome)
                                switch (maq1.getEstado()) {
                                    case "OFF":
                                        System.out.println("");
                                        System.out.println("Maquina Desligada.");
                                        break;
                                    case "AV":
                                        System.out.println("");
                                        System.out.println("Maquina Avariada.");
                                        break;
                                    default:
                                        System.out.println("");
                                        System.out.print("Qual o nome do produto que pretende comprar (Case Sensitive)? ");
                                        String opcao4 = leia.next();
                                        if (maq1.vendaProduto(opcao4) == true)
                                            System.out.println("Comprou uma unidade de " + opcao4 + " por " + maq1.precoProduto(opcao4)+"€");
                                        else
                                            System.out.println("Sem stock para venda ou nao existe. Escolha outro produto.");
                                        break;
                                }
                                break;
                        }
                } while (opcao2 != 5);
                System.out.println("");
                break;

            case 2:
                do{
                    System.out.println("");
                    System.out.println("MENU ADMINISTRADOR");
                    System.out.println("(1) - Adicionar Novo Produto");
                    System.out.println("(2) - Adicionar Stock a Produto existente");
                    System.out.println("(3) - Adicionar Dinheiro em caixa");
                    System.out.println("(4) - Informaçoes GERAIS");
                    System.out.println("(5) - SAIR");
                    System.out.print("Opcao: ");
                    opcao5 = leia.nextInt();
                        switch (opcao5){
                        case 1: 
                            // adicionar novo produto
                            System.out.println("");
                            System.out.print("Qual o nome do Produto: ");
                            String nomeProduto = leia.next();
                            System.out.print("Qaul o preço do Produto: ");
                            double precoProduto = leia.nextDouble();
                            System.out.print("Qual a quantidade que vai adicionar: ");
                            int qtdProduto = leia.nextInt();
                            maq1.adicionarProduto(nomeProduto, precoProduto, qtdProduto);
                            System.out.println("Produto Adicionado com Sucesso.");
                            break;
                        case 2:
                            System.out.println("");
                            System.out.print("Qual é o produto que pretende adicionar stock: ");
                            String escolhaProduto = leia.next();
                            System.out.print("Qual o stock que pretende adicionar: ");
                            int stock = leia.nextInt();
                            maq1.adicionarStock(escolhaProduto, stock);
                            System.out.println("Stock adicionado com sucesso, o produto " + escolhaProduto + " tem agora mais " + stock + " un. para venda.");
                            break;
                        case 3:
                            // adicionar dinheiro a maquina para fundo de caixa
                            System.out.println("");
                            System.out.print("Qual o montante que pretende inserir: ");
                            double montante = leia.nextDouble();
                            maq1.inserirDinheiro(montante);
                            System.out.println("Dinheiro Adicionado com Sucesso, tem um total de " + maq1.getDinheiro() + "€ na maquina.");
                            break;
                        case 4:
                            // informaçoes gerais da maquina
                            System.out.println("");
                            System.out.println(maq1.toString());
                            break;

                        case 5:
                            break;      
                    }

                }while (opcao5 != 4);
                System.out.println("");
            case 3:
                break;
        }
    }while (opcao != 3);
    System.out.println("");
         
 }
}