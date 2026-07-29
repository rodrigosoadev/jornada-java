package javacore.Bbasicoorientacaoobj.Opolimorfismo.servico;

import javacore.Bbasicoorientacaoobj.Opolimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio{
    @Override
    public void salvar() {
        System.out.println("Salvando em memória");
        
    }
}
// Este arquivo demonstra polimorfismo com interface Repositorio salvando em memória.
