package javacore.Cintermediario.Cstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Rodrigo Soares";
        nome.concat(" Brabo");
        nome.substring(0,3);
        System.out.println(nome);
        System.out.println(nome);
        StringBuilder sb = new StringBuilder("Rodrigo");
        sb.append(" Soares1").append(" Camara");
        sb.reverse();
        sb.reverse();
        sb.delete(0, 3);
        System.out.println(sb);
    }
}
