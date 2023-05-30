package org.example.pessoa;

public abstract class Pessoa {
    public static int qtdPessoa;
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public void mostraInfo(){}
    public abstract void fazMissao();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
