package javacore.introducaometodos.test;

import javacore.introducaometodos.classes.Professor;

public class ProfessorTeste {
    public static void main(String[] args) {
        Professor prof = new Professor();
        prof.cpf = "111.444.111.76";
        prof.matricula = "444555";
        prof.rg = "111.545.4154";
        prof.nome = "Rodrigol";
        

        Professor prof2 = new Professor();
        prof2.cpf = "111.222.333.20";
        prof2.matricula = "42223";
        prof2.rg = "111.545.4154";
        prof2.nome = "Soares";


        prof.imprime(prof);
        prof.imprime(prof2);

        
    }
}
