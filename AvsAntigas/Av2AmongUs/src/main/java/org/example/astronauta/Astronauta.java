package org.example.astronauta;

public abstract class Astronauta {

    public static int cont;
    private String cor;
    private String nome;
    public Skin skin;
    public Pet pet;

    public Astronauta(String cor, String nome, Skin skin, Pet pet) {
        this.cor = cor;
        this.nome = nome;
        this.skin = skin;
        this.pet = pet;
    }

    public void mostraInfo(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Cor: "+this.cor);
        System.out.println("Skin: "+this.skin.getTipo());
        System.out.println("Pet: "+this.pet.getNome());
    }
    public void verCameras(){
        System.out.println(nome + " olhou as câmeras");
    }
    public abstract void reportar();
    public abstract void reparar();

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
