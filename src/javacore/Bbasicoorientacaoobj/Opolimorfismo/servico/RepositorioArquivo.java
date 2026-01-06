package src.javacore.Bbasicoorientacaoobj.Opolimorfismo.servico;

import src.javacore.Bbasicoorientacaoobj.Opolimorfismo.repositorio.Repositorio;

public class RepositorioArquivo  implements Repositorio{

    @Override
    public void salvar() {
        System.out.println("Salvando em um arquivo");
        
    }
    
}
