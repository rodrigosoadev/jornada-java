package javacore.introducaometodos.classes;
        
public class Professor {
    public String nome;
    public String matricula;
    public String rg;
    public String cpf;

    public void imprime(Professor prof){
        System.out.println("-----------------");
        System.out.println(prof.cpf);
        System.out.println(prof.matricula);
        System.out.println(prof.cpf);
        System.out.println(prof.nome);
        
    }

}
