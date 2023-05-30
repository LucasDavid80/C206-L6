package org.example;

import org.example.pessoa.Bot;
import org.example.pessoa.Jogador;
import org.example.pessoa.Mochila;
import org.example.pessoa.Skin;

public class Main {
    public static void main(String[] args) {
        Skin s1 = new Skin();
        s1.setNome("Zumbi");
        s1.setRaridade("Ouro");
        Skin s2 = new Skin();
        s2.setNome("Monstro");
        s2.setRaridade("Platina");

        Mochila m1 = new Mochila();
        Mochila m2 = new Mochila();
        m1.setRaridade("Platina");
        m2.setRaridade("Prata");

        Bot b1 = new Bot("Carlos",false);
        Jogador j1 = new Jogador("Ana",61,true,66,57,s2,m1);
        Jogador j2 = new Jogador("Joel",21,false,12,26,s1,m2);
    }
}