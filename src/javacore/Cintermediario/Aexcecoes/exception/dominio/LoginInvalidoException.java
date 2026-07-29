package javacore.Cintermediario.Aexcecoes.exception.dominio;

public class LoginInvalidoException extends Exception {
    public LoginInvalidoException() {
        super("Login inválido");
    }

    public LoginInvalidoException(String message) {
        super(message);
    }
}
// Este arquivo demonstra a criação de uma exceção customizada estendendo a classe Exception.
