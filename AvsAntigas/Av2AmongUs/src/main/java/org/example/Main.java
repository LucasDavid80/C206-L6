package org.example;

import org.example.astronauta.*;

public class Main {
    public static void main(String[] args) {

        Skin s1 = new Skin();
        s1.setTipo("Zumbi");
        Skin s2 = new Skin();
        s2.setTipo("Monstro");

        Pet p1 = new Pet();
        Pet p2 = new Pet();
        p1.setNome("Gato");
        p2.setNome("Cachorro");

        Tripulante t1 = new Tripulante("Amarelo","Carlos",s1,p1);
        Impostor i1 = new Impostor("Azul", "Ana",s2,p2);

        Astronauta[] astronautas = new Astronauta[10];
        astronautas[0] = t1;
        astronautas[1] = i1;

        System.out.println("Funções do Tripulante!");

        astronautas[0].reportar();
        astronautas[0].reparar();
        if (astronautas[0] instanceof Tripulante){
            Tripulante tripulante1 = (Tripulante) astronautas[0];
            tripulante1.fazerMissao();
            System.out.println("Qtd missões: "+tripulante1.getQtdMissoes());
        }
        astronautas[0].mostraInfo();
        System.out.println("----------------------------------------------");
        System.out.println("Funções do Impostor!");
        astronautas[1].reportar();
        astronautas[1].reparar();
        if (astronautas[1] instanceof Impostor){
            Impostor impostor1 = (Impostor) astronautas[1];
            impostor1.usarVentoinha();
            impostor1.tracaPortas("lavanderia");
            impostor1.executar();
            impostor1.fazerMissao();
            impostor1.sabotarLuz();
            impostor1.sabotarOxigenio();
            impostor1.sabotarReator();
            impostor1.sabotarComunicacao();
        }
        astronautas[1].mostraInfo();
        System.out.println("----------------------------------------------");
    }
}
