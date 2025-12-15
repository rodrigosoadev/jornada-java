package javacore.Bbasicoorientacaoobj.polimorfismo.servico;

import javacore.Bbasicoorientacaoobj.polimorfismo.repositorio.Repositorio;

public class RepositorioArquivo  implements Repositorio{

    @Override
    public void salvar() {
        System.out.println("Salvando em um arquivo");
        
    }
    
}
