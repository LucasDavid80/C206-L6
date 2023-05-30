package org.example.pokemon;

import org.example.interfaces.AtaqueEspecial;
import org.example.interfaces.FazerBarulho;

public class Bulbassaur extends Pokemon implements FazerBarulho, AtaqueEspecial {
    private float luminosidadeAmbiente;

    public Bulbassaur(String nome, String tipo, HeldItem heldItem, float luminosidadeAmbiente) {
        super(nome, tipo, heldItem);
        this.luminosidadeAmbiente = luminosidadeAmbiente;
        if(super.heldItem != null){
            this.luminosidadeAmbiente += 300;
        }
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
        System.out.println(this.getNome()+" usou ataque de folhas!");
    }

    @Override
    public void ataqueEspecial() {
//        System.out.println(this.getNome() + " usou envenenar!");
        if (luminosidadeAmbiente > 650){
            System.out.println(this.getNome() + " conseguiu ganhar de seu oponente!");
        } else {
            System.out.println(this.getNome() + " perdeu a batalha");
        }
    }

    @Override
    public void fazerBarulho() {
        System.out.println("Bulbassaur!!");
    }

    public float getLuminosidadeAmbiente() {
        return luminosidadeAmbiente;
    }
}
