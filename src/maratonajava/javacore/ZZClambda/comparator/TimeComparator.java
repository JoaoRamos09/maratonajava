package maratonajava.javacore.ZZClambda.comparator;

import maratonajava.javacore.ZZClambda.dominio.Time;

public class TimeComparator {
    public static int comparateByName(Time t1, Time t2){
        return t1.getName().compareTo(t2.getName());
    }
}
