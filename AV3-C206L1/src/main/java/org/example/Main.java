package org.example;

import org.example.exceptions.PrecoNegativoException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws PrecoNegativoException {
        Arquivo arq = new Arquivo();
        Jogo j1 = new Jogo();
        Scanner in = new Scanner(System.in);
        boolean flag = true;

        while (flag){
            System.out.println("Bem-vindo ao menu!");
            System.out.println("1 - Salvar as informações do jogo no arquivo txt");
            System.out.println("2 - Mostrar as informações dos jogos salvos no arquivo");
            System.out.println("3 - Ordenar os jogos em ordem crescente de preço");
            System.out.println("4 - Ordenar os jogos em ordem decrescente de preço");
            System.out.println("5 - Sair");
            int op = in.nextInt();

            switch (op){
                case 1:
                    in.nextLine();
                    System.out.println("Cadastrar Jogos");
                    System.out.print("Digite o nome do jogo: ");
                    j1.setNome(in.nextLine());

                    System.out.print("Digite o preço do jogo: R$");
                    double quantia = in.nextDouble();

                    in.nextLine(); // Consumir o caractere de nova linha

                    try {
                        j1.setPreco(quantia);
                    } catch (PrecoNegativoException e) {
                        System.out.println(e.getMessage());
                        break;
                    }

                    System.out.print("Digite o genero do jogo: ");
                    j1.setGenero(in.nextLine());

                    arq.escrever(j1);

                    break;

                case 2:
                    ArrayList<Jogo> jogos = arq.ler();
                    for(int i = 0; i < jogos.size();i++){
                        System.out.println(jogos.get(i).getNome());
                        System.out.println(jogos.get(i).getPreco());
                        System.out.println(jogos.get(i).getGenero());
                    }
                    break;
                case 3:
                    ArrayList<Jogo> jogosCre = arq.ler();
                    Collections.sort(jogosCre);
                    for(int i = 0; i < jogosCre.size();i++){
                        System.out.println(jogosCre.get(i).getNome());
                        System.out.println(jogosCre.get(i).getPreco());
                        System.out.println(jogosCre.get(i).getGenero());
                    }
                    break;
                case 4:
                    ArrayList<Jogo> jogosDe = arq.ler();
                    Collections.sort(jogosDe);
                    Collections.reverse(jogosDe);
                    for(int i = 0; i < jogosDe.size();i++){
                        System.out.println(jogosDe.get(i).getNome());
                        System.out.println(jogosDe.get(i).getPreco());
                        System.out.println(jogosDe.get(i).getGenero());
                    }
                    break;

                case 5:
                    System.out.println("Fim do Sistema!");
                    flag = false;
                    break;
                default:
                    System.out.println("Opção incorreta!");

            }
        }
    }
}