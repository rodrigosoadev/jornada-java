package javacore.interfaces.dominio;

public interface DataLoader {
    public abstract void load();

    //default é um método com implementação dentro da interface (é opcional sobrescrever ele na classe que implementa a interface)
    default void checkPermission(){
        System.out.println("Fazendo checagem de permissões");
    }
}
