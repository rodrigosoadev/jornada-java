package javacore.Cintermediario.Kcolecoes.test;

import java.util.Set;
import java.util.HashSet;

import javacore.Cintermediario.Kcolecoes.dominio.Manga;

public class SetTest01 {
    public static void main(String[] args) {

        Set<Manga> mangas = new HashSet<>();
        mangas.add(new Manga(5L, "Hellsing Ultimate", 19.9, 0));
        mangas.add(new Manga(1L,"Pokemon", 9.5, 5));
        mangas.add(new Manga(4L,"Attk", 3.2, 0));
        mangas.add(new Manga(3L,"Dragon ball z", 11.20, 2));
        mangas.add(new Manga(2L,"Berserl", 2.99, 0));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }
    }
}
