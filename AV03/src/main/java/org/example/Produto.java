package org.example;

import org.example.exceptions.InfoInvalidaException;

public class Produto implements Comparable<Produto> {

    private String nome;
    private double preco;
    private String tipo;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) throws InfoInvalidaException {
        if(preco > 0) {
            this.preco = preco;
        } else {
            throw new InfoInvalidaException("Não é possivel cadastrar preço negativo ou zerado");
        }
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) throws InfoInvalidaException {
        if(tipo.equals("Comida") || tipo.equals("Higiene") || tipo.equals("Decoração")){
            this.tipo = tipo;
        } else {
            throw new InfoInvalidaException("Somente é possível cadastrar os tipos (Comida, Higiene e Decoração)");
        }
    }

    @Override
    public int compareTo(Produto o) {
        if (this.preco < o.preco) {
            return -1;
        } else if (this.preco > o.preco) {
            return 1;
        } else {
            return 0;
        }
    }
}
