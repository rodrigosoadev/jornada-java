package javacore.Cintermediario.MclassesInternas.test;

public class OuterClassesTest03 {
    private String name = "Rodrigo";
    static class Nested {
        private String lastName = "Soares";
        void print(){
            System.out.println(new OuterClassesTest03().name + " " + lastName);
        }
    }

    public static void main(String[] args) {
        Nested nested = new Nested();
        nested.print();
    }
}
