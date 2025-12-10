package javacore.modificadorfinal.test;

import javacore.modificadorfinal.dominio.Carro;

public class CarroTest{
    public static void main(String[] args) {
        Carro c = new Carro();
        //c.setNome("bmw");
       // c.setNome("320i");
        System.out.println(c.getComprador());
        c.getComprador().setNome("Kuririn");
        System.out.println(c.getComprador());
        
    }
}
