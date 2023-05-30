package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Aldeia aldeia = new Aldeia();
        System.out.println("Qual é o nome da aldeia: ");
        aldeia.nome = entrada.nextLine();

        System.out.println("Qual é a quantidade de civis: ");
        aldeia.qtdMoradores = entrada.nextInt();

        entrada.nextLine();
        System.out.println("Qual é a região da aldeia: ");
        aldeia.regiao = entrada.nextLine();


        boolean flag = true;
        while (flag){
//            System.out.println("BEM VINDO ");
            System.out.println("1 - Adicionar um ninja na aldeia");
            System.out.println("2 - Mostrar informações da aldeia e de seus ninjas");
            System.out.println("3 - Mostrar nomes dos ninjas classificados no ranking S");
            System.out.println("4 - Mostrar a quantidade de ninjas Gennin, Chunnin e ANBU");
            System.out.println("5 - Sair");

            int op;
            op = entrada.nextInt();

            switch (op){
                case 1:
//                    System.out.println("Qual é o nome??");
                    entrada.nextLine();

                    System.out.print("Qual é o nome do ninja: ");
                    String nomeNinja = entrada.nextLine();

                    System.out.print("Qual é a idade: ");
                    int idadeNinja = entrada.nextInt();

                    entrada.nextLine();
                    System.out.print("Qual é o seu título(Chunnin, Gennin ou ANBU): ");
                    String tituloNinja = entrada.nextLine();

                    System.out.print("Qual é o seu ranking(S, A, B, C OU D): ");
                    String rankingNinja = entrada.nextLine();

                    Ninja ninja  = new Ninja(nomeNinja, idadeNinja, tituloNinja, rankingNinja);

                    aldeia.adicionarNinja(ninja);
                    System.out.println("Ninja adicionado!!");
                    System.out.println("-------------------------------------");
                    break;
                case 2:
                    aldeia.mostraInfo();
                    break;
                case 3:
                    aldeia.rankingS();
                    break;
                case 4:
                    aldeia.qtdTitulos();
                    break;
                case 5:
                    System.out.println("Sistema finalizado!!");
                    flag = false;
                    break;
                default:
                    System.out.println("Digite uma das opções possiveis!!");
                    break;
            }
        }
    }
}

