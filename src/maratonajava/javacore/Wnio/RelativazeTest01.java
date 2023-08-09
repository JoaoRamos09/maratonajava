package academy.devdojo.src.maratonajava.javacore.Wnio;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLOutput;

public class RelativazeTest01 {
    public static void main(String[] args) {
        Path path1 = Paths.get("/home/joao");
        Path path2 = Paths.get("/home/joao/dev/coisinha");
        System.out.println(path1.relativize(path2));

        Path path3 = Paths.get("/home/joao");
        Path path4 = Paths.get("/user/local");
        Path path5 = Paths.get("/home/joao/dev/coisinha/text.txt");
        Path path6 = Paths.get("dev");
        Path path7 = Paths.get("dev/charlie");

        System.out.println("1 "+path3.relativize(path5));
        System.out.println("2 "+path5.relativize(path3));
        System.out.println("3 "+path3.relativize(path4));
        System.out.println("4 "+path6.relativize(path7));
        System.out.println("5 "+path7.relativize(path6));
        System.out.println("6 "+path5.relativize(path6));              // n funciona pois absoluto e relativo n conseguem se conectar ja q nunca se sabe onde está o relativo

    }
}
