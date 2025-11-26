package javacore.introducaometodos.classes;

public class Estudante {
    public String nome;
    public String idade;
    public double nota1;
    public double nota2;
    public double nota3;

    public void dadosEstudante() {
        
        System.out.println("Dados do estudante:");
         System.out.println("Nome: "+this.nome);
         System.out.println("Idade: "+this.idade);
         System.out.println("Primeira nota: "+this.nota1);
         System.out.println("Segunda nota: "+this.nota2);
         System.out.println("Terceira nota: "+this.nota3);
    }

    public void imprimirMedia(double num1, double num2, double num3) {
        
        if ((num1 + num2 + num3) / 3 >= 6){
            System.out.println("O aluno "+nome+" Foi Aprovado");
        }else {
            System.out.println("O aluno "+nome+" Foi Reprovado");
        };
    }
}
