package org.example;

public class Main {
    public static void main(String[] args) {
        Arma a1 = new Arma("Fogo",300);
        Nave n1 = new Nave("Falcon", 500, false, a1);
        n1.MostrarInfo();
    }
}

