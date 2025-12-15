package javacore.Bbasicoorientacaoobj.introducaometodos.dominio;
        
public class Professor {
    public String nome;
    public String matricula;
    public String  rg;
    public String cpf;

    public void imprime(){
        System.out.println("-----------------");
        System.out.println(this.cpf);
        System.out.println(this.matricula);
        System.out.println(this.rg);
        System.out.println(this.nome);
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getRg() {
        return rg;
    }

    

    

}
