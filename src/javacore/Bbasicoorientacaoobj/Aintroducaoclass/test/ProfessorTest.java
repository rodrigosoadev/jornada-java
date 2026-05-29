package javacore.Bbasicoorientacaoobj.Aintroducaoclass.test;

import javacore.Bbasicoorientacaoobj.Aintroducaoclass.dominio.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.cpf = 11111111;
        professor.matricula = 111;
        professor.nome = "Rodrigo";
        professor.rg = 1111;

        System.out.println("O nome do professor é: "+professor.nome + ", a matricula é: "+ professor.matricula + ", o RG é: "+professor.rg + " e possui CPF: "+professor.cpf);

    }
}
