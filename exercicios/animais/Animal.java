package exercicios.animais;

public abstract class Animal {
    private String nome;
    private double comprimento;
    private int numPatas;
    private String cor;
    private String ambiente;
    private double velocidade;
    

    public Animal(String nome, double comprimento, int numPatas, String cor, String ambiente, double velocidade, String caracteristica) {
        this.nome = nome;
        this.comprimento = comprimento;
        this.numPatas = numPatas;
        this.cor = cor;
        this.ambiente = ambiente;
        this.velocidade = velocidade;
    }

    
    public void print() {
        System.out.println("Animal: " + this.nome);
        System.out.println("Comprimento: " + this.comprimento);
        System.out.println("Número de patas: " + this.numPatas);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ambiente: " + this.ambiente);
        System.out.println("Velocidade em m/s: " + this.velocidade);
        
    }

    

}
