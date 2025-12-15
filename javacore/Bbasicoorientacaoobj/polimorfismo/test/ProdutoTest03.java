package javacore.Bbasicoorientacaoobj.polimorfismo.test;

import javacore.Bbasicoorientacaoobj.polimorfismo.dominio.Computador;
import javacore.Bbasicoorientacaoobj.polimorfismo.dominio.Produto;
import javacore.Bbasicoorientacaoobj.polimorfismo.dominio.Tomate;
import javacore.Bbasicoorientacaoobj.polimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000);

        Tomate tomate = new Tomate("Americano", 20);
        tomate.setDataValidade("16/12/2025");
        CalculadoraImposto.caulcularImposto(tomate);
        System.out.println("--------------------");
        CalculadoraImposto.caulcularImposto(produto);

    }
}
