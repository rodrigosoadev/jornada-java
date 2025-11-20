package introducao.arrays;

public class introducaoArrays {
    public static void main(String[] args) {
        // array sempre obj
        double[] notas = new double[] {1,2,3,4};
        //notas[0] = 7;
        //notas[1] = 2;
       // notas[2] = 9;
        //notas[3] = 4;
        System.out.println("Tamanho do array: "+notas.length);
        for (double aux : notas) {
            System.out.println(aux);
        }
        
    }
    
}
