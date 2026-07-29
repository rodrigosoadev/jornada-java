package javacore.Cintermediario.Lgenerics.dominio;

public class Barco {
    private String nome;

    public Barco(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Barco [nome=" + nome + "]";
    }

    public String getNome() {
        return nome;
    }

    

    
}
// Este arquivo demonstra classe de domínio Barco com nome para exemplos de generics.
