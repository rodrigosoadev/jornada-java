package javacore.sobrecargametodosclasses.test;

import javacore.sobrecargametodosclasses.classes.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        //funcionario.setNome("Rodrigo Soares");
        //funcionario.setCpf("111.222.333.44");
        //funcionario.setSalario(1899);
        funcionario.init("Rodrigo Soares", "111.222.333.44", 1899, "4402892-2");
        funcionario.imprime();

        

    }
}
