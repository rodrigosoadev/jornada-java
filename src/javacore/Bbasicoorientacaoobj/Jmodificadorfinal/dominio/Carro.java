package src.javacore.Bbasicoorientacaoobj.Jmodificadorfinal.dominio;

public class Carro {
    private static final double VELOCIDADE_FINAL = 250;
    private final Comprador comprador = new Comprador();
    private String nome;
    private String marca;

    //Final significa que é um metodo perfeito, n pode ser alterado
    @Override
    public String toString() {
        return "Carro nome: " + nome + ", marca: " + marca + "";
    }

    public final void imprime(){
        System.out.println("Imprimindo um carro");
    }
    public Comprador getComprador() {
        return comprador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public static double getVelocidadeFinal() {
        return VELOCIDADE_FINAL;
    }

    

}
