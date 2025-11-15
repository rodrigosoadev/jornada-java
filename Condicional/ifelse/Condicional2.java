package Condicional.ifelse;

public class Condicional2 {
    public static void main(String[] args) {
        float salario = 1899.99f;
        float resultado = 0f;


        if (salario > 4500) {
            resultado = salario * 0.3f;
            System.out.println("A porcentagem é 30% e o resultado é "+ resultado);
        }else {
            resultado = salario * 0.1f;
            System.out.println("A porcentagem é 10% e o resultado é "+resultado);
    }
}
}
