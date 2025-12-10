package javacore.classeabstratas.dominio;

public abstract class Funcionario {
    protected String nome;
    protected String clt;
    protected double salario;

    

    public Funcionario() {
    }

    @Override
    public String toString() {
        return "Funcionario: " + nome + " Clt: " + clt + ", posssui o salario de: " + salario;
    }

    public Funcionario(String nome, String clt, double salario) {
        this.nome = nome;
        this.clt = clt;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    //o metodo abstract obriga as classes filhas a sobreescrever.
    public abstract void calculaSalario();

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClt() {
        return clt;
    }

    public void setClt(String clt) {
        this.clt = clt;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
