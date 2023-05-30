package org.example.pessoa;

import org.example.interfaces.Loja;
import org.example.interfaces.Recuperar;

public class Jogador extends Pessoa implements Recuperar, Loja {
    private int nivel;
    private boolean passeBatalha;
    private int vida;
    private int escudo;
    public Skin skin;
    public Mochila mochila;

    public Jogador(String nome, int nivel, boolean passeBatalha, int vida, int escudo, Skin skin, Mochila mochila) {
        super(nome);
        this.nivel = nivel;
        this.passeBatalha = passeBatalha;
        this.vida = vida;
        this.escudo = escudo;
        this.skin = skin;
        this.mochila = mochila;
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
    }

    @Override
    public void fazMissao() {
        System.out.println(getNome() + " completou uma missão!");
        this.nivel++;
    }
    @Override
    public void gastarVbucks() {
        System.out.println("Gastou V Bucks na loja.");

    }

    @Override
    public void comprarVbucks() {
        System.out.println("Comprou V Bucks na loja.");

    }

    @Override
    public void recuperarVida() {
        this.vida += 15;

        if (this.vida > 100){
            this.vida = 100;
        }

    }

    @Override
    public void recuperarEscudo() {
        this.escudo += 15;

        if (this.escudo > 100){
            this.escudo = 100;
        }
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

    public Skin getSkin() {
        return skin;
    }

    public void setSkin(Skin skin) {
        this.skin = skin;
    }

    public Mochila getMochila() {
        return mochila;
    }

    public void setMochila(Mochila mochila) {
        this.mochila = mochila;
    }

}
