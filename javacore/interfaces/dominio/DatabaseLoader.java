package javacore.interfaces.dominio;
//como o dataloadoer é uma interface, então é implementação, não extensão
public class DatabaseLoader implements DataLoader {

    @Override
    public void load() {
       System.out.println("Carregando dados do banco de dados");
    }
    
}
