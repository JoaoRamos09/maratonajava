package academy.devdojo.src.maratonajava.javacore.Wnio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeTest01 {
    public static void main(String[] args) {
        String path1 = "home/joao/dev";
        String path2 = "../../texto.txt";
        System.out.println(Paths.get(path1,path2).normalize());                // normaliza o diretorio mas n verifica se o arquivo existe

        String path3 = "/home/./joao/./dev/";
        System.out.println(Paths.get(path3).normalize());                      // || || ||
    }
}
