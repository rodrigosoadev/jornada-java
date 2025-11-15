package Condicional.switchcase;

public class DiasDaSemana2 {
    public static void main(String[] args) {
        int dia = 8;
        
        switch (dia) {
            case 1:
                System.out.println("segunda");
                break;
            case 2:
                System.out.println("terca");
                break;
            case 3:
                System.out.println("quarta");
                break;
            case 4:
                System.out.println("quinta");
                break;
            case 5:
                System.out.println("sexta");
                break;
            case 6:
                System.out.println("sabadão");
                break;
            case 7:
                System.out.println("domingão");
                break;
            default:
                System.out.println("ERRO - Os números devem ser de 1 ao 7");
                break;
                
        }
        System.out.println("Fim do programa");
        
        }
    }

