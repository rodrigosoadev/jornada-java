package javacore.Bbasicoorientacaoobj.associacao.dominio;

public class Seminario {
    private Aluno[] alunos;
    private Professor professor;
    private Local local;
    private String titulo;

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public Seminario() {
    }

    public void printSeminario() {
        System.out.println("---------------Relatório de seminários---------------");
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Professor palestrante: " + this.professor.getNome());

        if (this.professor != null) {
            System.out.println("Professor" + this.professor.getNome());
        } else {
            System.out.println("Sem professor registrado para esse seminário");
        }

        if (this.local != null) {
            System.out.println("Local: " + this.local.getRua() + " , Bairro: " + this.getLocal().getBairro());
        } else {
            System.out.println("Sem local registrado para esse seminário");
        }

        System.out.println("Alunos participantes: ");
        if (this.alunos != null && this.alunos.length != 0) {
            for (Aluno aluno : alunos) {
                System.out.println(aluno.getNome());
            }
        } else {
            System.out.println("Sem aluno inscrito para esse seminário");
        }

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

}
