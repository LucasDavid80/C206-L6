package org.example;

public class Funcionario {

    String nome;
    int id;
    private static int cont;

    private int salario;

    public Funcionario(String nome, int salario) {
        this.nome = nome;
        cont++;
        this.id = cont;
        this.salario = salario;
    }

    void mostraInfos(){
        System.out.println("Id: "+this.id);
        System.out.println("Nome: "+this.nome);
    }

    public static int getCont() {
        return cont;
    }

    public static void setCont(int cont) {
        Funcionario.cont = cont;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}
