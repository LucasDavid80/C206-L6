package org.example.pokemon;

public class Pokemon {
    public static int qtdPokemon = 0;
    private String nome;
    private String tipo;
    public HeldItem heldItem;

    public void mostraInfo(){}
    public void atacar(){}

    public Pokemon(String nome, String tipo, HeldItem heldItem) {
        this.nome = nome;
        this.tipo = tipo;
        this.heldItem = heldItem;
        qtdPokemon++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
