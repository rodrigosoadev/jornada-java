package javacore.Bbasicoorientacaoobj.interfaces.test;

import javacore.Bbasicoorientacaoobj.interfaces.dominio.DataLoader;
import javacore.Bbasicoorientacaoobj.interfaces.dominio.DatabaseLoader;
import javacore.Bbasicoorientacaoobj.interfaces.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        databaseLoader.load();
        fileLoader.load();

        databaseLoader.remove();
        fileLoader.remove();
        databaseLoader.checkPermission();
        fileLoader.checkPermission();
        DataLoader.retrieveMaxDataSize();
        DatabaseLoader.retrieveMaxDataSize();
        

    }
}
