package org.example;

import org.example.interfaces.Missao;

public class Tripulante extends Astronauta implements Missao {
    private int qtdMissoes;

    @Override
    public void fazerMissao() {

    }

    public int getQtdMissoes() {
        return qtdMissoes;
    }

    public void setQtdMissoes(int qtdMissoes) {
        this.qtdMissoes = qtdMissoes;
    }
}
