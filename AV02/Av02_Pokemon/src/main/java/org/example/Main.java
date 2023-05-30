package org.example;

import org.example.pokemon.*;

public class Main {
    public static void main(String[] args) {
        HeldItem heldItem = new HeldItem();
        heldItem.tipo = "Óculos escuro";
        Squirtle squirtle = new Squirtle("Squirtle", "Água", heldItem, 200);
        Bulbassaur bulbassaur = new Bulbassaur("Bulbassaur", "Planta", null, 600);
        Pikachu pikachu = new Pikachu("Pikachu","Eletrico",heldItem, 600, 200);

        Treinador treinador = new Treinador("Ash");

        treinador.addPokemon(squirtle);
        treinador.addPokemon(bulbassaur);
        treinador.addPokemon(pikachu);

        treinador.mostraInfo();

        System.out.println("Quantidade total de pokemons: "+Pokemon.qtdPokemon);
    }
}