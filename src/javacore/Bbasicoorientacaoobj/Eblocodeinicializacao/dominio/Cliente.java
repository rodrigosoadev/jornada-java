package src.javacore.Bbasicoorientacaoobj.Eblocodeinicializacao.dominio;
    //1 - alocado espaço na memoria para o obj que será criado
    // 2 - cada atributo de classe é criado e inicializado com seus valores default ou valores explicitos
    // 3 - Bloco de inicialização é executado
    // 4 - o construtor é executado

public class Cliente {
    
    private int[] parcelas;
    {
        parcelas = new int[100];
        System.out.println("Exibindo quantidade de parcelas possiveís");
        for (int i = 1; i < 100; i++) {
            parcelas[i-1] = i;
        }
    }

    public Cliente() {
        
    }

    //metodo inicial
    public int[] getParcelas() {
        return parcelas;
    }

    public void setParcelas(int[] parcelas) {
        this.parcelas = parcelas;
    }
    //metodo final
    

    
}
