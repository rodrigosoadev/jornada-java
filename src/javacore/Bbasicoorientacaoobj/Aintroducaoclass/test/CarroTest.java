package javacore.Bbasicoorientacaoobj.Aintroducaoclass.test;

import javacore.Bbasicoorientacaoobj.Aintroducaoclass.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.placa = "RGH3F7J";
        carro.modelo = "Mustang";
        carro.velocidadeMaxima = 1000;

        System.out.println(carro.modelo);
    }
}
// Este arquivo demonstra instanciação de objeto e acesso a atributos públicos de Carro.
