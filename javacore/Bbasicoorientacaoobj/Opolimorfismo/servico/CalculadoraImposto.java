package javacore.Bbasicoorientacaoobj.Opolimorfismo.servico;

import javacore.Bbasicoorientacaoobj.Opolimorfismo.dominio.Computador;
import javacore.Bbasicoorientacaoobj.Opolimorfismo.dominio.Produto;
import javacore.Bbasicoorientacaoobj.Opolimorfismo.dominio.Tomate;

public class CalculadoraImposto {
    public static void caulcularImposto(Produto produto) {
        System.out.println("Relatório de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
        if (produto instanceof Tomate) {
            System.out.println(((Tomate) produto).getDataValidade());
        }

    }
}
