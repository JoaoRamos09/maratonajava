package maratonajava.javacore.ZZClambda.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class LambdaTest01 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1,2,3,4,5,6,7));
        list.forEach( s -> {
            if (s.equals(1)) {
                System.out.println(s);
            }
        });

        System.out.println(list);

        forEach(list,(Integer integer) -> System.out.println(integer));
    }

    public static <T> void forEach(List<T> list, Consumer<T> consumer){
        for (T e : list){
            consumer.accept(e);
        }
    }

}
