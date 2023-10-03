package maratonajava.javacore.ZZEstreams.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest06 {
    public static void main(String[] args) {
        IntStream.range(1,50).filter(n-> ( n % 2 == 0)).forEach(n-> System.out.print(n+" "));
        System.out.println();
        IntStream.rangeClosed(1,50).filter(n-> ( n % 2 == 0)).forEach(n-> System.out.print(n+" "));
        System.out.println();
        Stream.of("Joao","Lapis","Batata").map(String::toUpperCase).forEach(s -> System.out.print(s + " "));
        System.out.println();
        int arrayInt2[] = {1,2,3,4,5};
        Arrays.stream(arrayInt2).average().ifPresent(System.out::println);

        try(Stream<String> lines = Files.lines(Paths.get("maratonajava/test.txt"))){
            lines.filter(s-> s.contains("Joao")).forEach(System.out::println);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
