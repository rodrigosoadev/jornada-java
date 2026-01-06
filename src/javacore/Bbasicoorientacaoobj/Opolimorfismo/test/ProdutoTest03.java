package src.javacore.Bbasicoorientacaoobj.Opolimorfismo.test;

import src.javacore.Bbasicoorientacaoobj.Opolimorfismo.dominio.Computador;
import src.javacore.Bbasicoorientacaoobj.Opolimorfismo.dominio.Produto;
import src.javacore.Bbasicoorientacaoobj.Opolimorfismo.dominio.Tomate;
import src.javacore.Bbasicoorientacaoobj.Opolimorfismo.servico.CalculadoraImposto;

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
