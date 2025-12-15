package javacore.Bbasicoorientacaoobj.modificadorestatico.dominio;
    // 0 - bloco de inicialização é executado quando a jvm carregar a classe (é executado apenas uma vez)
    //1 - alocado espaço na memoria para o obj que será criado
    // 2 - cada atributo de classe é criado e inicializado com seus valores default ou valores explicitos
    // 3 - Bloco de inicialização é executado
    // 4 - o construtor é executado

public class Cliente {
    
    private static int[] parcelas;
    static {
        parcelas = new int[100];
        System.out.println("Dentro do bloco de inicialização");
        for (int i = 1; i < 100; i++) {
            parcelas[i-1] = i;
        }
    }

    public Cliente() {
        
    }

    //metodo inicial
    public static int[] getParcelas() {
        return parcelas;
    }

    //metodo final
    

    
}
