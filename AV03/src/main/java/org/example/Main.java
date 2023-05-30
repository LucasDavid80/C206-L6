package org.example;

import org.example.exceptions.InfoInvalidaException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Arquivo arq = new Arquivo();
        Produto p1 = new Produto();
        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        while (flag) {
            System.out.println("Bem-vindo ao menu!");
            System.out.println("1 - Salvar as informações do jogo no arquivo txt");
            System.out.println("2 - Mostrar as informações dos jogos salvos no arquivo");
            System.out.println("3 - Ordenar os jogos em ordem decrescente em relação ao preço");
            System.out.println("4 - Mostrar a quantidade de produtos existentes na loja de cada tipo");
            System.out.println("5 - Sair");
            int op = sc.nextInt();

            switch (op) {
                case 1:
                    sc.nextLine();
                    System.out.println("Cadastrar Produtos");
                    System.out.print("Digite o nome do produto: ");
                    p1.setNome(sc.nextLine());

                    System.out.print("Digite o preço do produto: R$");
                    double quantia = sc.nextDouble();

                    sc.nextLine(); // Consumir o caractere de nova linha

                    try {
                        p1.setPreco(quantia);
                    } catch (InfoInvalidaException e) {
                        System.out.println(e.getMessage());
                        break;
                    }

                    System.out.print("Digite o tipo do produto: ");
                    String tipo = sc.nextLine();
                    try {
                        p1.setTipo(tipo);
                    } catch (InfoInvalidaException e) {
                        System.out.println(e.getMessage());
                        break;
                    }

                    arq.escrever(p1);

                    System.out.println("Produto cadastrado com sucesso!!");
                    break;
                case 2:
                    ArrayList<Produto> prods = arq.ler();
                    for (int i = 0; i < prods.size(); i++) {
                        System.out.println(prods.get(i).getNome());
                        System.out.println(prods.get(i).getPreco());
                        System.out.println(prods.get(i).getTipo());
                    }
                    break;
                case 3:
                    ArrayList<Produto> prodsDecre = arq.ler();
                    Collections.sort(prodsDecre);
                    Collections.reverse(prodsDecre);
                    for (Produto produto : prodsDecre) {
                        System.out.println(produto.getNome());
                        System.out.println(produto.getPreco());
                        System.out.println(produto.getTipo());
                    }
                    break;
                case 4:
                    ArrayList<Produto> prodsTipos = arq.ler();
                    int comida = 0, higiene = 0, decoracao = 0;
                    for (int i = 0; i < prodsTipos.size();i++){
                        if (prodsTipos.get(i).getTipo().equals("Comida")){
                            comida++;
                        }
                        if (prodsTipos.get(i).getTipo().equals("Higiene")){
                            higiene++;
                        }
                        if (prodsTipos.get(i).getTipo().equals("Decoração")){
                            decoracao++;
                        }
                    }

                    System.out.println("Quantidade de produtos existentes: ");
                    System.out.println("Comida: " + comida);
                    System.out.println("Higiene: " + higiene);
                    System.out.println("Decoração: " + decoracao);

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
