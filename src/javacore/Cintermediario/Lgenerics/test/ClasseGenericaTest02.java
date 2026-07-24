package javacore.Cintermediario.Lgenerics.test;

import javacore.Cintermediario.Lgenerics.dominio.Barco;
import javacore.Cintermediario.Lgenerics.dominio.Carro;
import javacore.Cintermediario.Lgenerics.service.BarcoRentavelService;
import javacore.Cintermediario.Lgenerics.service.CarroRentavelService;

public class ClasseGenericaTest02 {
    public static void main(String[] args) {
        BarcoRentavelService barcoRentavelService = new BarcoRentavelService();
        Barco barco = barcoRentavelService.buscarBarcoDisponivel();
        System.out.println("Usando o barco por um mês...");
        barcoRentavelService.retornarBarcoAlugado(barco);
    }
}
