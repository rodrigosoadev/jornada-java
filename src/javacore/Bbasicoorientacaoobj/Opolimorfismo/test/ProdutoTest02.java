package javacore.Bbasicoorientacaoobj.Opolimorfismo.test;

import javacore.Bbasicoorientacaoobj.Opolimorfismo.dominio.Computador;
import javacore.Bbasicoorientacaoobj.Opolimorfismo.dominio.Produto;
import javacore.Bbasicoorientacaoobj.Opolimorfismo.dominio.Tomate;

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
