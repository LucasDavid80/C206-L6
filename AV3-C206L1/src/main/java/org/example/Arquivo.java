package org.example;

import org.example.Jogo;

import java.io.*;
import java.util.ArrayList;

public class Arquivo {

    // Métodos que podemos realizar com o arquivo
    public void escrever(Jogo jog) {
        // Instanciando os objetos que permitirão a escrita de dados
        OutputStream os = null; // fluxo de entrada
        OutputStreamWriter osw = null; //leitor de fluxo de entrada
        BufferedWriter bw = null; //buffer entrada

        // Variável auxiliar
        String linha;

        try {
            // Abrindo a saída de dados
            os = new FileOutputStream("Jogo.txt", true); // Nome do arquivo onde será salvo
            osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw);


            // Flag que indica onde começa as informações do Funcionário
            bw.write("++ Jogo ++\n");
            bw.write(jog.getNome() + "\n");
            bw.write(jog.getPreco() + "\n");
            bw.write(jog.getGenero() + "\n");

            /*
            // 1. Escrita de forma estática, ou seja, direta

            linha="Olá mundo 3";
            bw.write("Olá mundo\n");
            bw.write("Olá mundo 2");
            bw.newLine();
            bw.write(linha);

             */

        } catch (Exception e) {
            System.out.println("ERRO: " + e);
        } finally {
            // Fechando a entrada de dados
            try {
                bw.close();
            } catch (Exception e) {
            }
        }
    }

    // 2. Método ler


    public ArrayList<Jogo> ler() {

        // ArrayList auxiliar para salvar funcionários encontrados no arquivo
        ArrayList<Jogo> encontreiNoArquivo = new ArrayList<>();

        // Classes que permitem leitura de dados do arquivo
        InputStream is = null; //fluxo saida
        InputStreamReader isr = null; //gerador de fluxo de saida
        BufferedReader br = null; // buffer de saida

        // Variável auxiliar que servirá de flag para o while
        String linhaLer;

        try {
            // Instanciando os objetos
            is = new FileInputStream("Jogo.txt");
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            // Colocando o cursor no inicio do arquivo
            linhaLer = br.readLine();

            while (linhaLer != null) {
                // Comparando se o que está em linhaLer é igual a minha flag
                if (linhaLer.contains("++ Jogo ++")) {
                    // Variável auxiliar de funcionario
                    Jogo j1 = new Jogo();
                    j1.setNome(br.readLine());
                    j1.setPreco(Double.parseDouble(br.readLine()));
                    j1.setGenero(br.readLine());

                    // Adicionando o funcionario no array
                    encontreiNoArquivo.add(j1);
                }
                linhaLer = br.readLine();
            }


        } catch (Exception e) {
        } finally {
            try {
                br.close();
            } catch (Exception e) {

            }
        }
        return encontreiNoArquivo;
    }
}
