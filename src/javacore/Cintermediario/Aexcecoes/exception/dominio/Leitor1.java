package javacore.Cintermediario.Aexcecoes.exception.dominio;

import java.io.Closeable;
import java.io.IOException;

public class Leitor1 implements Closeable{

    @Override
    public void close() throws IOException {
        System.out.println("Fechando leitor 1");
        
}
// Este arquivo demonstra um recurso que implementa Closeable para ser usado com try-with-resources.
    
}
