package javacore.Bbasicoorientacaoobj.polimorfismo.servico;

import javacore.Bbasicoorientacaoobj.polimorfismo.repositorio.Repositorio;

public class RepositorioBancadoDeDados implements Repositorio{
    @Override
    public void salvar() {
        System.out.println("Salvando no banco de dados");
        
    }
}
