package src.javacore.Cintermediario.Hio.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.zip.CRC32;

public class BufferedWriter {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Rodrigo Soares\\cursojava\\file.text");
        try (FileReader fr = new FileReader("C:\\\\Users\\\\Rodrigo Soares\\\\cursojava\\\\file.text")) {
            BufferedReader br = new BufferedReader(fr);
            String linha;
            while ((linha = br.readLine()) != null) {
              System.out.println(linha);  
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
