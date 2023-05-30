package org.example.astronauta;

import org.example.astronauta.Astronauta;
import org.example.interfaces.Executar;
import org.example.interfaces.Missao;
import org.example.interfaces.Sabotar;

public class Impostor extends Astronauta implements Missao, Sabotar, Executar {
    private int qtdMortes;

    public Impostor(String cor, String nome, Skin skin, Pet pet) {
        super(cor, nome, skin, pet);
    }

    public void usarVentoinha(){
        System.out.println("O impostor se escondeu na ventilação.");
    }
    public void tracaPortas(String local){
        System.out.println("O impostor trancou as portas do(a) " + local);
    }

    @Override
    public void reportar() {
        System.out.println(getNome() + " fez um self report.");
    }

    @Override
    public void reparar() {
        System.out.println(getNome() + " fingiu que fez um reparo.");
    }

    @Override
    public void executar() {
        System.out.println(getNome() + " matou um tripulante.");
        qtdMortes++;
    }

    @Override
    public void fazerMissao() {
        System.out.println(getNome() + " fez uma tarefa falsa.");
    }

    @Override
    public void sabotarLuz() {
        System.out.println("O impostor sabotou a luz.");
    }

    @Override
    public void sabotarOxigenio() {
        System.out.println("O impostor sabotou o oxigênio.");
    }

    @Override
    public void sabotarReator() {
        System.out.println("O impostor sabotou o reator.");
    }

    @Override
    public void sabotarComunicacao() {
        System.out.println("O impostor sabotou a comunicação.");
    }

    public int getQtdMortes() {
        return qtdMortes;
    }
}
