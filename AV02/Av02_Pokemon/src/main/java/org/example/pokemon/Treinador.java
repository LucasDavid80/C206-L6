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
        System.out.println();
        for (int i = 0; i < pokemons.length;i++){
            if (pokemons[i] != null){
                if (pokemons[i] instanceof Squirtle) {
                    Squirtle pokemon = (Squirtle) pokemons[i];
                    pokemon.fazerBarulho();
                    pokemon.mostraInfo();
                    System.out.println("Multiplicador de água " + pokemon.getMultiplicadorAgua());
                    pokemon.atacar();
                }
                if (pokemons[i] instanceof Bulbassaur) {
                    Bulbassaur pokemon = (Bulbassaur) pokemons[i];
                    pokemon.fazerBarulho();
                    pokemon.mostraInfo();
                    System.out.println("Luminosidade do ambiente " + pokemon.getLuminosidadeAmbiente());
                    pokemon.atacar();
                    pokemon.ataqueEspecial();
                }
                if (pokemons[i] instanceof Pikachu) {
                    Pikachu pokemon = (Pikachu) pokemons[i];
                    pokemon.fazerBarulho();
                    pokemon.mostraInfo();
                    System.out.println("soltar raios " + pokemon.getSoltarRaios());
                    System.out.println("Paralisia eletrica " + pokemon.getParalisiaEletrica());
                    pokemon.atacar();
                    pokemon.ataqueEspecial();
                }
                System.out.println("----------------------------------------------");
            }
        }
    }
}
