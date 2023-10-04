package maratonajava.javacore.ZZEstreams.test;

import maratonajava.javacore.ZZEstreams.domain.Category;
import maratonajava.javacore.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest09 {
    static List<LightNovel> list = new ArrayList<>(List.of(
            new LightNovel("Bola na Rede",24.5, Category.FUTEBOL),
            new LightNovel("Feitooo",10.20, Category.BASQUETE),
            new LightNovel("É rede",5.80, Category.FUTEBOL),
            new LightNovel("Toca a Música",10.5,Category.VOLEI),
            new LightNovel("Olha oque ele fez",3.99,Category.FUTEBOL)));

    public static void main(String[] args) {
        Map<Category, List<LightNovel>> lightNovelMap = new HashMap<>();
        List<LightNovel> futebol = new ArrayList<>();
        List<LightNovel> basquete = new ArrayList<>();
        List<LightNovel> volei = new ArrayList<>();

        for (LightNovel lightNovel : list) {
            switch (lightNovel.getCategoryEnum()) {
                case FUTEBOL -> futebol.add(lightNovel);
                case VOLEI -> volei.add(lightNovel);
                case BASQUETE -> basquete.add(lightNovel);
            }
        }
        lightNovelMap.put(Category.FUTEBOL,futebol);
        lightNovelMap.put(Category.BASQUETE,basquete);
        lightNovelMap.put(Category.VOLEI,volei);

        System.out.println(lightNovelMap);

        // DOIS JEITOS DE CRIAR A MESMA COISA, como o groupping poupa código e facilita o entendimento

        Map<Category, List<LightNovel>> collect = list.stream().collect(Collectors.groupingBy(LightNovel::getCategoryEnum));
        System.out.println(collect);

    }

}
