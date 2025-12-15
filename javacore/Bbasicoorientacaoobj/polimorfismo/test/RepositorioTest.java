package javacore.Bbasicoorientacaoobj.polimorfismo.test;

import java.util.ArrayList;
import java.util.List;

import javacore.Bbasicoorientacaoobj.polimorfismo.repositorio.Repositorio;
import javacore.Bbasicoorientacaoobj.polimorfismo.servico.RepositorioBancadoDeDados;

public class RepositorioTest {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioBancadoDeDados();
        repositorio.salvar();
        
    }
}
