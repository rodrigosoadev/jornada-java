package javacore.Cintermediario.Kcolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        List<String> nomes2 = new ArrayList<>();
        nomes.add("Rodrigo");
        nomes.add("DevDojo");
        nomes2.add("Soares");
        nomes2.add("Camara");
        
        

        nomes.addAll(nomes2);

        for(String nome : nomes){
            System.out.println(nome);
        }
        
        System.out.println("---------");

        int size = nomes.size();
        for(int i = 0; i < size; i++){
            nomes.add("Soares");
            System.out.println(nomes.get(i));
        }
        
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
       

    }
}
