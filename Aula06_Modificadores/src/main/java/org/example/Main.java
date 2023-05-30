package org.example;

public class Main {
    public static void main(String[] args) {

        Joaninha j1 = new Joaninha(10,"vermelha");
        Joaninha j2 = new Joaninha(20,"amarelo");
        Joaninha j3 = new Joaninha(5,"azul");

//        System.out.println(Joaninha.qtdJoana);

        Funcionario f1 = new Funcionario("Lucas", 100);
        Funcionario f2 = new Funcionario("David", 1000);

        f1.mostraInfos();
        f2.mostraInfos();

        System.out.println(f1.nome+" recebe R$"+f1.getSalario());
        System.out.println(f2.nome+" recebe R$"+f2.getSalario());

        f1.setSalario(150);
        System.out.println(f1.nome+" recebe R$"+f1.getSalario());

//        Funcionario.cont = 100;

        System.out.println("Temos "+Funcionario.getCont()+" funcionarios na empresa!!");

        Funcionario.setCont(3);

        System.out.println("Temos "+Funcionario.getCont()+" funcionarios na empresa!!");
    }
}

