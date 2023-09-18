package maratonajava.javacore.ZZClambda.test;

import maratonajava.javacore.ZZClambda.comparator.TimeComparator;
import maratonajava.javacore.ZZClambda.dominio.Time;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodReferenceTest02 {

    // lambda usando metodo n statico como referencia
    public static void main(String[] args) {
        TimeComparator timeComparator = new TimeComparator();


        List<Time> timeList = new ArrayList<>(List.of(new Time("Gremio", 5), new Time("Inter", 2)));
        List<String> stringList = new ArrayList<>(List.of("Pedro","Joao","Matheus"));

        Collections.sort(timeList,timeComparator::comparateByQntdObject);
        Collections.sort(stringList,String::compareTo);
    }
}
