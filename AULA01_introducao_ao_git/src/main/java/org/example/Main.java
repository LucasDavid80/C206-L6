package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bem-vindo ao Almoxarifado!!");
        System.out.println("RESISTOR | CAPACITOR | PROTOBOARD");
        System.out.println("Faça a sua requisição!");

        Scanner entrada =  new Scanner(System.in);
        String componente = entrada.nextLine();

        switch (componente){
            case "RESISTOR":
                System.out.println("Requisitou um Resistor!!");
                break;
            case "CAPACITOR":
                System.out.println("Requisitou um Capacitor!!");
                break;
            case "PROTOBOARD":
                System.out.println("Requisitou um Protoboard!!");
                break;
            default:
                System.out.println("INVÁLIDO!!");
                break;
        }
    }
}