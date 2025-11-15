package arrays;

public class introducaoArrays {
    public static void main(String[] args) {
        double[] notas = new double[5];
        notas[0] = 7;
        notas[1] = 2;
        notas[2] = 9;
        notas[3] = 4;
        notas[4] = 9;
        System.out.println("Tamanho do array: "+notas.length);
        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
        }

        
    }
}
