package src.javacore.Cintermediario.Hio.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.text");
        try (FileWriter fw = new FileWriter(file, true);    BufferedWriter br = new BufferedWriter(fw)) {
            br.write("Rodrigo é top");
            br.newLine();
            fw.flush();
            
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
