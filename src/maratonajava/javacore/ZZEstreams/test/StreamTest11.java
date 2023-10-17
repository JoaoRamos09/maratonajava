package maratonajava.javacore.ZZEstreams.test;

import maratonajava.javacore.ZZEstreams.domain.Category;
import maratonajava.javacore.ZZEstreams.domain.LightNovel;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTest11 {
    static List<LightNovel> list = new ArrayList<>(List.of(
            new LightNovel("Bola na Rede",24.5, Category.FUTEBOL),
            new LightNovel("Feitooo",10.20, Category.BASQUETE),
            new LightNovel("É rede",5.80, Category.FUTEBOL),
            new LightNovel("Toca a Música",10.5,Category.VOLEI),
            new LightNovel("Olha oque ele fez",3.99,Category.FUTEBOL)));

    public static void main(String[] args) {
        Map<Category, Long> collect = list.stream().
                collect(Collectors.groupingBy(LightNovel::getCategoryEnum, Collectors.counting()));
        System.out.println(collect);

        Map<Category, Optional<LightNovel>> collect1 = list.stream().
                collect(Collectors.groupingBy(LightNovel::getCategoryEnum, Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))));
        System.out.println(collect1);

        Map<Category, LightNovel> collect2 = list.stream().
                collect(Collectors.groupingBy(LightNovel::getCategoryEnum, Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice)), Optional::get)));
    }
}
