package maratonajava.javacore.ZZEstreams.test;

import maratonajava.javacore.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest08 {
    static List<LightNovel> list = new ArrayList<>(List.of(
            new LightNovel("Bola na Rede",24.5),
            new LightNovel("Feitooo",10.20),
            new LightNovel("É rede",5.80),
            new LightNovel("Toca a Música",10.5),
            new LightNovel("Olha oque ele fez",3.99)));

    public static void main(String[] args) {
        System.out.println(list.stream().mapToDouble(LightNovel::getPrice).sum());
        System.out.println(list.stream().collect(Collectors.summingDouble(LightNovel::getPrice)));
        System.out.println("----------------------------");
        System.out.println(list.stream().count());
        System.out.println(list.stream().collect(Collectors.counting()));
        System.out.println("-----------------------------");
        list.stream().max(Comparator.comparing(LightNovel::getPrice)).ifPresent(System.out::println);
        list.stream().collect(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))).ifPresent(System.out::println);
        System.out.println("----------------------------");
        System.out.println(list.stream().mapToDouble(LightNovel::getPrice).average());
        System.out.println(list.stream().collect(Collectors.averagingDouble(LightNovel::getPrice)));
        System.out.println("-------------------------------");
        DoubleSummaryStatistics collect = list.stream().collect(Collectors.summarizingDouble(LightNovel::getPrice));
        System.out.println(collect);
        System.out.println("-------------------------------");
        String collect1 = list.stream().map(LightNovel::getTile).collect(Collectors.joining(", "));
        System.out.println(collect1);
    }
}


