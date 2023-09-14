package maratonajava.javacore.ZZClambda.test;

import maratonajava.javacore.ZZClambda.comparator.TimeComparator;
import maratonajava.javacore.ZZClambda.dominio.Time;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodReferenceTest01 {
    public static void main(String[] args){

    List<Time> timeList = new ArrayList<>(List.of(new Time("Gremio", 5), new Time("Inter", 2)));
        //Collections.sort(timeList,(a1,a2) -> a1.getName().compareTo(a2.getName()));
        Collections.sort(timeList, TimeComparator::comparateByName);

        //estudar mais

}

}


