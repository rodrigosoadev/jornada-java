package javacore.Aintroducao.variaveis;
import java.util.Scanner;

public class RecebendoDadosDoTeclado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = teclado.next();
        System.out.println("Olá " + nome);
    }
}
// Este arquivo demonstra a leitura de dados do teclado usando a classe Scanner.
