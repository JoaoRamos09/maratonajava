package maratonajava.javacore.ZZClambda.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;

public class LambdaTest02 {
    public static void main(String[] args) {
        List<String> list = List.of("Joao","Pedro");
        List<String> list1 = List.of("1","2","4");
        map(list, String::length);

        List<Integer> integerList = new ArrayList<>(List.of(1, 2,2,2,2, 4,2));


        List<String> stringList = map(integerList,(Integer e) -> e.toString());
        List<Integer> integerList1 = map(list,(String e) -> e.length());
        List<String> stringList1 = map(list,(String e) -> e.toUpperCase());
        List<Integer> integerList2 = map(list, Integer::parseInt);
        List<Integer> integerList3 = map(list, new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {

                return Integer.parseInt(s);
            }
        });

        integerList.removeIf(s -> s.equals(2));
        System.out.println(integerList);

    }

    public static <R, T> List<R> map(List<T> list, Function<T,R> function){
        List<R> result = new ArrayList<>();
        for (T e : list){
            R r = function.apply(e);
            result.add(r);
        }
        return result;
    }
}
