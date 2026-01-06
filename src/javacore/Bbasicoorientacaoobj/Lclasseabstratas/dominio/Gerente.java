package src.javacore.Bbasicoorientacaoobj.Lclasseabstratas.dominio;

public class Gerente extends Funcionario {
    public Gerente() {
    }

    public Gerente(String nome, String clt, double salario) {
        super(nome, clt, salario);
    }

    @Override
    public void calculaSalario() {
        this.salario = salario + (salario * 0.2);
    }

    @Override
    public String toString() {
         return "O Gerente: "+nome+ ", CLT: "+clt + ", possui o salário de: "+salario;
    }

    
    
    

}
