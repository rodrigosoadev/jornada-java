package javacore.Cintermediario.Aexcecoes.exception.test;

import java.io.FileNotFoundException;

import javacore.Cintermediario.Aexcecoes.exception.dominio.Funcionario;
import javacore.Cintermediario.Aexcecoes.exception.dominio.LoginInvalidoException;
import javacore.Cintermediario.Aexcecoes.exception.dominio.Pessoa;

public class SobreescritaComExceptionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();
        
        try {
            funcionario.salvar();
        } catch (LoginInvalidoException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
