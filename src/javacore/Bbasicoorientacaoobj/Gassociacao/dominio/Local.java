package javacore.Bbasicoorientacaoobj.Gassociacao.dominio;

public class Local {
    private Seminario seminario;
    private String rua;
    private String bairro;


    public Local(String rua, String bairro) {
        this.rua = rua;
        this.bairro = bairro;
    }

    public Local() {
    }

    public void printLocal() {
        System.out.println("---------------Relatório de local---------------");
        System.out.println(this.rua);
        System.out.println(this.bairro);
    }

    public String getRua() {
        return rua;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }

    

}
// Este arquivo demonstra associação entre Local e Seminario com getters e setters.
