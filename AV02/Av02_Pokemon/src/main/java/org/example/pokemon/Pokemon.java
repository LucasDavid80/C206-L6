package org.example.pokemon;

public abstract class Pokemon {
    public static int qtdPokemon = 0;
    private String nome;
    private String tipo;
    public HeldItem heldItem;

    public  void mostraInfo(){
        if (heldItem == null){
            System.out.println("Não possui item");
        } else {
            System.out.println("Held item: "+heldItem.tipo);
        }
    }
    public  void atacar(){}

    public Pokemon(String nome, String tipo, HeldItem heldItem) {
        qtdPokemon++;
        this.nome = nome;
        this.tipo = tipo;
        this.heldItem = heldItem;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }
}
