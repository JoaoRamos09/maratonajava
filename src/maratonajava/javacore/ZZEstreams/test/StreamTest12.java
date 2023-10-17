package maratonajava.javacore.ZZEstreams.test;

import maratonajava.javacore.ZZEstreams.domain.Category;
import maratonajava.javacore.ZZEstreams.domain.LightNovel;
import maratonajava.javacore.ZZEstreams.domain.Promotion;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTest12 {
    static List<LightNovel> list = new ArrayList<>(List.of(
            new LightNovel("Bola na Rede",24.5, Category.FUTEBOL),
            new LightNovel("Feitooo",10.20, Category.BASQUETE),
            new LightNovel("É rede",5.80, Category.FUTEBOL),
            new LightNovel("Toca a Música",10.5,Category.VOLEI),
            new LightNovel("Olha oque ele fez",3.99,Category.FUTEBOL)));

    public static void main(String[] args) {
        Map<Category, DoubleSummaryStatistics> collect = list.stream().
                collect(Collectors.groupingBy(LightNovel::getCategoryEnum, Collectors.summarizingDouble(LightNovel::getPrice)));
        System.out.println(collect);

        Map<Category, List<Promotion>> collect1 = list.stream().
                collect(Collectors.groupingBy(LightNovel::getCategoryEnum, Collectors.mapping(StreamTest12::getPromotion, Collectors.toList())));
        System.out.println(collect1);

        Map<Category, Set<Promotion>> collect2 = list.stream().
                collect(Collectors.groupingBy(LightNovel::getCategoryEnum, Collectors.mapping(StreamTest12::getPromotion, Collectors.toSet())));
        System.out.println(collect2);

        Map<Category, LinkedHashSet<Promotion>> collect3 = list.stream().
                collect(Collectors.groupingBy(LightNovel::getCategoryEnum, Collectors.mapping(StreamTest12::getPromotion, Collectors.toCollection(LinkedHashSet::new))));
        System.out.println(collect3);
    }

    private static Promotion getPromotion(LightNovel lightNovel){
        return lightNovel.getPrice() < 6 ? Promotion.PROMOTION_PRICE : Promotion.NORMAL_PRICE;
    }
}
