package javacore.introducaometodos.test;

import java.util.Scanner;

import javacore.introducaometodos.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        
        Estudante estudante = new Estudante();
       // Scanner scanner = new Scanner(System.in);
       // String nome = scanner.next();

        estudante.nome = "Rodrigo";
        estudante.idade = "24";
        estudante.nota1 = 7;
        estudante.nota2 = 8;
        estudante.nota3 = 9;
        
        
        estudante.dadosEstudante();
        estudante.imprimirMedia(5, 5, 3);


        

    
    }
}
