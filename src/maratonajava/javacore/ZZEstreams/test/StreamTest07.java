package maratonajava.javacore.ZZEstreams.test;

import java.util.stream.Stream;

public class StreamTest07 {
    public static void main(String[] args) {
        Stream.iterate(1,n-> n + 2).limit(10).forEach(System.out::println);
    }
}
