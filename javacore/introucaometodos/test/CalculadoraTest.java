package javacore.introucaometodos.test;

import javacore.introucaometodos.classes.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        
        calc.somaDoisNumeros();
        System.out.println("Continuando a exec");
        calc.subtraiDoisNumeros();
        
    }
}
