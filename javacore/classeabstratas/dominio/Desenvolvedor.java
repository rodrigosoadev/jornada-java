package javacore.classeabstratas.dominio;

public class Desenvolvedor extends Funcionario {
    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String toString() {
        return "Dev: "+nome + ", tem o salário: "+salario;
    }

    
}
