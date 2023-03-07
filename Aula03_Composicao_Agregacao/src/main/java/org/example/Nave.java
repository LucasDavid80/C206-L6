package org.example;

public class Nave {
    String nome;
    int velocidade;
    boolean velocidadeDaLuz = false;
    Arma arma;

    public Nave(String nome, int velocidade, boolean velocidadeDaLuz, Arma arma) {
        this.nome = nome;
        this.velocidade = velocidade;
        this.velocidadeDaLuz = velocidadeDaLuz;

        this.arma = arma;
    }

    public void MostrarInfo(){
        System.out.println("Nome da nave: "+this.nome);
        System.out.println("Velocidade da nave: "+this.velocidade);
//        System.out.println("Anda em velocidade da luz? "+this.velocidadeDaLuz);
        if (this.arma == null){
            System.out.println("Nenhuma arma adicionada");
        } else {
            System.out.println("Tipo da arma: "+this.arma.tipo);
            System.out.println("Força da arma: "+this.arma.poder);
        }

    }

    public void viajarVelocidadeDaLuz(){
        if (this.velocidadeDaLuz==true){
            System.out.println("Viaja em velocidade da luz");
        } else {
            System.out.println("Não viaja em velocidade da luz");
        }
    }

    public void addArma(Arma arma){
        System.out.println("Arma foi adicionada!!");
        this.arma = arma;
    }
}
