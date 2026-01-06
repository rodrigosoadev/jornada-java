package src.javacore.Cintermediario.Aexcecoes.runtime;

//finally sempre vai ser executado. Muito usado para quando  precisa trabalhar com recursos sendo liberado por outras aplicações, que precisam ser fechadas após seu uso
public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
        abreConexao2();
    }

    private static String abreConexao() {
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
            return "conexao aberta";
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Fechando recurso liberado pelo SO");
        }
        return null;
    }

    private static void abreConexao2() {
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
            throw new RuntimeException("errooo");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Fechando recurso liberado pelo SO");
        }
    }
}
