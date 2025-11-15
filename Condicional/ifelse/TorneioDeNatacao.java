package Condicional.ifelse;

import java.util.Scanner;

//
public class TorneioDeNatacao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Olá, digite o seu nome: ");
        String nome = teclado.next();
        System.out.println("Olá "+ nome +", agora digite sua idade:");
        byte idade = teclado.nextByte();
        

        if (idade < 11) {
            System.out.println("O participante " + nome + "participará da categoria infantil");
        } else if (idade >= 11 && idade <= 15) {
            System.out.println("O participante " + nome + " participará da categoria Juvenil");
        } else if (idade >= 16 && idade <= 19) {
            System.out.println("O participante " + nome + " participará da categoria Pré-adulto");
        } else if (idade >= 20) {
            System.out.println("O participante " + nome + " participará da categoria Adulto");
        }
    }
}
