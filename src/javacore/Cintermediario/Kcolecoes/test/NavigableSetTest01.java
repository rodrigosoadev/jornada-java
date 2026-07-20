package javacore.Cintermediario.Kcolecoes.test;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

import javacore.Cintermediario.Kcolecoes.dominio.Manga;
import javacore.Cintermediario.Kcolecoes.dominio.Smartphone;


class SmartphoneMarcaComparator implements Comparator<Smartphone> {

    @Override
    public int compare(Smartphone o1, Smartphone o2) {
    
        return o1.getMarca().compareTo(o2.getMarca());
    }

}

class MangaPrecoComparator implements Comparator<Manga>{

    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }

    

}
public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneMarcaComparator());
        Smartphone smartphone = new Smartphone("123", "Nokia");
        set.add(smartphone);

        NavigableSet<Manga> mangas = new TreeSet<>(); // não vai rodar devido a classe foi compilada para uma versão mais nova do Java do que a JVM que está rodando.
        mangas.add(new Manga(5L, "Hellsing Ultimate", 19.9, 0));
        mangas.add(new Manga(1L,"Pokemon", 9.5, 5));
        mangas.add(new Manga(4L,"Attk", 3.2, 0));
        mangas.add(new Manga(3L,"Dragon ball z", 11.20, 2));
        mangas.add(new Manga(2L,"Berserl", 2.99, 0));
        mangas.add(new Manga(10L,"Aaragon", 2.99, 0));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Manga yuyu = new Manga(21L,"Yu yu Hakusho", 3.2, 5);

        //metodos para comparação
        //lower <
        //floor <=
        //higher >
        //ceiling >=
        System.out.println("-----------");
        System.out.println(mangas.lower(yuyu));
        System.out.println(mangas.floor(yuyu));
        System.out.println(mangas.higher(yuyu));
        System.out.println(mangas.ceiling(yuyu));

        System.out.println(mangas.size());
        System.out.println(mangas.pollLast());
        System.out.println(mangas.size());
    }
}
