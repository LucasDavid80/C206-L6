package org.example;

public class ThreadContadora extends Thread{

    String nome;

    public ThreadContadora(String nome) {
        this.nome = nome;
    }

    public void run(){
        System.out.println(this.nome+"-");
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
