package javacore.Cintermediario.Lgenerics.test;

import java.util.ArrayList;
import java.util.List;

import javacore.Cintermediario.Lgenerics.dominio.Barco;
import javacore.Cintermediario.Lgenerics.dominio.Carro;
import javacore.Cintermediario.Lgenerics.service.BarcoRentavelService;
import javacore.Cintermediario.Lgenerics.service.CarroRentavelService;
import javacore.Cintermediario.Lgenerics.service.RentalService;

public class ClasseGenericaTest03 {
    public static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Fusca")));

        List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Canoa")));

        RentalService<Carro> rentalServiceCarro = new RentalService<>(carrosDisponiveis);

        Carro carro = rentalServiceCarro.buscarObjetoDisponivel();
        System.out.println("Usando o carro por um mês...");
        rentalServiceCarro.retornarObjetoAlugado(carro);

        System.out.println("---------------------");
        RentalService<Barco> rentalServiceBarco = new RentalService<>(barcosDisponiveis);

        Barco barco = rentalServiceBarco.buscarObjetoDisponivel();
        System.out.println("Usando o barco por um mês...");
        rentalServiceBarco.retornarObjetoAlugado(barco);

    }
}
// Este arquivo demonstra classe genérica RentalService aplicada a Carro e Barco.
