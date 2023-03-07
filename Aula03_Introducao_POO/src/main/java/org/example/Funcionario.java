package org.example;

public class Funcionario {
    int idade;
    String nome;
    int cpf;
    float salario;

//    public Funcionario(int idade, String nome, int cpf, float salario) {
//        System.out.println("Contratou um novo funcionário!!");
//        this.idade = idade;
//        this.nome = nome;
//        this.cpf = cpf;
//        this.salario = salario;
//    }

    public void tirarFerias(String mes, int qtdDias){
        System.out.println("O funcionário "+ this.nome +" tirou férias no mês de "+mes+" durante "+ qtdDias+" dias!");
    }
    public double salarioAnual(){
        float salAnual = salario*12;
        return salAnual;
    }

    public double salarioAnual(float decimoTerceiro){
        float salAnual = salario*12;
        return salAnual + decimoTerceiro;
    }
}
