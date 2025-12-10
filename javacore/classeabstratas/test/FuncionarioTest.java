package javacore.classeabstratas.test;

import javacore.classeabstratas.dominio.Desenvolvedor;
import javacore.classeabstratas.dominio.Funcionario;
import javacore.classeabstratas.dominio.Gerente;

public  class FuncionarioTest {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Gabriel", 5000);
        Desenvolvedor dev = new Desenvolvedor("Ricardo", 2500);
        System.out.println(gerente);
        System.out.println(dev);
    }
}
