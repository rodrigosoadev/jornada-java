package javacore.Cintermediario.Aexcecoes.exception.dominio;

import java.io.FileNotFoundException;

public class Funcionario extends Pessoa {
    public void salvar()throws LoginInvalidoException, FileNotFoundException{
        System.out.println("Salvando funcionário");
}
// Este arquivo demonstra a sobrescrita de método com exceções, onde a filha pode lançar as mesmas exceções.
}
