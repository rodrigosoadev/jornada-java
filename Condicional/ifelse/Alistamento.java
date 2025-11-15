package Condicional.ifelse;

import java.util.Scanner;

public class Alistamento {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu sexo");
        char sexo = 'M';
        int idade = 18;

        if ((sexo == 'M' || sexo == 'F') && idade < 18) {
            System.out.println("alistamento não permitido");
        }

        /*if (sexo != "m" || sexo != "f" || sexo != "M" || sexo != "F"){
            System.out.println("Digite a opção valida M ou F");
        }else {
            System.out.println("Sexo definido: "+sexo + ", agora digite sua idade");
        }
        byte idade = teclado.nextByte();

        if (sexo == "M" || sexo =="m"){
            if (idade >= 18){
                System.out.println( " Seu alistamento foi concluído com sucesso ");
            }else if (idade <= 18){
                System.out.println("Alistamento não permitido");
            }
        }else if(sexo == "F" || sexo == "f" && idade >=18){
            System.out.println("Você deseja se alistar SIM ou NAO");
            String resposta = teclado.next();
            
            if (resposta == "SIM" || resposta == "sim"){
                System.out.println("Alistamento concluído");
            }else{
                System.out.println("Alistamento não realizado");
            }
        }if (sexo == "F" || sexo == "f" && idade <=18) {
            System.out.println("Alistamento não permitido");
        }


    }/* */
}}