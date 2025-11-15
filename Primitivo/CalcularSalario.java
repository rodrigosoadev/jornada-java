package Primitivo;
//Crie uma classe que calcule uma determinada porcentagem de um salario.
// Criar uma classe
//Aceitar um valor de entrada para o salario
//definir o valor da porcentagem (perguntar quanto?) = 30%
//calcular porcentagem
public class CalcularSalario {
    public static void main(String[] args) {
        float salario = 2500.00f;
        float porcentagem = 30;
        float valorPorcentagem = (salario * porcentagem) / 100;
        System.out.println ("O valor da porcentagem de " + porcentagem + "% do salário de R$" + salario + " é R$" + valorPorcentagem);
    }
}
