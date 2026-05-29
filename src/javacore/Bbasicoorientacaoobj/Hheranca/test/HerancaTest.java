package javacore.Bbasicoorientacaoobj.Hheranca.test;

import javacore.Bbasicoorientacaoobj.Hheranca.dominio.Endereco;
import javacore.Bbasicoorientacaoobj.Hheranca.dominio.Funcionario;
import javacore.Bbasicoorientacaoobj.Hheranca.dominio.Pessoa;

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
