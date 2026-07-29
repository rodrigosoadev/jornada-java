package javacore.Cintermediario.Aexcecoes.error.test;

public class StackOverFlowTest01 {
    public static void main(String[] args) {
        
    }

    public static void recursividade() {
        recursividade();
    }
}
// Este arquivo demonstra o erro StackOverflowError causado por recursão infinita sem condição de parada.
