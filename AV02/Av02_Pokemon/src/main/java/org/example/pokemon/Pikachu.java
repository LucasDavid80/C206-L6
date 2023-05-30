package org.example.pokemon;

import org.example.interfaces.AtaqueEspecial;
import org.example.interfaces.FazerBarulho;

public class Pikachu extends Pokemon implements FazerBarulho, AtaqueEspecial {
    private float soltarRaios;
    private float paralisiaEletrica;

    public Pikachu(String nome, String tipo, HeldItem heldItem,float soltarRaios, float paralisiaEletrica) {
        super(nome, tipo, heldItem);
        this.soltarRaios = soltarRaios;
        this.paralisiaEletrica = paralisiaEletrica;
        if(super.heldItem != null){
            this.soltarRaios += 200;
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
        System.out.println(this.getNome()+" usou choque do trovão!");
    }

    @Override
    public void ataqueEspecial() {
//        System.out.println(this.getNome() + " usou calda de ferro!");
        if (soltarRaios > 750){
            System.out.println(this.getNome() + " conseguiu ganhar de seu oponente!");
        } else {
            System.out.println(this.getNome() + " perdeu a batalha");
        }
    }

    @Override
    public void fazerBarulho() {
        System.out.println("Pika pika!!");
    }

    public float getSoltarRaios() {
        return soltarRaios;
    }

    public float getParalisiaEletrica() {
        return paralisiaEletrica;
    }
}
