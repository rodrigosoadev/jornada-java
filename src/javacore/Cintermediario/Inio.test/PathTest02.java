import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest02 {
    public static void main(String[] args) throws IOException {
        Path pastaPath = Paths.get("Pasta");
        if (Files.notExists(pastaPath)){
            Path pastaDirectory = Files.createDirectories(pastaPath);
        }
        
        Path subPastaPath = Paths.get("Pasta/subpasta/subsubpasta");
        Path subPastaPathDirectory = Files.createDirectories(subPastaPath);

        Path filePath = Paths.get(subPastaPath.toString(), "file.txt");
        Path filePathCreated = Files.createFile(filePath);
    }
}
