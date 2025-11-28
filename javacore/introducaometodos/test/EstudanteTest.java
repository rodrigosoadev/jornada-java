package javacore.introducaometodos.test;

import java.util.Scanner;

import javacore.introducaometodos.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        
        Estudante estudante = new Estudante();
       // Scanner scanner = new Scanner(System.in);
       // String nome = scanner.next();

        estudante.setNome("Rodrigo");
        estudante.setIdade(-1);
        estudante.setNotas(new double[] {8,8,10});
        
        estudante.dadosEstudante();
        estudante.imprimirMedia();
        //System.out.println("estudante: "+estudante.getNome());
        System.out.println("aprovado? "+ estudante.isAprovado());
        estudante.isAprovado();
        
        

    
    }
}
