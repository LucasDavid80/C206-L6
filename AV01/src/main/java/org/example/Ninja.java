package org.example;

public class Ninja {
    String nome;
    int idade;
    String titulo;
    String ranking;

    public Ninja(String nome, int idade, String titulo, String ranking) {
        this.nome = nome;
        this.idade = idade;
        this.titulo = titulo;
        this.ranking = ranking;
    }

    void mostraInfo(){
        System.out.println("Ninja: "+this.nome);
        System.out.println("Idade: "+this.idade);
        System.out.println("Título: "+this.titulo);
        System.out.println("Ranking: "+this.ranking);
        System.out.println("-------------------------------");
    }
}
