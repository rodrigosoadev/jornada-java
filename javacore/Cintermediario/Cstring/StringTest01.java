package javacore.Cintermediario.Cstring;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Rodrigo"; // string constant pool 
        String nome2 = "Rodrigo";
        nome = nome.concat(" Soares");
        System.out.println(nome);
        System.out.println(nome == nome2);
        
        String nome3 = new String("Rodrigo"); // 1 variavek de ref, 2 objeto do tripo string, 3 uma string no pool de string
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());
    }
}
