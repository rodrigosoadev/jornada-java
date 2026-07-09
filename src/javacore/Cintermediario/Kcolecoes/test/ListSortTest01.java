package javacore.Cintermediario.Kcolecoes.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import javacore.Cintermediario.Kcolecoes.dominio.Manga;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>();
        mangas.add("Berserk");
        mangas.add("Hellsing ultimate");
        mangas.add("Pokemon");
        mangas.add("Attk");
        mangas.add("Dragon ball z");

        Collections.sort(mangas);

        List<Double> dinheiros = new ArrayList<>();
        dinheiros.add(100.21);
        dinheiros.add(23.98);
        dinheiros.add(21.21);
        dinheiros.add(98.10);

        for (String manga : mangas) {
            System.out.println(manga);
        }

        System.out.println("------");
        Collections.sort(dinheiros);
        for (Double dinheiro : dinheiros) {
            System.out.println(dinheiro);
        }

        new Manga(null, null, 0);

    }
}
