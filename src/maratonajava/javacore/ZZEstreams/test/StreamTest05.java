package maratonajava.javacore.ZZEstreams.test;

import maratonajava.javacore.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.List;

public class StreamTest05 {
    public static void main(String[] args) {
        List<LightNovel> list = new ArrayList<>(List.of(
                new LightNovel("Bola na Rede",24.5),
                new LightNovel("Feitooo",10.20),
                new LightNovel("É rede",5.80),
                new LightNovel("Toca a Música",10.5),
                new LightNovel("Olha oque ele fez",3.99)));


        list.stream()
                .map(LightNovel::getPrice)
                .filter(price -> price > 5)
                .reduce(Double::sum).ifPresent(System.out::println);

        double sum = list.stream().mapToDouble(LightNovel::getPrice).filter(price -> price > 5).sum();
        System.out.println(sum);
    }
}
