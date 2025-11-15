package lacos.whiles;

import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        final Scanner teclado = new Scanner(System.in);
        final String login = "rodrigo123";
        String senha = "oBrabo";

        boolean exibirTelaLogin = true;
        
        while (exibirTelaLogin) {
            System.out.println("Por favor, digite seu login: ");
            String loginDigitado = teclado.nextLine();
            System.out.println("Agora digite sua senha");
            String senhaDigitado = teclado.nextLine();

            if(login.equals(loginDigitado) && senha.equals(senhaDigitado)) {
                System.out.println("Acesso liberado");
                exibirTelaLogin = false;
                break;
            }
                System.out.println("Acesso negado");
            }
            System.out.println("programa encerrado");
        }
}

