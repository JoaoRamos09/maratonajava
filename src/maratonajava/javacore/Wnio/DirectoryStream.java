package academy.devdojo.src.maratonajava.javacore.Wnio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryStream {
    public static void main(String[] args) {
        Path path = Paths.get(".");

        try(java.nio.file.DirectoryStream<Path> stream = Files.newDirectoryStream(path)) {
            for (Path path1 : stream) {
                System.out.println(path1.getFileName());

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
