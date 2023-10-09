package maratonajava.javacore.ZZEstreams.test;

import maratonajava.javacore.ZZEstreams.domain.Category;
import maratonajava.javacore.ZZEstreams.domain.LightNovel;
import maratonajava.javacore.ZZEstreams.domain.Promotion;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest10 {
    static List<LightNovel> list = new ArrayList<>(List.of(
            new LightNovel("Bola na Rede",24.5, Category.FUTEBOL),
            new LightNovel("Feitooo",10.20, Category.BASQUETE),
            new LightNovel("É rede",5.80, Category.FUTEBOL),
            new LightNovel("Toca a Música",10.5,Category.VOLEI),
            new LightNovel("Olha oque ele fez",3.99,Category.FUTEBOL)));

    public static void main(String[] args) {
        Map<Promotion, List<LightNovel>> collect = list.stream().
                collect(Collectors.groupingBy(ln ->
                        ln.getPrice() < 6 ? Promotion.NORMAL_PRICE : Promotion.PROMOTION_PRICE));
        System.out.println(collect);
        System.out.println();
        Map<Category, Map<Promotion, List<LightNovel>>> collect1 = list.stream().
                collect(Collectors.groupingBy(LightNovel::getCategoryEnum, Collectors.groupingBy(ln -> ln.getPrice() < 6 ? Promotion.NORMAL_PRICE : Promotion.PROMOTION_PRICE)));
        System.out.println(collect1);
    }
}
