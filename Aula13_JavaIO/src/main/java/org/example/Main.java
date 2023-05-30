package org.example;

import Exercicio1.Funcionario;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Exercicio1.Arquivo arq = new Exercicio1.Arquivo();
        Exercicio1.Funcionario f1 = new Exercicio1.Funcionario();
        Scanner in = new Scanner(System.in);
        boolean flag = true;

        while (flag){
            System.out.println("Bem-vindo ao menu!");
            System.out.println("1 - Cadastrar Funcionario");
            System.out.println("2 - Listar Funcionario");
            System.out.println("3 - Sair");
            int op = in.nextInt();

            switch (op){
                case 1:
                    in.nextLine();
                    System.out.println("Cadastrar Funcionario");
                    f1.setNome(in.nextLine());
                    f1.setCpf(in.nextLine());
                    f1.setIdade(in.nextInt());

                    arq.escrever(f1);

                    break;
                case 2:
                    ArrayList<Funcionario> funcionarios = arq.ler();
                    Collections.sort(funcionarios);
                    Collections.reverse(funcionarios);
                    for(int i = 0; i < funcionarios.size();i++){
                        System.out.println(funcionarios.get(i).getNome());
                        System.out.println(funcionarios.get(i).getCpf());
                        System.out.println(funcionarios.get(i).getIdade());
                    }
                    break;
                case 3:
                    System.out.println("Fim do Sistema!");
                    flag = false;
                    break;
                default:
                    System.out.println("Opção incorreta!");

            }
        }
    }
}