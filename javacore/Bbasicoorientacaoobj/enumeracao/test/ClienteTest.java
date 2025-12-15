package javacore.Bbasicoorientacaoobj.enumeracao.test;

import javacore.Bbasicoorientacaoobj.enumeracao.dominio.Cliente;
import javacore.Bbasicoorientacaoobj.enumeracao.dominio.TipoCliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Rodrigo", TipoCliente.PESSOA_FISICA, Cliente.TipoPagamento.APRAZO);
        System.out.println(TipoCliente.PESSOA_FISICA.getId());
        System.out.println(cliente);
    }
}
