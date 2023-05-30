package org.example;

public class Aldeia {
    String nome;
    int qtdMoradores;
    String regiao;

    Ninja[] ninjas = new Ninja[10];

    void adicionarNinja(Ninja ninja){
        for(int i = 0; i < ninjas.length; i++){
            if (ninjas[i] == null){
                ninjas[i] = ninja;
                break;
            }
        }
    }

    void mostraInfo(){
        System.out.println("Bem-vindo a "+nome);
        System.out.println("Temos uma população de "+ qtdMoradores+ " civis.");
        System.out.println("Situada na região "+regiao);

        for (int i = 0; i < ninjas.length;i++){
            if (ninjas[i] != null){
                ninjas[i].mostraInfo();
            }
        }
//        System.out.println("-------------------------------");
    }

    void rankingS(){
        System.out.println("Ninjas ranking S:");
        for (int i = 0; i < ninjas.length;i++){
            if (ninjas[i] != null) {
                if (ninjas[i].ranking.equals("S")) {
                    System.out.println(ninjas[i].nome);
                }
            }
        }
        System.out.println("-------------------------------");
    }

    void qtdTitulos(){
        int chunnin = 0, gennin = 0, anbu = 0;
        for (int i = 0; i < ninjas.length; i++){
            if (ninjas[i] != null){
                if (ninjas[i].titulo.equals("Chunnin")){
                    chunnin++;
                }
                if (ninjas[i].titulo.equals("Gennin")){
                    gennin++;
                }
                if (ninjas[i].titulo.equals("ANBU")){
                    anbu++;
                }
            }
        }

        System.out.println("Quantidade de nijas: ");
        System.out.println("Gennin: "+gennin);
        System.out.println("Chunnin: "+chunnin);
        System.out.println("ANBU: "+anbu);
        System.out.println("--------------------------");
    }
}
