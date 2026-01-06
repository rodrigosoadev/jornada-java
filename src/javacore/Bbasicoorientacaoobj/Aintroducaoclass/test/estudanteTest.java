package src.javacore.Bbasicoorientacaoobj.Aintroducaoclass.test;

import src.javacore.Bbasicoorientacaoobj.Aintroducaoclass.dominio.estudante;

public class estudanteTest {
    public static void main(String[] args) {
        estudante Rodrigo = new estudante();
        Rodrigo.nome = "Rodrigo";
        Rodrigo.matricula = "123";
        Rodrigo.idade = 24;

        System.out.println(Rodrigo.nome);
        System.out.println(Rodrigo.matricula);
        System.out.println(Rodrigo.idade);
    }
}
