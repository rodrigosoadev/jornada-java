package src.javacore.Bbasicoorientacaoobj.Jmodificadorfinal.test;

import src.javacore.Bbasicoorientacaoobj.Jmodificadorfinal.dominio.Carro;

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
