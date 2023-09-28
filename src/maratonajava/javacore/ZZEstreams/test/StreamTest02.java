package maratonajava.javacore.ZZEstreams.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest02 {
    public static void main(String[] args) {
        List<String> letters = List.of("Joao", "Pedro", "Italo");
        String[] split = letters.get(0).split("");
        System.out.println(Arrays.toString(split));

        Stream<String> stream = Arrays.stream(split);

        List<String> collect = letters.stream().map(n -> n.split("")).flatMap(Arrays::stream).toList();
    }
}
