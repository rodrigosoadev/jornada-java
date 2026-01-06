package src.javacore.Bbasicoorientacaoobj.Aintroducaoclass.test;
import src.javacore.Bbasicoorientacaoobj.Aintroducaoclass.dominio.Moto;

public class MotoTest {
    public static void main(String[] args) {
        Moto moto = new Moto();
        moto.modelo = "CB TWISTER 250";
        moto.placa = "RGH4FJ8";
        moto.velocidadeMaxima = 2000;

        System.out.println(moto.modelo);
        System.out.println(moto.placa);
        System.out.println(moto.velocidadeMaxima);
    }
}
