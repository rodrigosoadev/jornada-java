package javacore.Bbasicoorientacaoobj.Opolimorfismo.dominio;

public abstract class Produto implements Taxavel {
    protected String nome;
    protected double valor;

    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }
    
}
// Este arquivo demonstra classe abstrata Produto que implementa a interface Taxavel.
