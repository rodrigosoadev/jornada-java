package javacore.Cintermediario.Aexcecoes.exception.test;

import java.util.Scanner;

import javacore.Cintermediario.Aexcecoes.exception.dominio.LoginInvalidoException;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }

    private static void logar() throws LoginInvalidoException {
        Scanner teclado = new Scanner(System.in);
        String usenameDB = "Rodrigo";
        String senhaDB = "ssj";
        System.out.println("Usuário");
        String usernameDigitado = teclado.nextLine();
        System.out.println("Senha");
        String senhaDigitada = teclado.nextLine();
        if (!usenameDB.equals(usernameDigitado) || !senhaDB.equals(senhaDigitada)) {
            throw new LoginInvalidoException("Usuário ou senha inválido");
        }

        System.out.println("Usuário logado com sucesso");
    }
}
// Este arquivo demonstra o uso de uma exceção customizada (LoginInvalidoException) para validar login.
