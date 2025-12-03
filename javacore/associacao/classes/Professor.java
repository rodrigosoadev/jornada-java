package javacore.associacao.classes;

public class Professor {
    private Seminario[] seminarios;
    private String nome;
    private String especialidade;

    
    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }
 
    public Professor() {
    }

    public void printProfessor() {
        System.out.println("---------------Relatório de professor---------------");
        System.out.println("Nome do professor: "+this.nome);
        System.out.println("Especialidade: "+this.especialidade);
        System.out.println("Seminários participantes: ");
        for (Seminario seminario : seminarios) {
            System.out.print(seminario.getTitulo()+ " ");
        }
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEspecialidade() {
        return especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
    
}
