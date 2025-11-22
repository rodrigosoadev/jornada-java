package javacore.introducaoclass.test;

import javacore.introducaoclass.classes.estudante;

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
