package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        //AULA 2 VARIAVEIS PRIMITIVAS

        //BOAS PRÁTICAS
        //declarações de variaveis
        double saldo_da_conta;
        double saldoDaPoupanca;

        //declaração de constantes
        int NUMERO_ALUNO = 18;

        //“String” é uma classe não um tipo
        String nome = "Victor";

        //Casting
        double numDouble = 1.54;
        float numFloat;

        numFloat = (float) numDouble;

        System.out.println(numFloat);

        //Método para entrada de dados
        Scanner entrada = new Scanner(System.in);

        //Entrada de um double
        System.out.print("Entre com um número double: ");
        double numDouble = entrada.nextDouble();

        //Entrada de um int
        System.out.print("Entre com um int: ");
        int numInt = entrada.nextInt();

        //Entrada de um float
        System.out.print("Entre com um float: ");
        float numFloat = entrada.nextFloat();

        entrada.nextLine();//Colocar sempre depois de um número se for entrar com uma String

        //Entrada de uma String
        System.out.print("Entre com um nome: ");
        String nome = entrada.nextLine();

        //Controle de fluxo
        int num1 = 10;
        int num2 = 20;

        if (num1 == num2){
            System.out.println("Os números são iguai!!");
        } else {
            System.out.println("Os números são diferentes!!");
        }
        */

        //Algoritmo para calculo de IMC
        float peso;
        float altura;
        float imc;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Entre com seu peso (kg): ");
        peso = entrada.nextFloat();
        System.out.print("Entre com a sua altura (m): ");
        altura = entrada.nextFloat();

        imc = (float) (peso/Math.pow(altura,2));

        if (imc < 18.5) {
            System.out.println("Você está abaixo do peso ideal!");
        } else if (imc <= 24.9) {
            System.out.println("Você está no peso ideal!!");
        } else if (imc <= 29.9) {
            System.out.println("Você está com sobrepeso (Cuidado!!)");
        } else if (imc <= 34.9) {
            System.out.println("Você está com Obesidade grau I (Preste Atenção!)");
        } else if (imc <= 39.9) {
            System.out.println("Você está com Obesidade grau II (Devia procurar um médico!!)");
        } else {
            System.out.println("Você está com Obesidade grau III ou Morbida (Procure um médico Imediatamente!!!)");
        }
        System.out.println("Seu IMC é "+String.format("%.2f",imc)+".");


    }
}