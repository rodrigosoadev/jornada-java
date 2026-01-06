package src.javacore.Bbasicoorientacaoobj.Gassociacao.dominio;

public class Aluno {
    private Seminario seminario;
    private String nome;
    private int idade;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    public Aluno() {
    }

    public void printAluno() {
        System.out.println("---------------Relatório de alunos---------------");
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);
        if ( this.seminario != null) {
            System.out.println("Seminario inscrito: "+this.seminario.getTitulo());
        }else{
            System.out.println("Aluno não está inscrito em nenhum seminario");
        }
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }
    

    

}
