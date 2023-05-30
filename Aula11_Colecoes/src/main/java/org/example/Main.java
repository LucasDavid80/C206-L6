package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList<Conta> arrayListConta = new ArrayList<>();

        Conta c1 = new Conta("Zé",100);
        Conta c2 = new Conta("Ivana",1000);
        Conta c3 = new Conta("João",100000);

        arrayListConta.add(c2);
        arrayListConta.add(c1);
        arrayListConta.add(c3);

        for (int i = 0; i < arrayListConta.size();i++){
            System.out.println(arrayListConta.get(i).dono+ " R$"+arrayListConta.get(i).saldo);
        }

        System.out.println();
        Collections.sort(arrayListConta);

        for (int i = 0; i < arrayListConta.size();i++){
            System.out.println(arrayListConta.get(i).dono+ " R$"+arrayListConta.get(i).saldo);
        }

        System.out.println();
        Collections.reverse(arrayListConta);

        /*
        arrayList.add(200);
        arrayList.add(10);
        arrayList.add(300);
        arrayList.add(100);

         */

//        arrayList.remove(000);

//        System.out.println(arrayListConta.isEmpty());

        for (int i = 0; i < arrayListConta.size();i++){
            System.out.println(arrayListConta.get(i).dono+ " R$"+arrayListConta.get(i).saldo);
        }

//        System.out.println();
//        Collections.sort(arrayList);
//        for (int i = 0; i < arrayList.size();i++){
//            System.out.println(arrayList.get(i));
//        }
//
//        System.out.println();
//        Collections.reverse(arrayList);
//        for (int i = 0; i < arrayList.size();i++){
//            System.out.println(arrayList.get(i));
//        }

    }
}