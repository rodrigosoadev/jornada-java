package Condicional.switchcase;

import java.util.Scanner;

public class TipoDeConta {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o número correspondente ao seu tipo de conta");
        System.out.println("1 - Poupança");
        System.out.println("2 - Corrente");
        System.out.println("3 - Investimento");

        int conta = teclado.nextInt();

        switch (conta) {
            case 1:
                System.out.println("Porcentagem de juros: 0.05%");
                break;
            case 2:
                System.out.println("Porcentagem de juros: 0.02%");
                break;
            case 3:
                System.out.println("Porcentagem de juros: 0.1%");
                break;
            default:
                System.out.println("Opção inválida. Digite novamente.");
        }
    }
}
