package javacore.Cintermediario.excecoes.exception.test;

import java.io.FileNotFoundException;

import javacore.Cintermediario.excecoes.exception.dominio.Funcionario;
import javacore.Cintermediario.excecoes.exception.dominio.LoginInvalidoException;
import javacore.Cintermediario.excecoes.exception.dominio.Pessoa;

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
