package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Array
//        int [] arrayInt = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
//        System.out.println(arrayInt[2]);

        Scanner entrada = new Scanner(System.in);
        Livro[] livros = new Livro[10];
//
//        //Maneiras de colocar um objeto em um Array
//        Livro l1 = new Livro("Diário de um banana", 300);
//        livros[0] = l1;
//
//        livros[1] = new Livro("Jogos Vorazes", 400);
        /*
        for (int i = 0; i < livros.length;i++) {
            if(livros[i] != null){
                System.out.println(livros[i].nome);
                System.out.println(livros[i].numPags);
            }
        }*/

//        for (int i = 0; i <livros.length;i++){
//            if (livros[i]!= null){
//                livros[i].mostraInfo();
//            }
//        }


        Biblioteca b1 = new Biblioteca();
        b1.nome = "Bilac Pinto";

        boolean flag = true;

        while (flag){
            System.out.println("BEM VINDO AO MENU DA BIBLIOTECA");
            System.out.println("1-Cadastrar novo livro");
            System.out.println("2-Mostrar todos os livros");
            System.out.println("3-Sair do menu");

            int op;
            op = entrada.nextInt();

            switch (op){
                case 1:
                    System.out.println("CADASTRE UM NOVO LIVRO!");
                    entrada.nextLine();

                    System.out.print("Entre com o nome do livro: ");
                    String nomeLivro = entrada.nextLine();

                    System.out.print("Entre com a quantidade de páginas: ");
                    int qtdPags = entrada.nextInt();

                    Livro l  = new Livro(nomeLivro, qtdPags);

                    b1.addLivro(l);
                    System.out.println("Livro adicionado!!");
                    System.out.println("-------------------------------------");
                    break;
                case 2:
                    b1.mostraInfo();
                    break;
                case 3:
                    System.out.println("BYE BYE!!");
                    flag = false;
                    break;
                default:
                    System.out.println("Digite uma das opções possiveis!!");
                    break;
            }
        }

        
    }
}
