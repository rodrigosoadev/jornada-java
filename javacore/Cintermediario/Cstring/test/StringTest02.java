package javacore.Cintermediario.Cstring.test;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = "  Rodrigo ";
        String numeros = "012345";
        System.out.println(nome.charAt(0)); // imprimi somente o indice indicado
        System.out.println(nome.length());
        System.out.println(nome.replace("R", "S")); // troca uma letra por outra
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());
        System.out.println(numeros.substring(3,numeros.length()));
        System.out.println(nome.trim()); // remove os espaços em branco
        
    }
}
