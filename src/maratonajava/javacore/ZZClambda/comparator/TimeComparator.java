package maratonajava.javacore.ZZClambda.comparator;

import maratonajava.javacore.ZZClambda.dominio.Time;

public class TimeComparator {
    public static int comparateByName(Time t1, Time t2) {
        return t1.getName().compareTo(t2.getName());
    }

    public static int comparateByQntd(Time t1, Time t2) {
        return Integer.compare(t1.getQntd(), t2.getQntd());
    }

    public int comparateByQntdObject(Time t1, Time t2) {
        return Integer.compare(t1.getQntd(), t2.getQntd());

    }
}
