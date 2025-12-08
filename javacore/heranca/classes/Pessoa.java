package javacore.heranca.classes;

import javacore.introducaometodos.classes.Professor;

public class Pessoa extends Professor {
    // com protected consigo acessar o obj que estão na mesma pasta ou fora do pacote contando que seja filha da classe
    protected String nome;
    protected String cpf;
    protected Endereco endereco;


    public void print(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Cpf: "+this.cpf);
       // System.out.println("RG: "+this.rg);
        System.out.println("Endereço: "+this.endereco.getRua());
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    
}
