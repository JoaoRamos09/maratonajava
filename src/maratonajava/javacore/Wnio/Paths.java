package maratonajava.javacore.Wnio;

import java.nio.file.Path;

public class Paths {
    public static void main(String[] args) {
Path path = java.nio.file.Paths.get("C:\\Users\\theod\\OneDrive\\Documents\\Joao\\maratonajava\\maratonajava\\test.txt");
Path path1 = java.nio.file.Paths.get("C:","\\Users\\theod\\OneDrive\\Documents\\Joao\\maratonajava\\maratonajava\\test.txt");
        System.out.println(path.getFileName());
    }
}