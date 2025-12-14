package javacore.polimorfismo.test;

import javacore.polimorfismo.dominio.Computador;
import javacore.polimorfismo.dominio.Tomate;
import javacore.polimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador c = new Computador("NUC10I7", 9000);
        Tomate t = new Tomate("Tomate Italiano", 10);
        CalculadoraImposto.calcularImpostoComputador(c);
        System.out.println("-----------------------");
        CalculadoraImposto.calcularImpostoTomate(t);

    }
}
