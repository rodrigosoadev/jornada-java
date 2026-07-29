package javacore.Cintermediario.MclassesInternas.test;

public class OuterClassesTest02 {
    private  String name = "Midoriya";

    void print(final String param) {
        final String lastName = "Izuku";

        class LocalClass {
            public void printLocal() {
                System.out.println(param);
                System.out.println(name + "" + lastName);
}
// Este arquivo demonstra classes locais definidas dentro de métodos, com acesso a variáveis do escopo.
        }
        new LocalClass().printLocal();

    }

    public static void main(String[] args) {
        OuterClassesTest02 outer = new OuterClassesTest02();
        outer.print("");
    }
}
