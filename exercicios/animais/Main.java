package exercicios.animais;

public class Main {
    public static void main(String[] args) {
        Peixe peixe = new Peixe("tubara", 300, 0, "Cinza", "Mar", 1.5, "Barbatanas e caudas");
        Camelo mamifero = new Camelo("Camelo", 150, 4, "Amarelo", "Terra", 2.0, null);
        Urso urso = new Urso("Urso-do-Canadá", 180, 4, "Vermelho", "Terra", 0.5, null);

        peixe.print();
        System.out.println("-----------");
        mamifero.print();
        System.out.println("-----------");
        urso.print();

    }
}