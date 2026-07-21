package javacore.Cintermediario.Kcolecoes.test;

import java.util.Comparator;

import javacore.Cintermediario.Kcolecoes.dominio.Manga;

/**
 * MangaPrecoComparator
 */
public class MangaPrecoComparator implements Comparator<Manga> {

	@Override
	public int compare(Manga o1, Manga o2) {
		return Double.compare(o1.getPreco(), o2.getPreco());
	}

}
