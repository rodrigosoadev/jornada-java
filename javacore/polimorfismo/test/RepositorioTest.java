package javacore.polimorfismo.test;

import java.util.ArrayList;
import java.util.List;

import javacore.polimorfismo.repositorio.Repositorio;
import javacore.polimorfismo.servico.RepositorioBancadoDeDados;

public class RepositorioTest {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioBancadoDeDados();
        repositorio.salvar();
        
    }
}
