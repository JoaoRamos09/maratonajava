package maratonajava.javacore.ZZEstreams.test;

import maratonajava.javacore.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestLightNovel02 {
    public static List<LightNovel> list = new ArrayList<>(List.of(
            new LightNovel("Bola na Rede",24.5),
            new LightNovel("Feitooo",10.20),
            new LightNovel("É rede",5.80),
            new LightNovel("Toca a Música",10.5),
            new LightNovel("Olha oque ele fez",3.99)));

    public static void main(String[] args) {
         List<String> list1 = list.stream()
                .sorted(Comparator.comparing(LightNovel::getPrice))
                .filter(lightNovel -> lightNovel.getPrice() <= 4 )
                .map(LightNovel::getTile)
                .limit(3)
                 .collect(Collectors.toList());
    }
}
