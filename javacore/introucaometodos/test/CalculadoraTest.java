package javacore.introucaometodos.test;

import javacore.introucaometodos.classes.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        
        calc.somaDoisNumeros();
        calc.subtraiDoisNumeros();
        calc.multiplicaDoisNumeros(2, 4);
        //System.out.println(calc.divideDoisNumeros(8, 2));
        double resultado = calc.divideDoisNumeros(20, 0);
        System.out.println(resultado);
        System.out.println("Continuando a exec");
        calc.imprimeDoisNumerosDivididos(20, 2);
        
        
    }
}
