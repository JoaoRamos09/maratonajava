package maratonajava.javacore.ZZEstreams.test;

import maratonajava.javacore.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest03 {
    public static void main(String[] args) {
        List<LightNovel> list = new ArrayList<>(List.of(
                new LightNovel("Bola na Rede",24.5),
                new LightNovel("Feitooo",10.20),
                new LightNovel("É rede",5.80),
                new LightNovel("Toca a Música",10.5),
                new LightNovel("Olha oque ele fez",3.99)));

        System.out.println(list.stream().anyMatch(ln -> ln.getPrice() < 4));
        System.out.println(list.stream().allMatch(ln -> ln.getPrice() > 0));
        System.out.println(list.stream().noneMatch(ln -> ln.getPrice() < 0));

//        list.sort(Comparator.comparing(LightNovel::getPrice));
        list.stream().filter(ln -> ln.getPrice() < 7).findAny().ifPresent(System.out::println);

        list.stream()
                .filter(ln -> ln.getPrice() < 7)
                .sorted(Comparator.comparing(LightNovel::getPrice))
                .findFirst()
                .ifPresent(System.out::println);

        // os 2 metodos são iguais só mudam a sintaxe

        list.stream()
                .filter(ln -> ln.getPrice() < 7)
                .min(Comparator.comparing(LightNovel::getPrice))
                .ifPresent(System.out::println);
    }
}
