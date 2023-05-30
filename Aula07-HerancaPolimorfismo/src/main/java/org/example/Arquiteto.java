package org.example;

public class Arquiteto extends Funcionario {

    private String especialidade;

    public Arquiteto(String nome, int idade, double salario, String especialidade) {
        super(nome, idade, salario);
        this.especialidade = especialidade;
    }

    @Override
    void mostraInfo() {
        System.out.println("INFORMAÇÕES DO ARQUITETO");
        super.mostraInfo();
        System.out.println("Especialidade do arquiteto: " + especialidade);
    }

    @Override
    void executaAcao() {
        super.executaAcao();
        System.out.println("O arquiteto " + getNome() + " está planejando um prédio");
    }

    @Override
    double salarioBonus() {
        return super.salarioBonus() + 700;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
