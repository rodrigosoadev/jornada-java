package javacore.Cintermediario.Kcolecoes.test;

import java.util.PriorityQueue;
import java.util.Queue;

import javacore.Cintermediario.Kcolecoes.dominio.Consumidor;
import javacore.Cintermediario.Kcolecoes.dominio.Manga;


public class QueueTest02 {
    public static void main(String[] args) {
        Queue<Manga> mangas = new PriorityQueue<>(new MangaPrecoComparator());

        mangas.add(new Manga(5L, "Hellsing Ultimate", 19.9, 0));
        mangas.add(new Manga(1L,"Pokemon", 9.5, 5));
        mangas.add(new Manga(4L,"Attk", 3.2, 0));
        mangas.add(new Manga(3L,"Dragon ball z", 11.20, 2));
        mangas.add(new Manga(2L,"Berserl", 2.99, 0));
        mangas.add(new Manga(10L,"Aaragon", 2.99, 0));


        while (!mangas.isEmpty()) {
            System.out.println(mangas.poll());
        }

    }
}
