package org.example;

public class Livro {
    String nome;
    int numPags;

    public Livro(String nome, int numPags) {
        this.nome = nome;
        this.numPags = numPags;
    }

    public void mostraInfo(){
        System.out.println("Nome do livro: "+this.nome);
        System.out.println("Número de páginas: "+this.numPags);
        System.out.println("---------------------------------");
    }
}
