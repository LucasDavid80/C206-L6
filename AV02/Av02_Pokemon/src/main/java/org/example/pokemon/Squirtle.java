package org.example.pokemon;

import org.example.interfaces.FazerBarulho;

public class Squirtle extends Pokemon implements FazerBarulho {
    private float multiplicadorAgua;

    public Squirtle(String nome, String tipo, HeldItem heldItem, float multiplicadorAgua) {
        super(nome, tipo, heldItem);
        this.multiplicadorAgua = multiplicadorAgua;
    }

    @Override
    public void mostraInfo() {
        System.out.println("Nome: "+getNome());
        System.out.println("Tipo: "+getTipo());
        super.mostraInfo();
    }

    @Override
    public void atacar() {
        super.atacar();
        System.out.println(this.getNome()+" usou jato d'água!");
    }

    @Override
    public void fazerBarulho() {
        System.out.println("Squirtle! Squirtle!");
    }
    public float getMultiplicadorAgua() {
        return multiplicadorAgua;
    }
}
