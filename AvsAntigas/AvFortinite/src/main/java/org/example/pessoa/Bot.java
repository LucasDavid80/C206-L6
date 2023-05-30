package org.example.pessoa;

public class Bot extends Pessoa {
    private boolean hostil;

    @Override
    public void mostraInfo() {
        super.mostraInfo();
    }

    @Override
    public void fazMissao() {
        super.fazMissao();
    }

    public boolean isHostil() {
        return hostil;
    }

    public void setHostil(boolean hostil) {
        this.hostil = hostil;
    }
}
