package javacore.Cintermediario.Kcolecoes.test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import javacore.Cintermediario.Kcolecoes.dominio.Consumidor;
import javacore.Cintermediario.Kcolecoes.dominio.Manga;

public class MapTest02 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Rodrigo");
        Consumidor consumidor2 = new Consumidor("DevDojo Academy");

        Manga manga1 = new Manga(5L, "Hellsing Ultimate", 19.9);
        Manga manga2 = new Manga(1L, "Pokemon", 9.5);
        Manga manga3 = new Manga(4L, "Attk", 3.2);
        Manga manga4 = new Manga(3L, "Dragon ball z", 11.20);
        Manga manga5 = new Manga(2L, "Berserl", 2.99);

        Map<Consumidor, Manga> consumidorManga = new LinkedHashMap<>();
        consumidorManga.put(consumidor1, manga1);
        consumidorManga.put(consumidor2, manga3);
        for (Map.Entry<Consumidor, Manga> entry : consumidorManga.entrySet()) {
            System.out.println(entry.getKey().getNome() + " - "+entry.getValue().getNome());
        }

    }
}
