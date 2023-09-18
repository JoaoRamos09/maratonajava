package maratonajava.javacore.ZZClambda.test;

import java.util.function.Function;

public class MethodReferenceTest03 {
    public static void main(String[] args) {


        Function<String, Integer> function = Integer::parseInt;
        int x = function.apply("10");
        System.out.println(x);
    }
}
