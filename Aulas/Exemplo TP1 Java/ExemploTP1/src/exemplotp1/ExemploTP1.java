/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemplotp1;

import java.util.Scanner; 

public class ExemploTP1 {
    
    public static void idade(int anoAtleta, int anoCorrente){
        
        // sub programa que escreve o idade (em anos) do Atleta.
        
        System.out.println("O Atleta tem " + (anoCorrente-anoAtleta) + " anos.");
        System.out.println("");
    }

    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        int opcao, anoCorrente = 0, anoAtleta = 0, continuar = 0;
                
        System.out.println("# Associação de Atletismo #");
        System.out.println(" --- Escolha uma opção --- ");
        
        // menu inicial para inserçao de dados na opçao 1, escolha da categoria do atleta entre as opçoes 2 e 7 e opcao 8 para sair
        
        do{
            
            System.out.println("(1) - Inserir dados");
            System.out.println("(2) - Benjamins");      // 7, 8, 9, 10 e 11 anos
            System.out.println("(3) - Infantis");       // 12 e 13 anos
            System.out.println("(4) - Iniciados");      // 14 e 15 anos
            System.out.println("(5) - Juvenis");        // 16 e 17 anos
            System.out.println("(6) - Juniores");       // 18 e 19 anos
            System.out.println("(7) - Seniores");       // 20 anos em diante
            System.out.println("(8) - Sair");
            System.out.print("OPÇÃO # ");
            opcao = leia.nextInt();
            System.out.println("");
        
       switch(opcao){
           
           case 1:
               
               // adicionei a seguinte condição para que teste se o utilizador ja tinha inserido os valores do atleta e ano corrente para apos
               // a inserçao dos mesmos uma vez, este apenas possa escolher a categoria do atleta e nao voltar a inserir valores novamente
               
               if (anoAtleta!=0 && anoCorrente!=0){
                   System.out.println("Já tem os dados inseridos, escolha agora um Escalão entre a opçao 2 e a opção 7.");
                   break;
               }
               else
                   do{
                        // inserçao do ano de nascimento do atleta com a condiçao de ser igual ou superior a 1956 
                        // e igual ou inferior a 2014 se nao for, aguarda a inserçao correta
                        
                        System.out.print("Qual o ano de nascimento do Atleta (escolha entre 1956 e 2014 inclusive)? ");
                        anoAtleta = leia.nextInt();
                        if (anoAtleta < 1956){
                            System.out.println("Atenção! Insira um valor igual ou superior a 1956.");
                        }
                        if (anoAtleta > 2014){
                            System.out.println("Atenção! Insira um valor igual ou inferior a 2014.");
                        }
                        if ((anoAtleta >= 1956) || (anoAtleta <= 2014)){
                            System.out.println("");
                         // adicionei esta condiçao apenas para espaçamento estetico e de mais facil leitura no interface
                        }
                   }while ((anoAtleta < 1956) || (anoAtleta > 2014));

                  do{
                        // inserçao do ano corrente para poder ser usado no calculo do escalao do atleta e na idade
                        // tendo tambem a condição de so aceitar anos iguais ou superiores a 2021
                        
                        System.out.print("Qual o ano corrente (superior ou igual a 2021)? ");
                        anoCorrente = leia.nextInt();
                        if (anoCorrente < 2021){
                            System.out.println("Atenção! Insira um ano corrente igual ou superior a 2021.");
                            System.out.println("");
                        }
                        if (anoCorrente >= 2021){
                             // texto a aparecer depois de concluir com sucesso a inserçao do ano do atleta e do ano corrente
                            System.out.println("");
                            System.out.println("Escolha agora o Escalão do Atleta (entre a opçao 2 e a opçao 7).");

                        }
                   }while (anoCorrente < 2021);
                   
                   break;
           case 2:
               // primeiro verifica se os dados (ano do atleta e ano corrente) foram inseridos
               if ((anoAtleta == 0) || (anoCorrente == 0)){
                   System.out.println("ATENÇÃO!! Insira os dados primeiro para poder escalonar o atleta.");
                   System.out.println("Primeiro escolha a opção 1.");
                   break;
               }
               else
                   // verifica se o atleta esta dentro deste escalão entre as idades de 7 e 11 anos inclusive
                   if (anoCorrente - anoAtleta >= 7 && anoCorrente - anoAtleta <= 11 ) {
                       System.out.print("Escalão Correto! ");
                       // sendo o escalão correto, imprime o texto acima e de seguida chama o subprograma que escreve a idade do atleta em anos
                       idade(anoAtleta,anoCorrente);
                     
                       System.out.println("Escalonar novo atleta???");
                       do{
                            System.out.print( "Escolha (1) para Sim e (2) para Não: ");
                            continuar = leia.nextInt();
                            System.out.println("");
                       }while((continuar < 1) || (continuar > 2));
                       
                       if (continuar == 1){
                           System.out.println("Insira os dados do novo Atleta.");
                           anoCorrente = 0; 
                           anoAtleta = 0;
                       }
                       if (continuar == 2)  { 
                           System.out.println("OBRIGADO por usar este programa!");
                           opcao = 8; // alterando o valor da variavel "opcao" para 8, este finaliza o programa pois o ciclo corre ate a opcao ser diferente de 8
                       break;
                    } 
                       break;
                    } else {
                       System.out.println("Escalão Incorreto! Escolha o escalão correto.");
                       // no caso do escalao escolhido ser incorreto, pára o ciclo e aguarda a escolha do escalão correto
                       break;
            }
           case 3:
               // primeiro verifica se os dados (ano do atleta e ano corrente) foram inseridos
               if ((anoAtleta == 0) || (anoCorrente == 0)){
                   System.out.println("ATENÇÃO!! Insira os dados primeiro para poder escalonar o atleta.");
                   System.out.println("Primeiro escolha a opção 1.");
                   break;
               }
               else
                   // verifica se o atleta esta dentro deste escalão entre as idades de 12 e 13 anos inclusive
                   if (anoCorrente - anoAtleta >= 12 && anoCorrente - anoAtleta <= 13 ) {
                        System.out.print("Escalão Correto! ");
                       // sendo o escalão correto, imprime o texto acima e de seguida chama o subprograma que escreve a idade do atleta em anos
                       idade(anoAtleta,anoCorrente);
                     
                       System.out.println("Escalonar novo atleta???");
                       do{
                            System.out.print( "Escolha (1) para Sim e (2) para Não: ");
                            continuar = leia.nextInt();
                            System.out.println("");
                       }while((continuar < 1) || (continuar > 2));
                       
                       if (continuar == 1){
                           System.out.println("Insira os dados do novo Atleta.");
                           anoCorrente = 0; 
                           anoAtleta = 0;
                       }
                       if (continuar == 2)  { 
                           System.out.println("OBRIGADO por usar este programa!");
                           opcao = 8; // alterando o valor da variavel "opcao" para 8, este finaliza o programa pois o ciclo corre ate a opcao ser diferente de 8
                       break;
                    } 
                       break;
                    } else {
                       System.out.println("Escalão Incorreto! Escolha o escalão correto.");
                       // no caso do escalao escolhido ser incorreto, pára o ciclo e aguarda a escolha do escalão correto
                       break;
            }
           case 4:
                                // primeiro verifica se os dados (ano do atleta e ano corrente) foram inseridos
                 if ((anoAtleta == 0) || (anoCorrente == 0)){
                     System.out.println("ATENÇÃO!! Insira os dados primeiro para poder escalonar o atleta.");
                     System.out.println("Primeiro escolha a opção 1.");
                     break;
                 }
                 else
                     // verifica se o atleta esta dentro deste escalão entre as idades de 14 e 15 anos inclusive
                     if (anoCorrente - anoAtleta >= 14 && anoCorrente - anoAtleta <= 15 ) {
                         System.out.print("Escalão Correto! ");
                         // sendo o escalão correto, imprime o texto acima e de seguida chama o subprograma que escreve a idade do atleta em anos
                         idade(anoAtleta,anoCorrente);

                         System.out.println("Escalonar novo atleta???");
                         do{
                              System.out.print( "Escolha (1) para Sim e (2) para Não: ");
                              continuar = leia.nextInt();
                              System.out.println("");
                         }while((continuar < 1) || (continuar > 2));

                         if (continuar == 1){
                             System.out.println("Insira os dados do novo Atleta.");
                             anoCorrente = 0; 
                             anoAtleta = 0;
                         }
                         if (continuar == 2)  { 
                             System.out.println("OBRIGADO por usar este programa!");
                             opcao = 8; // alterando o valor da variavel "opcao" para 8, este finaliza o programa pois o ciclo corre ate a opcao ser diferente de 8
                         break;
                      } 
                         break;
                      } else {
                         System.out.println("Escalão Incorreto! Escolha o escalão correto.");
                         // no caso do escalao escolhido ser incorreto, pára o ciclo e aguarda a escolha do escalão correto
                         break;
              }
           case 5:
               // primeiro verifica se os dados (ano do atleta e ano corrente) foram inseridos
               if ((anoAtleta == 0) || (anoCorrente == 0)){
                   System.out.println("ATENÇÃO!! Insira os dados primeiro para poder escalonar o atleta.");
                   System.out.println("Primeiro escolha a opção 1.");
                   break;
               }
               else
                   // verifica se o atleta esta dentro deste escalão entre as idades de 16 e 17 anos inclusive
                   if (anoCorrente - anoAtleta >= 16 && anoCorrente - anoAtleta <= 17 ) {
                       System.out.print("Escalão Correto! ");
                       // sendo o escalão correto, imprime o texto acima e de seguida chama o subprograma que escreve a idade do atleta em anos
                       idade(anoAtleta,anoCorrente);
                     
                       System.out.println("Escalonar novo atleta???");
                       do{
                            System.out.print( "Escolha (1) para Sim e (2) para Não: ");
                            continuar = leia.nextInt();
                            System.out.println("");
                       }while((continuar < 1) || (continuar > 2));
                       
                       if (continuar == 1){
                           System.out.println("Insira os dados do novo Atleta.");
                           anoCorrente = 0; 
                           anoAtleta = 0;
                       }
                       if (continuar == 2)  { 
                           System.out.println("OBRIGADO por usar este programa!");
                           opcao = 8; // alterando o valor da variavel "opcao" para 8, este finaliza o programa pois o ciclo corre ate a opcao ser diferente de 8
                       break;
                    } 
                       break;
                    } else {
                       System.out.println("Escalão Incorreto! Escolha o escalão correto.");
                       // no caso do escalao escolhido ser incorreto, pára o ciclo e aguarda a escolha do escalão correto
                       break;
            }
           case 6:
               // primeiro verifica se os dados (ano do atleta e ano corrente) foram inseridos
               if ((anoAtleta == 0) || (anoCorrente == 0)){
                   System.out.println("ATENÇÃO!! Insira os dados primeiro para poder escalonar o atleta.");
                   System.out.println("Primeiro escolha a opção 1.");
                   break;
               }
               else
                   // verifica se o atleta esta dentro deste escalão entre as idades de 18 e 19 anos inclusive
                   if (anoCorrente - anoAtleta >= 18 && anoCorrente - anoAtleta <= 19 ) {
                        System.out.print("Escalão Correto! ");
                       // sendo o escalão correto, imprime o texto acima e de seguida chama o subprograma que escreve a idade do atleta em anos
                       idade(anoAtleta,anoCorrente);
                     
                       System.out.println("Escalonar novo atleta???");
                       do{
                            System.out.print( "Escolha (1) para Sim e (2) para Não: ");
                            continuar = leia.nextInt();
                            System.out.println("");
                       }while((continuar < 1) || (continuar > 2));
                       
                       if (continuar == 1){
                           System.out.println("Insira os dados do novo Atleta.");
                           anoCorrente = 0; 
                           anoAtleta = 0;
                       }
                       if (continuar == 2)  { 
                           System.out.println("OBRIGADO por usar este programa!");
                           opcao = 8; // alterando o valor da variavel "opcao" para 8, este finaliza o programa pois o ciclo corre ate a opcao ser diferente de 8
                       break;
                    } 
                       break;
                    } else {
                       System.out.println("Escalão Incorreto! Escolha o escalão correto.");
                       // no caso do escalao escolhido ser incorreto, pára o ciclo e aguarda a escolha do escalão correto
                       break;
            }
           case 7:
               // primeiro verifica se os dados (ano do atleta e ano corrente) foram inseridos
               if ((anoAtleta == 0) || (anoCorrente == 0)){
                   System.out.println("ATENÇÃO!! Insira os dados primeiro para poder escalonar o atleta.");
                   System.out.println("Primeiro escolha a opção 1.");
                   break;
               }
               else
                   // verifica se o atleta esta dentro deste escalão sendo a sua idade igual ou superior a 20 anos
                   if (anoCorrente - anoAtleta >= 20) {
                       System.out.print("Escalão Correto! ");
                       // sendo o escalão correto, imprime o texto acima e de seguida chama o subprograma que escreve a idade do atleta em anos
                       idade(anoAtleta,anoCorrente);
                     
                       System.out.println("Escalonar novo atleta???");
                       do{
                            System.out.print( "Escolha (1) para Sim e (2) para Não: ");
                            continuar = leia.nextInt();
                            System.out.println("");
                       }while((continuar < 1) || (continuar > 2));
                       
                       if (continuar == 1){
                           System.out.println("Insira os dados do novo Atleta.");
                           anoCorrente = 0; 
                           anoAtleta = 0;
                       }
                       if (continuar == 2)  { 
                           System.out.println("OBRIGADO por usar este programa!");
                           opcao = 8; // alterando o valor da variavel "opcao" para 8, este finaliza o programa pois o ciclo corre ate a opcao ser diferente de 8
                       break;
                    } 
                       break;
                    } else {
                       System.out.println("Escalão Incorreto! Escolha o escalão correto.");
                       // no caso do escalao escolhido ser incorreto, pára o ciclo e aguarda a escolha do escalão correto
                       break;
            }
           case 8:
               System.out.println("OBRIGADO por usar este programa!");
               break;
               
           default:
               System.out.println("Opção Inválida! Escolha entre as opções disponiveis.");
       }
       }while (opcao !=8);   
    }
}
