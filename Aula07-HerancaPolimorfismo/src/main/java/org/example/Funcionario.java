package org.example;

public class Funcionario {
    protected String nome;
    protected int idade;
    protected double salario;

    public Funcionario(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    void mostraInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.printf("Salário: R$%.2f",salario);
        System.out.println();
//        System.out.printf("Total da compra: R$%.2f", cliente.calculaCompraTotal());
    }

    void executaAcao(){
    }

    double salarioBonus(){
        return salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
