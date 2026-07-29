package javacore.Bbasicoorientacaoobj.Minterfaces.dominio;

public class FileLoader implements DataLoader, DataRemover {

    @Override
    public void load() {
        System.out.println("Carregando dados de um arquivo");

    }

    @Override
    public void remove() {
        System.out.println("Removendo dados de um arquivo");

    }

    @Override
    public void checkPermission() {
        System.out.println("Chegando permissões no arquivo");
    }
    
}
// Este arquivo demonstra implementação das interfaces DataLoader e DataRemover.
