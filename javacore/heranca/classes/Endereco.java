package javacore.heranca.classes;

public class Endereco {
    private String rua;
    private String bairro;


    public void print() {
        System.out.println("Rua: "+this.rua);
        Pessoa p = new Pessoa();
        p.nome = "barata";
    }

    public String getRua() {
        return rua;
    }
    public String getBairro() {
        return bairro;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    
}
