package maratonajava.javacore.ZZClambda.test;

import maratonajava.javacore.ZZClambda.comparator.TimeComparator;
import maratonajava.javacore.ZZClambda.dominio.Time;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MethodReferenceTest01 {
    public static void main(String[] args){

        //utilizando lambda para fazer referencia a metodos staticos

    List<Time> timeList = new ArrayList<>(List.of(new Time("Gremio", 5), new Time("Inter", 2)));
        //Collections.sort(timeList,(a1,a2) -> a1.getName().compareTo(a2.getName()));
        //Collections.sort(timeList, TimeComparator::comparateByName);
        Collections.sort(timeList, TimeComparator::comparateByQntd);
        Collections.sort(timeList, new Comparator<Time>() {
            @Override
            public int compare(Time o1, Time o2) {
                return 0;
            }
        });


        //estudar mais

}

}


