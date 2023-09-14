package maratonajava.javacore.ZZClambda.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdaTest02 {
    public static void main(String[] args) {
        List<String> list = List.of("Joao","Pedro");
        map(list,s -> s.length());

        List<Integer> integerList = new ArrayList<>(List.of(1, 2,2,2,2, 4,2));

        List<String> list1 = map(integerList, (Integer s) -> s.toString());
        System.out.println(list1);

        integerList.removeIf(s -> s.equals(2));
        System.out.println(integerList);

    }

    public static <T, R> List<R> map(List<T> list, Function<T,R> function){
        List<R> result = new ArrayList<>();
        for (T e : list){
            R r = function.apply(e);
            result.add(r);
        }
        return result;
    }
}
