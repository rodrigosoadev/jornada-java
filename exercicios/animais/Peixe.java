package exercicios.animais;

public class Peixe extends Animal {
    private String caracteristica;

    public Peixe(String nome, double comprimento, int numPatas, String cor, String ambiente, double velocidade,
            String caracteristica) {
        super(nome, comprimento, numPatas, cor, ambiente, velocidade, caracteristica);
        this.caracteristica = caracteristica;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Caracteristica: "+caracteristica);
    }

    



    

}
