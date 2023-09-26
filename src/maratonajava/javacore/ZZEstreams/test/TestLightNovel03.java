package maratonajava.javacore.ZZEstreams.test;

import maratonajava.javacore.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TestLightNovel03 {
    public static List<LightNovel> list = new ArrayList<>(List.of(
            new LightNovel("Bola na Rede", 24.5),
            new LightNovel("Feitooo", 10.20),
            new LightNovel("Feitooo", 10.20),
            new LightNovel("É rede", 5.80),
            new LightNovel("É rede", 5.80),
            new LightNovel("Toca a Música", 10.5),
            new LightNovel("Olha oque ele fez", 3.99)));


    public static void main(String[] args) {
        Stream<LightNovel> stream1 = list.stream();
        list.forEach(System.out::println);

        long count = stream1.distinct().filter(ln -> ln.getPrice() < 11).count();
        System.out.println(count);
        System.out.println("---------------");
        stream1 = list.stream();
        // se quiser utilziar novamente a stream, precisa declarar ela
        long count1 = stream1.filter(ln -> ln.getPrice() < 11).count();
        System.out.println(count1);
    }
}