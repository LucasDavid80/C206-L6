package org.example;

public class Escola {
    String nome;
    String email;
    int numTelefone;
    String endereco;
    Estudante[] estudante = new Estudante[300];

    public void addEstudante(Estudante e){
        for (int i = 0; i < estudante.length; i++){
            if(estudante[i] == null){
                estudante[i] = e;
                break;
            }
        }

    }
    public void mostraInfo(){
        System.out.print("Nome da Escola: "+this.nome);
        System.out.print("E-mail da Escola: "+this.email);
        System.out.print("Número de telefone da Escola: "+this.numTelefone);
        System.out.print("Endereço da Escola: "+this.endereco);
        System.out.println("---------------------------------");
    }
    public void qtdEstudantePorAno(){
        int primeiro = 0;
        int segundo = 0;
        int terceiro = 0;
        for (int i = 0; i < estudante.length;i++) {
            if (estudante[i] != null ) {
                if (estudante[i].ano.equals("Primeiro")){
                    primeiro++;
                }
                if (estudante[i].ano.equals("Segundo")){
                    segundo++;
                }
                if (estudante[i].ano.equals("Terceiro")){
                    terceiro++;
                }
            }
        }
        System.out.println("Quantidade de alunos!!");
        System.out.print("Primeiro: "+primeiro);
        System.out.print("Segundo: "+segundo);
        System.out.print("Terceiro: "+terceiro);

    }
}
