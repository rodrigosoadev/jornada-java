package src.javacore.Cintermediario.Hio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//file
//fileWriter
//fileReader
//bufferedWriter
//BufferedReader
public class FileWriter01 {
    public static void main(String[] args) {
        File file = new File("file.text");
        try (FileWriter fw = new FileWriter(file, true)) {
            fw.write("Rodrigo é top");
            fw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
