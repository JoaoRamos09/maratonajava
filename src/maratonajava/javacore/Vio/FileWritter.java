package maratonajava.javacore.Vio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWritter {
    public static void main(String[] args) {
        File file = new File("file.txt");

        try(FileWriter fileWriter = new FileWriter(file,true)){
            fileWriter.write("É muito bonito ser feliz\n");
            fileWriter.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
