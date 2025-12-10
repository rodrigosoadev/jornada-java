package javacore.modificadorestatico.dominio;

public class Carro {
    // velocidade limite deve ser 240km/h
    private String nome;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 240;

    
    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
        
    }

    public void imprime(){
        System.out.println("-----------------");
        System.out.println("Nome da marca: "+this.nome);
        System.out.println("Velocidade maxima: "+this.velocidadeMaxima);
        System.out.println("Velocidade limite: "+velocidadeLimite);
    }

    public Carro() {

    }
    

    //modificado inicial + modificado com STATIC

    public static void setVelocidadeLimite(double velocidadeLimite){
        Carro.velocidadeLimite = velocidadeLimite;
    }

    public static double getVelocidadeLimite() {
        return velocidadeLimite;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    
    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    //modificador final




}
