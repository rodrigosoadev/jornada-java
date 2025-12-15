package javacore.Bbasicoorientacaoobj.polimorfismo.test;

import javacore.Bbasicoorientacaoobj.polimorfismo.dominio.Computador;
import javacore.Bbasicoorientacaoobj.polimorfismo.dominio.Produto;
import javacore.Bbasicoorientacaoobj.polimorfismo.dominio.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println("O imposto é: "+produto.calcularImposto());
        System.out.println("----------------");
        Produto produto2 = new Tomate("Tomatezão", 1);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println("O imposto é: "+produto.calcularImposto());
        
    }
       
}
