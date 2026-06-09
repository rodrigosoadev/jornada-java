import java.nio.file.Paths;
import java.nio.file.Path;

public class NormalizeTest01 {
    public static void main(String[] args) {
        String diretorioProjeto = "C:\\Users\\Rodrigo Soares\\cursojava\\home\\rodrigo\\dev";
        String arquivoTxt = "../../arquivo.txt";
        Path path1 = Paths.get(diretorioProjeto, arquivoTxt);
        System.out.println(path1);
        System.out.println(path1.normalize());
        Path path2 = Paths.get("/home/./rodrigo/.dev/");
        System.out.println(path2);
        System.out.println(path2.normalize());

        


    }
}
