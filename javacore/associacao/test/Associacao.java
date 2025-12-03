package javacore.associacao.test;

import javacore.associacao.classes.Aluno;
import javacore.associacao.classes.Local;
import javacore.associacao.classes.Professor;
import javacore.associacao.classes.Seminario;

public class Associacao {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Rodrigo Soares", 24);
        Aluno aluno2 = new Aluno("Gabriel Caleb", 14);

        Seminario seminario = new Seminario("Como ser um the power, the best programador");
        Professor prof = new Professor("Yoda","Usar a força para programar");
        Local local = new Local("Rua crisantemo", "jardins");
        

        aluno.setSeminario(seminario);
        aluno2.setSeminario(seminario);
        System.out.println("----------------");
        
        seminario.setProfessor(prof);
        seminario.setLocal(local);
        seminario.setAlunos(new Aluno[]{aluno,aluno2});

        Seminario[] seminariosArray = new Seminario[1];
        seminariosArray[0] = seminario;
        prof.setSeminarios(seminariosArray);

        seminario.printSeminario();
        prof.printProfessor();
        
    }
}
