package maratonajava.javacore.ZZEstreams.test;

import java.util.List;

public class StreamTest04 {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(1,2,3,4,5,6,7);
        ;

        integerList.stream().reduce(Integer::sum).ifPresent(System.out::println);
        integerList.stream().reduce((x,y) -> x+y).ifPresent(System.out::println);
        System.out.println(integerList.stream().reduce(0,(x,y)-> x+y));
        System.out.println(integerList.stream().reduce(0,Integer::sum));

        System.out.println("---------------------------------------------------");

        integerList.stream().reduce((x,y)-> x*y).ifPresent(System.out::println);
        System.out.println(integerList.stream().reduce(1,(x,y)-> x*y));

        integerList.stream().reduce((x,y) -> x > y ? x : y).ifPresent(System.out::println);
        System.out.println(integerList.stream().reduce(0,Integer::max));
    }
}
