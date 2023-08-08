package academy.devdojo.src.maratonajava.javacore.Wnio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolveTest01 {
    public static void main(String[] args) {
        Path path1 = Paths.get("home/joao");
        Path path2 = Paths.get("dev/texto.txt");

        System.out.println(path1.resolve(path2));

        Path absoluto = Paths.get("/home/joao");
        Path relativo = Paths.get("dev");
        Path file  = Paths.get("texto.txt");

        System.out.println(absoluto.resolve(relativo));                  // quando é absoluto ele n resolve
        System.out.println(absoluto.resolve(file));
        System.out.println(relativo.resolve(absoluto));
        System.out.println(relativo.resolve(file));
        System.out.println(file.resolve(absoluto));
        System.out.println(file.resolve(relativo));


    }
}
