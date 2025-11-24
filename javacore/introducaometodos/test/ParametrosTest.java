package javacore.introducaometodos.test;

import javacore.introducaometodos.classes.Calculadora;

public class ParametrosTest {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        int a = 10;
        int b = 20;
        calc.alteraDoisNumeros(a, b);
        System.out.println("Dentro do teste");
        System.out.println("num1: "+a);
        System.out.println("num2: "+b);
    }
}
