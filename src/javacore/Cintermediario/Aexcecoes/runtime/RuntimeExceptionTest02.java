package javacore.Cintermediario.Aexcecoes.runtime;

//sempre usar as exceções mais especificas possíveis, como por exemplo  IllegalStateException
//Independente do que for, implemente o tratamento da exceção!!!
public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        System.out.println(divisao(1, 0));
    }

    /**
     * 
     * @param a
     * @param b - Não pode ser 0
     * @return
     * @throws IllegalStateException caso b seja zero
     */

    private static int divisao(int a, int b) {
        if (b == 0) {
            throw new IllegalStateException("Argumento inválido, não pode ser 0");
        }
        // try {
        // return a / b;

        // } catch (RuntimeException e) {
        // e.printStackTrace();
        // }
        return a / b;
    }
}
