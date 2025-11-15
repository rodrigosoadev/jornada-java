package Primitivo;
public class CalcularPorcent {
    public static void main(String[] args) {
        float salario = 2500.000f;
        int porcentagem = 30;
        float valorPorcentagem = (salario * porcentagem) / 100;
        System.out.println ("O valor da porcentagem de " + porcentagem + "% do salário de R$" + salario + " é R$" + valorPorcentagem);

        int novaPorcentagem = 15;
        float novoValorPorcentagem = (salario * novaPorcentagem) / 100;
        System.out.println ("O valor da porcentagem de " + novaPorcentagem + "% do salário de R$" + salario + " é R$" + novoValorPorcentagem);

        int ultimaPorcentagem = 5;
        float ultimoValorPorcentagem = (salario * ultimaPorcentagem) / 100;
        System.out.println ("O valor da porcentagem de " + ultimaPorcentagem + "% do salário de R$" + salario + " é R$" + ultimoValorPorcentagem);
}
}
