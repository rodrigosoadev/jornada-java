package Condicional.ifelse;
//receba um número inteiro do usuário e imprima o dia da semana correspondente
//sendo 1 segunda

import java.util.Scanner;

public class DiasDaSemana {
    public static void main(String[] args) {
       
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digita do 1 ao 7  para saber o dia da semana");
        int dia = teclado.nextInt();
        

        if (dia == 1){
            System.out.println("Hoje é Segunda-feira");
        }else if (dia == 2){
            System.out.println("Hoje é Terça-feira");
        }else if (dia == 3){
            System.out.println("Hoje é Quarta-feira");
        }else if (dia == 4 ){
            System.out.println("Hoje é Quinta-Feira");
        }else if (dia == 5){
            System.out.println("Hoje é Sexta-feira");
        }else if (dia == 6){
            System.out.println("Hoje é Sabadão");
        }else if (dia == 7){
            System.out.println("Hoje é Domingão");
        }else {
            System.out.println("Dia inválido");
        }
}}
