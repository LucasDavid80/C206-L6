package org.example;

import org.example.interfaces.Executar;
import org.example.interfaces.Missao;
import org.example.interfaces.Sabotar;

public class Impostor extends Astronauta implements Missao, Sabotar, Executar {
    private int qtdMortes;

    public void usarVentoinha(){}
    public void tracaPortas(String local){}

    @Override
    public void executar() {

    }

    @Override
    public void fazerMissao() {

    }

    @Override
    public void sabotarLuz() {

    }

    @Override
    public void sabotarOxigenio() {

    }

    @Override
    public void sabotarReator() {

    }

    @Override
    public void sabotarComunicacao() {

    }

    public int getQtdMortes() {
        return qtdMortes;
    }

    public void setQtdMortes(int qtdMortes) {
        this.qtdMortes = qtdMortes;
    }
}
