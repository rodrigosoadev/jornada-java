package javacore.classeabstratas.dominio;

public class Vendedor  extends Funcionario{
    private double totalVendas;

    public Vendedor(){
    }

    public Vendedor(String nome, String clt, double salario) {
        super(nome, clt, salario);
        this.totalVendas = totalVendas;
    }

    @Override
    public void calculaSalario() {
        this.salario = salario + (salario * 0.05);
    }


    @Override
    public String toString() {
        return "O vendedor: "+nome+ ", CLT: "+clt + ", possui o salário de: "+salario;
    }

    @Override
    public void imprime() {
        System.out.println("Dentro do metodo imprime");
    }

     public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }
   
    
}
