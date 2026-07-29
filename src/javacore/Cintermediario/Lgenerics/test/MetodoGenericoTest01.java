package javacore.Cintermediario.Lgenerics.test;

import java.util.ArrayList;
import java.util.List;

import javacore.Cintermediario.Lgenerics.dominio.Barco;

public class MetodoGenericoTest01 {
    public static void main(String[] args) {
        List<Barco> barcoList = criarArrayComUmObjeto(new Barco("Canoa"));
        System.out.println(barcoList);
    }

    private static <T> List<T> criarArrayComUmObjeto(T t) {
        return List.of(t);
    }
}
// Este arquivo demonstra criação de método genérico para criar lista com um objeto.
