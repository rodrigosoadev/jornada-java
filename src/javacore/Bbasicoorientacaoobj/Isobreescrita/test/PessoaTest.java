package src.javacore.Bbasicoorientacaoobj.Isobreescrita.test;

import src.javacore.Bbasicoorientacaoobj.Isobreescrita.dominio.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        Pessoa p2 = new Pessoa();

        p.setNome("Rodrigo Soares");
        p.setIdade(24);
        System.out.println(p);
        System.out.println("---------------");
        p2.setNome("Gabriel caleb");
        p2.setIdade(14);
        System.out.println(p2);
        

    }
}
