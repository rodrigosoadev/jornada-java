package javacore.Cintermediario.Lgenerics.test;

import javacore.Cintermediario.Lgenerics.dominio.Carro;
import javacore.Cintermediario.Lgenerics.service.CarroRentavelService;

public class ClasseGenericaTest01 {
    public static void main(String[] args) {
        CarroRentavelService carroRentavelService = new CarroRentavelService();
        Carro carro = carroRentavelService.buscarCarroDisponivel();
        System.out.println("Usando o carro por um mês...");
        carroRentavelService.retornarCarroAlugado(carro);
    }
}
