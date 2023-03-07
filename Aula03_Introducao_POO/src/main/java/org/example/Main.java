package org.example;

public class Main {
    public static void main(String[] args) {

        //Criando um funcionario
//        Funcionario f1 = new Funcionario(21,"Victor",111111111,500);
        Funcionario f1 = new Funcionario();
        Funcionario f2 = new Funcionario();

        //atributos do f1
        f1.salario = 500;
        f1.cpf = 111111111;
        f1.nome = "Victor";
        f1.idade = 21;

        //atributos do f2
        f2.salario = 400;
        f2.cpf = 222222222;
        f2.nome = "Yves";
        f2.idade = 20;

        if (f1 == f2) {
            System.out.println("São os mesmos objetos!!");
        } else {
            System.out.println("Não são os mesmos objetos!!");
        }


        System.out.print("O salário anual do "+f1.nome+" é: ");
        System.out.println(f1.salarioAnual());

        System.out.print("O salário anual do "+f1.nome+" com décimo terceiro é: ");
        System.out.println(f1.salarioAnual(500));

        f1.tirarFerias("Janeiro",30);
    }
}