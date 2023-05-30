package org.example.astronauta;

import org.example.astronauta.Astronauta;
import org.example.interfaces.Missao;

public class Tripulante extends Astronauta implements Missao {
    private int qtdMissoes = 20;

    public Tripulante(String cor, String nome, Skin skin, Pet pet) {
        super(cor, nome, skin, pet);
    }

    @Override
    public void reportar() {
        System.out.println(getNome() + " reportou um corpo.");
    }

    @Override
    public void reparar() {
        System.out.println(getNome() + " fez um reparo.");
    }

    @Override
    public void fazerMissao() {
        System.out.println(getNome() + " fez uma missão.");
        qtdMissoes--;
    }

    public int getQtdMissoes() {
        return qtdMissoes;
    }

    public void setQtdMissoes(int qtdMissoes) {
        this.qtdMissoes = qtdMissoes;
    }
}
