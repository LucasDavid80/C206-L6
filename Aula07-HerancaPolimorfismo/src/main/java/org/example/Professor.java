package org.example;

public class Professor extends Funcionario {

    private String materia;

    public Professor(String nome, int idade, double salario, String materia) {
        super(nome, idade, salario);
        this.materia = materia;
    }

    @Override
    void mostraInfo() {
        System.out.println("INFORMAÇÕES DO PROFESSOR");
        super.mostraInfo();
        System.out.println("Matéria do professor: " + materia);
    }

    @Override
    void executaAcao() {
        super.executaAcao();
        System.out.println("O professor " + getNome() + " está dando aula!!");
    }

    void corrigirProvas(){
        System.out.println("O professor " + getNome() + " está corrigindo prova!");
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
}
