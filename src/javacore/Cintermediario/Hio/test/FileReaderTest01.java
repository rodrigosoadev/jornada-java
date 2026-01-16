package src.javacore.Cintermediario.Hio.test;

import java.io.File;
import java.io.FileReader;
import java.util.zip.CRC32;

public class FileReaderTest01 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Rodrigo Soares\\cursojava\\file.text");
        try (FileReader fr = new FileReader(file)) {
            /* char[] in = new char[1]; */
            /* fr.read(in);
            for (char c : in) {
                System.out.println(c);
            } */
            int i;
            while ((i=fr.read()) != -1) {
                System.out.print((char)i);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
