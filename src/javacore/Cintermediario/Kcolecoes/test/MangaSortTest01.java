package javacore.Cintermediario.Kcolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javacore.Cintermediario.Kcolecoes.dominio.Manga;

public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L, "Hellsing Ultimate", 19.9));
        mangas.add(new Manga(1L,"Pokemon", 9.5));
        mangas.add(new Manga(4L,"Attk", 3.2));
        mangas.add(new Manga(3L,"Dragon ball z", 11.20));
        mangas.add(new Manga(2L,"Berserl", 2.99));

        for (Manga mangas1 : mangas) {
            System.out.println(mangas1);
        }
        System.out.println("-----------");
        Collections.sort(mangas);
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        //System.out.println(mangas);
    }
}
