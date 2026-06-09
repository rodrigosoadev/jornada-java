import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTest01 {
    public static void main(String[] args) {
        Path dir = Paths.get("/home/rodrigo");
        Path clazz = Paths.get("/home/rodrigo/rodrigodev/olaMundo.java");
        Path pathToClazz = dir.relativize(clazz);
        System.out.println(pathToClazz);

        Path absoluto1 = Paths.get("/home/rodrigo");
        Path absoluto2 = Paths.get("/usr/local");
        Path absoluto3 = Paths.get("/home/rodrigo/rodrigodev/olaMundo.java");

        Path relativo1 = Paths.get("temp");
        Path relativo2 = Paths.get("temp/temp.09062026");

        System.out.println("1 "+absoluto1.relativize(absoluto3));
        System.out.println("2 "+absoluto3.relativize(absoluto1));
        System.out.println("3 "+absoluto1.relativize(absoluto2));
        System.out.println("4 "+relativo1.relativize(relativo2));
      // ocorre um erro  System.out.println("5 "+absoluto1.relativize(relativo1));
        
    }
}
