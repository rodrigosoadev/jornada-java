package javacore.Cintermediario.Lgenerics.test;

import java.util.ArrayList;
import java.util.List;

import javacore.Cintermediario.Kcolecoes.dominio.Consumidor;

public class GenericsTest01 {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Midoriya");
        
        for (String o : lista) {
            System.out.println(o);
        }
        add(lista, new Consumidor("Midoriya"))
    }

    private static void add (List lista, Consumidor consumidor){
        lista.add(consumidor);
    }
}
