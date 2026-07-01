import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;

public class PathMatcherTest01 {
    public static void main(String[] args) {
        Path path1= Paths.get("pasta/subpasta/file.bkp");
        Path path2 = Paths.get("pasta/subpasta/file.txt");
        Path path3 = Paths.get("pasta/subpasta/file.java");
        matcher(path1, "glob:*.bkp");
        matcher(path1, "glob:**.bkp");
        matcher(path2, "glob:**/*.{bkp,txt,java}");
        matcher(path3, "glob:**/file.????}");
        matcher(path3, "glob:**/file.???}");
        

    }

    private static void matcher(Path path, String glob){
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob); 
        System.out.println(glob + " :"+matcher.matches(path));
    }
}
