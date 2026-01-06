package src.javacore.Bbasicoorientacaoobj.Aintroducaoclass.test;

import src.javacore.Bbasicoorientacaoobj.Aintroducaoclass.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.placa = "RGH3F7J";
        carro.modelo = "Mustang";
        carro.velocidadeMaxima = 1000;

        System.out.println(carro.modelo);
    }
}
