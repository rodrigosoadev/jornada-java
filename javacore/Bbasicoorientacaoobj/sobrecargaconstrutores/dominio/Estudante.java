package javacore.Bbasicoorientacaoobj.sobrecargaconstrutores.dominio;

public class Estudante {
    private String matricula;
    private String nome;
    private double[] notas;
    private String dataMatricula;


    public Estudante (String matricula, String nome, double[] notas){
        this.matricula = matricula;
        this.nome = nome;
        this.notas = notas;
    }

    public Estudante(String matricula, String nome, double[] notas, String dataMatricula) {
        this(matricula, nome, notas);
        this.dataMatricula = dataMatricula;
    }

    public void imprime() {
        System.out.println(this.matricula);
        System.out.println(this.nome);
        for (double nota : notas) {
            System.out.println(nota + " ");
        }
        System.out.println(this.dataMatricula);
    }


    //meotodo inicial
    //get serve para retornar o valor do atributo
    //set serve para modificar o valor do atributo
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
    
    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(){
        this.dataMatricula = dataMatricula;
    }

    //metodo final
}
