package org.example.pokemon;

public class Treinador {
    private String nome;
    private Pokemon pokemons[] = new Pokemon[6];

    public Treinador(String nome) {
        this.nome = nome;
    }

    public void addPokemon(Pokemon poke){
        for (int i = 0; i < pokemons.length;i++){
            if (pokemons[i]==null){
                pokemons[i] = poke;
                break;
            }
        }
    }
    public void mostraInfo(){
        System.out.println("Treinador: "+this.nome);
        System.out.println("POkemon(s): ");
        for (int i = 0; i < pokemons.length;i++){
            if (pokemons[i] != null){
                System.out.println("Nome: "+pokemons[i].getNome());
                System.out.println("Tipo: "+pokemons[i].getTipo());
                System.out.println("Held Item: "+pokemons[i].heldItem);
                pokemons[i].
            }
        }
    }
}
