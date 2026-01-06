package src.javacore.Bbasicoorientacaoobj.Lclasseabstratas.test;

import src.javacore.Bbasicoorientacaoobj.Lclasseabstratas.dominio.Gerente;
import src.javacore.Bbasicoorientacaoobj.Lclasseabstratas.dominio.Vendedor;

public class FuncionarioTest {
    public static void main(String[] args) {
        Vendedor v = new Vendedor("Rodrigo", "23232-1", 1889);
        Gerente g = new Gerente("Gabriel", "54387-1", 3000);
        v.calculaSalario();
        g.calculaSalario();
        System.out.println(v);
        System.out.println("-----------------");
        System.out.println(g);

    }
}
