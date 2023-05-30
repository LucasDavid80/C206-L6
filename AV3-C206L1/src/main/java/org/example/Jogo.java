package org.example;

import org.example.exceptions.PrecoNegativoException;

public class Jogo implements Comparable<Jogo> {

    private String nome;
    private double preco;
    private String genero;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco)  throws PrecoNegativoException {
        if(preco > 0) {
            this.preco = preco;
        } else {
            throw new PrecoNegativoException("Não é possivel cadastrar preço negativo ou zerado");
        }
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public int compareTo(Jogo o) {
        if (this.preco < o.preco) {
            return -1;
        } else if (this.preco > o.preco) {
            return 1;
        } else {
            return 0;
        }
    }

}
