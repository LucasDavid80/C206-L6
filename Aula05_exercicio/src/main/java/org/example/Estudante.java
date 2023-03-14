package org.example;

public class Estudante {
    String nome;
    int idade;
    String ano;

    public void mostraInfo(){
        System.out.print("Nome do estudante: "+this.nome);
        System.out.print("Idade: "+this.idade);
        System.out.print("Ano: "+this.ano);
        System.out.println("---------------------------------");
    }
}
