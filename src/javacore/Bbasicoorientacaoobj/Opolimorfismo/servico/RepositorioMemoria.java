package src.javacore.Bbasicoorientacaoobj.Opolimorfismo.servico;

import src.javacore.Bbasicoorientacaoobj.Opolimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio{
    @Override
    public void salvar() {
        System.out.println("Salvando em memória");
        
    }
}
