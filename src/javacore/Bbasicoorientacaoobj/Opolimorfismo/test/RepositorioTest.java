package src.javacore.Bbasicoorientacaoobj.Opolimorfismo.test;

import java.util.ArrayList;
import java.util.List;

import src.javacore.Bbasicoorientacaoobj.Opolimorfismo.repositorio.Repositorio;
import src.javacore.Bbasicoorientacaoobj.Opolimorfismo.servico.RepositorioBancadoDeDados;

public class RepositorioTest {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioBancadoDeDados();
        repositorio.salvar();
        
    }
}
