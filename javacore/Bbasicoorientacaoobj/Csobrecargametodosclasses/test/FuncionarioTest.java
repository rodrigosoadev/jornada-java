package javacore.Bbasicoorientacaoobj.Csobrecargametodosclasses.test;

import javacore.Bbasicoorientacaoobj.Csobrecargametodosclasses.dominio.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Rodrigo Soares", "111.222.333.44", 1899, "4402892-2");
        //funcionario.setNome("Rodrigo Soares");
        //funcionario.setCpf("111.222.333.44");
        //funcionario.setSalario(1899);
        //funcionario.init("Rodrigo Soares", "111.222.333.44", 1899, "4402892-2");
        Funcionario funcionario2 = new Funcionario();
        funcionario.imprime();
        funcionario2.imprime();

    }
}
