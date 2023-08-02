package academy.devdojo.maratonajava.javacore.Rdate.test;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeTest01 {
    public static void main(String[] args) {
        LocalTime localtime = LocalTime.now();
        System.out.println(localtime);
        System.out.println(localtime.getHour());
        System.out.println(localtime.getMinute());
        System.out.println(localtime.get(ChronoField.SECOND_OF_MINUTE));
    }
}
