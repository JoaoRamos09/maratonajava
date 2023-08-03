package maratonajava.javacore.Vio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileBufferedReaderTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileReader fileReader = new FileReader(file)) {
            BufferedReader bf = new BufferedReader(fileReader);
            String linha;

            while ((linha = bf.readLine()) != null){
                System.out.println(linha);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
