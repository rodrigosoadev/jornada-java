package javacore.Bbasicoorientacaoobj.introducaometodos.dominio;

public class Estudante {
    private String nome;
    private int idade;
    private double[] notas;
    private boolean aprovado;


    public void dadosEstudante() {
        
        System.out.println("Dados do estudante:");
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);
        for (double nota : notas) {
            System.out.print("Nota: "+ nota+" ");
         }
    }

    public void imprimirMedia() {
        if (this.notas == null) {
            System.out.println("Esse aluno não possui notas");
            return;
        }
        double media = 0;
        for (double nota : this.notas) {
            media += nota;
        }
        media = media / this.notas.length;

        if (media >= 6){
            this.aprovado = true;
            System.out.println(" Situação: Aprovado");
        }else{
            this.aprovado = false;
            System.out.println(" Situação: Reprovado");
        }

        
    }
    //modificadores
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if (idade < 0 ){
            System.out.println("Idade inválida");
        }
        this.idade = idade;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public String getNome(){
        if (nome == null){
            System.out.println("Por favor, digite um nome");
        }
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public double[] getNotas(){
        return this.notas;
    }

    public boolean isAprovado(){
        return this.aprovado;
    }
    // fim modificadores 
}
