
package exemplotp2;

/**
 *
 * @author andresousa
 */
public class Banco {
    
    public static void main(String[] args) {
        
        /* Foram criados dois objetos, um de cada classe (ContaPrazo e ContaOrdem) 
           respetivamente e sem parametros, de seguida foram alterados os atributos 
           do mesmos usando os seus metodos de acesso (set).
        */
        
        // Criaçao do Objeto cp1 (correspondente a uma Conta a Prazo)
        
        ContaPrazo cp1 = new ContaPrazo();
        cp1.setNumeroConta(12345);
        cp1.setNomeTitular("Jorge Simões");
        cp1.setSaldo(5000.49);
        cp1.setPrazo(365);
        cp1.setTaxa(10);
        
        // Criaçao do Objeto co1 (correspondente a uma Conta a Ordem)
        
        ContaOrdem co1 = new ContaOrdem();
        co1.setNumeroConta(54321);
        co1.setNomeTitular("Carlos Sousa");
        co1.setSaldo(1000.65);
        co1.setSaldoMinimo(100);
        co1.setContaOrdenado(true);
        
        // Foram criadas duas novas contas respetivamente, a 
        // a Prazo e á Ordem mas com parametros inseridos.
        
        ContaPrazo cp2 = new ContaPrazo(99999,"Pinto da Costa",10000, 90,5);
        ContaOrdem co2 = new ContaOrdem(11111, "Rui Costa",50000, 5, false);
        
        // Nas linhas seguintes é realizada a impressao dos dados 
        // de cada uma das contas (1 e 2 de cada tipo Ordem e Prazo) 
        // chamando o metodo criado para o efeito.
        
        System.out.println("(impressao dos objetos chamando o metodo criado)");
            System.out.println(""); // Apenas espaçamento estetico
        cp1.imprimirContaPrazo();
            System.out.println(""); // Apenas espaçamento estetico
        cp2.imprimirContaPrazo();
            System.out.println(""); // Apenas espaçamento estetico
        co1.imprimirContaOrdem();
            System.out.println(""); // Apenas espaçamento estetico
        co2.imprimirContaOrdem();
            System.out.println(""); // Apenas espaçamento estetico

        // Nas linhas seguintes foi usado o metodo System.out.println() 
        // para impressao dos dados das contas chamando o metodo toString.
        
        System.out.println("(impressao dos objetos chamando o metodo System.out.println())");
            System.out.println(""); // Apenas espaçamento estetico
        System.out.println(cp1.toString());
            System.out.println(""); // Apenas espaçamento estetico
        System.out.println(cp2.toString());
            System.out.println(""); // Apenas espaçamento estetico
        System.out.println(co1.toString());
            System.out.println(""); // Apenas espaçamento estetico
        System.out.println(co2.toString());
            System.out.println(""); // Apenas espaçamento estetico
        
        // teste logico para impressao da comparaçao das taxas entre as duas Contas a Prazo
        
        System.out.println("(verificaçao se duas contas a prazo sao iguais)");
            System.out.println(""); // Apenas espaçamento estetico
        
        if (cp1.mesmaTaxa(cp2))
            System.out.println("A Conta a prazo " + cp1.getNumeroConta() + " tem a Taxa de Juro IGUAL a da conta " + cp2.getNumeroConta() + ".");
        else
            System.out.println("A Conta a prazo " + cp1.getNumeroConta() + " tem a Taxa de Juro DIFERENTE a da conta " + cp2.getNumeroConta() + ".");

        System.out.println(""); // Apenas espaçamento estetico
        
        // Chamada do metodo "comparaSaldoMinimo" por meio de impressao da comparaçao entre
        // o saldo da Conta a Ordem 1 com a Conta a Ordem 2 relativamente a ser 
        // maior, menor ou igual entre si.
        
        System.out.println("(comparando o saldo minimo entre a conta a ordem 1 e a conta a ordem 2)");
            System.out.println(""); // Apenas espaçamento estetico
        System.out.println(co1.comparaSaldoMinimo(co2));
            System.out.println(""); // Apenas espaçamento estetico
    }
    
}
