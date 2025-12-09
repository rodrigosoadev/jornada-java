package javacore.heranca.test;

import javacore.heranca.classes.Endereco;
import javacore.heranca.classes.Funcionario;
import javacore.heranca.classes.Pessoa;

public class HerancaTest {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Rodrigo");
        // p.setRg("000000");
        p.setCpf("123456");
        Endereco end = new Endereco();
        end.setBairro("Jardins");
        end.setRua("Rua 23");
        p.setEndereco(end);

        p.print();

        System.out.println("-------------");
        Funcionario f = new Funcionario("Soares");

        f.setCpf("7654321");
        f.setSalario(1231);
        f.setEndereco(end);

        f.print();

    }
}
