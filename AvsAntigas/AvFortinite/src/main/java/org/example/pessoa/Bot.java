package org.example.pessoa;

import org.example.interfaces.Interacao;

public class Bot extends Pessoa implements Interacao {
    private boolean hostil;

    public Bot(String nome, boolean hostil) {
        super(nome);
        this.hostil = hostil;
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
    }

    @Override
    public void fazMissao() {
        if (hostil ==  true){
            System.out.println("Atrapalhou o jogador a fazer a missão.");
        } else {
            System.out.println("Ajudou o jogador a fazer a missão.");
        }
    }

    @Override
    public void passarMissao() {

        if (hostil == true){
            System.out.println("Este Bot não passa missões!");
        } else {
            System.out.println("Este Bot passa missões!");
        }

    }

    public boolean isHostil() {
        return hostil;
    }

    public void setHostil(boolean hostil) {
        this.hostil = hostil;
    }
}
