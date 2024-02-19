/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestaoequipamentos;

import java.util.Scanner;

/**
 *
 * @author andresousa
 */
public class GestaoEquipamentos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        // criação de um objeto na classe Equipamento usando contrutor sem paramentros e atribuindo estes parametros pelos seus metodos de acesso
        
        Equipamento equip1 = new Equipamento();
        equip1.setNumeroSerie(123456789);
        equip1.setAnoFabrico(2021);
        equip1.setPreco(425.00);
        
        // criação de um objeto na classe Equipamento usando construtor com parametros.
        
        Equipamento equip2 = new Equipamento(987654321, 2022, 759.99);
        
        // criação de um objeto na classe Computador usando contrutor sem paramentros e atribuindo estes paramentros pelos seus metodo de acesso
        
        Computador comp1 = new Computador();
        comp1.setNumeroSerie(555555555);
        comp1.setAnoFabrico(2023);
        comp1.setPreco(500.00);
        comp1.setRam(16);
        comp1.setDisco(512);
        comp1.setProcessador("Ryzen");
        
        // criação de um objeto na classe Computador usando construtor com parametros.
        
        Computador comp2 = new Computador(777777777, 2023, 999.99, 32, 1064, "AMD");
        
        // impressao do objeto equip1 pelo metodo definido para o efeito (imprimeEquipamento)
        
        equip1.imprimirEquipamento();
        System.out.println("");
        
        // impressao do objeto equi2 pelo metodo System.out.println()
        
        System.out.println(equip2.toString()); 
        System.out.println("");
        
        // impressao do objeto comp1 pelo metodo definido para o efeito (imprimeComputador).
        
        comp1.imprimirComputador(); 
        System.out.println("");
        
        // impressao do objeto comp2 pelo metodo System.out.println()
        
        System.out.println(comp2.toString()); 
        System.out.println("");
        
        // verificar se dois computadores tem o mesmo processador
        
        if (comp1.comparaProcessador(comp2))
            System.out.println("Tem o mesmo processador");
        else
            System.out.println("Não tem o mesmo processador");
        
        // aumentar a memoria de um computador
        
        System.out.println("Qual a capacidade que pretende aumentar do Computador 1: ");
        int opcao = leia.nextInt();
        
        comp1.aumentaRam(16);
        
        System.out.println("O computador um tem agora " + comp1.getRam() + "GigaBytes de Ram.");

        
        
        
        
        
        
   
        
        
        
        
        
        
        
        
    }
    
}
