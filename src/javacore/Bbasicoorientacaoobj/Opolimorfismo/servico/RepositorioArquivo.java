package javacore.Bbasicoorientacaoobj.Opolimorfismo.servico;

import javacore.Bbasicoorientacaoobj.Opolimorfismo.repositorio.Repositorio;

public class RepositorioArquivo  implements Repositorio{

    @Override
    public void salvar() {
        System.out.println("Salvando em um arquivo");
        
    }
    
}
