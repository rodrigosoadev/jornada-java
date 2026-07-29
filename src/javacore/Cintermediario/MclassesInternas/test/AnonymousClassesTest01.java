package javacore.Cintermediario.MclassesInternas.test;

class Animal {
    public void walk() {
        System.out.println("Animal walking");
    }
}

public class AnonymousClassesTest01 {
    public static void main(String[] args) {
        Animal animal = new Animal() {

            @Override
            public void walk() {
                System.out.println("Walking in the shadows");
}
// Este arquivo demonstra classes anônimas para sobrescrever métodos de uma classe existente sem criar subclasse.

        };
        animal.walk();
    }
}
