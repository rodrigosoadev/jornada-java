package Condicional.ifelse;

import java.util.Scanner;

public class CadastroDeLogin {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Por favor, digite um nome para login");
        String nome = teclado.next();

        if (nome.equalsIgnoreCase("")|| nome.equalsIgnoreCase("admin") || nome.equalsIgnoreCase("administrador") ) {
            System.out.println("Você não pode utilizar o nome administrador ou deixar esse campo vazio, por favor, insira novamente");
        }else{
            System.out.println("Usuario cadastrado com sucesso");
        }
    }
}
