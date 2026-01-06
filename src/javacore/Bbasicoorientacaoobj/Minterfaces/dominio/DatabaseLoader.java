package src.javacore.Bbasicoorientacaoobj.Minterfaces.dominio;
//como o dataloadoer é uma interface, então é implementação, não extensão

// Do mais restritivo até o mais liberal: private -> default -> protected -> public
public class DatabaseLoader implements DataLoader, DataRemover {

    @Override
    public void load() {
       System.out.println("Carregando dados do banco de dados");
    }

    @Override
    public void remove() {
        System.out.println("Removendo do banco de dados");
        
    }

    @Override
    public void checkPermission() {
        System.out.println("Chegando permissões no banco de dados");
    }
    
    
    public static void retrieveMaxDataSize() {
        System.out.println("Dentro do retrieveMaxDataSize na interface - Databaseloader");
    }

    
    
}
