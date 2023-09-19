package maratonajava.javacore.ZZClambda.test;

import maratonajava.javacore.ZZClambda.comparator.TimeComparator;
import maratonajava.javacore.ZZClambda.dominio.Time;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class MethodReferenceTest04 {
    public static void main(String[] args) {
        List<Time> timeList = new ArrayList<>(List.of(new Time("Gremio", 5), new Time("Inter", 2)));
        Supplier<TimeComparator> timeComparatorSupplier = TimeComparator::new;
        TimeComparator timeComparator = timeComparatorSupplier.get();
        timeList.sort(timeComparator::comparateByQntdObject);
        System.out.println(timeList);

        BiFunction<String,Integer,Time> biFunction = Time::new;
        Time time = biFunction.apply("Gremio",5);
        System.out.println(time);
    }
}
