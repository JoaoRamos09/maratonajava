package maratonajava.javacore.ZZEstreams.test;

import maratonajava.javacore.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestLightNovel01 {
    public static List<LightNovel> list = new ArrayList<>(List.of(
            new LightNovel("Bola na Rede",24.5),
            new LightNovel("Feitooo",10.20),
            new LightNovel("É rede",5.80),
            new LightNovel("Toca a Música",10.5),
            new LightNovel("Olha oque ele fez",3.99)));

    public static void main(String[] args) {
        list.sort(Comparator.comparing(LightNovel::getTile));
        System.out.println(list);
        List<String> list1 = new ArrayList<>();
        for (LightNovel lightNovel : list) {
            if (lightNovel.getPrice() <= 4){
                list1.add(lightNovel.getTile());
            }
            if (list1.size() >= 3){
                break;
            }
        }
        System.out.println(list1);
    }
}
