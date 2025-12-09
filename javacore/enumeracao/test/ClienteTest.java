package javacore.enumeracao.test;

import javacore.enumeracao.classes.Cliente;
import javacore.enumeracao.classes.TipoCliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Rodrigo", TipoCliente.PESSOA_FISICA, Cliente.TipoPagamento.APRAZO);

        System.out.println(cliente);
    }
}
