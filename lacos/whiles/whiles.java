package lacos.whiles;

import java.util.Scanner;

public class whiles {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor desejado");
        int i = 0;
        int valorFinal = teclado.nextInt();

        while(i <= valorFinal){
            if (i % 2 != 0){
                System.out.println("i = "+i);
            }
            i = i + 1;
        }
    }
}
