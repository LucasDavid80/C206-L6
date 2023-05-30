package org.example.pessoa;

public class Jogador extends Pessoa {
    private int nivel;
    private boolean passeBatalha;
    private int vida;
    private int escudo;
    public Skin skin;
    public Mochila mochila;


    @Override
    public void mostraInfo() {
        super.mostraInfo();
    }

    @Override
    public void fazMissao() {
        super.fazMissao();
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public boolean isPasseBatalha() {
        return passeBatalha;
    }

    public void setPasseBatalha(boolean passeBatalha) {
        this.passeBatalha = passeBatalha;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getEscudo() {
        return escudo;
    }

    public void setEscudo(int escudo) {
        this.escudo = escudo;
    }
}
