package maratonajava.javacore.Vio;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileBufferedWritterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");

        try(FileWriter fileWriter = new FileWriter(file,true)){
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Jajajajajajaj");
            bufferedWriter.newLine();
            bufferedWriter.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
