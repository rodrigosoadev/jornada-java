package javacore.sobrecargaconstrutores.test;

import javacore.sobrecargaconstrutores.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante est = new Estudante("1234", "Rodrigo", new double[] {9,8,7}, "01/12/2025");

        est.imprime();

    }
}