package javacore.Cintermediario.Kcolecoes.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.List;

import javacore.Cintermediario.Kcolecoes.dominio.Manga;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new LinkedList<>();
        mangas.add(new Manga(5L, "Hellsing Ultimate", 19.9, 0));
        mangas.add(new Manga(1L,"Pokemon", 9.5, 5));
        mangas.add(new Manga(4L,"Attk", 3.2, 0));
        mangas.add(new Manga(3L,"Dragon ball z", 11.20, 2));
        mangas.add(new Manga(2L,"Berserl", 2.99, 0));

       /* Iterator<Manga> mangarIterator = mangas.iterator();
       while (mangarIterator.hasNext()) {
            Manga manga = mangarIterator.next();
            if(manga.getQuantidade() == 0) {
                mangarIterator.remove();
            }
       } */

       
       mangas.removeIf(manga -> manga.getQuantidade() == 0); // forma simplificada do código acima 
       System.out.println(mangas);
    }
}
