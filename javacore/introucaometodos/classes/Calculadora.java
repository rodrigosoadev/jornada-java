package javacore.introucaometodos.classes;

public class Calculadora {
    //void é retorno
    public void somaDoisNumeros() {
        System.out.println(5+5);
    }

    public void subtraiDoisNumeros() {
        System.out.println(10-1);
    }

    // dentro de () é o parametro, quando eu chamo no main e defino o valor de num1 e num2 é Argumento
    public void multiplicaDoisNumeros(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double num1, double num2) {
        if (num2 != 0){
            return num1 / num2;
        }
        return 0;
        
    }

    public void imprimeDoisNumerosDivididos (double num1, double num2) {
        if (num2 != 0) {
            System.out.println(num1/num2);
        }else{
            System.out.println("Não é possível dividir por 0");
        }
        
    }
}
