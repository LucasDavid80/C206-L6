package org.example;

public class Engenheiro extends Funcionario {

    private String ramo;

    public Engenheiro(String nome, int idade, double salario, String ramo) {
        super(nome, idade, salario);
        this.ramo = ramo;
    }

    @Override
    void mostraInfo() {
        System.out.println("INFORMAÇÕES DO ENGENHEIRO");
        super.mostraInfo();
        System.out.println("Ramo do engenheiro: " + ramo);
    }

    @Override
    void executaAcao() {
        super.executaAcao();
        System.out.println("O engenheiro " + getNome() + " está trabalhando!");
    }

    public String getRamo() {
        return ramo;
    }

    public void setRamo(String ramo) {
        this.ramo = ramo;
    }
}
