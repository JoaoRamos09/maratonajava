package academy.devdojo.maratonajava.javacore.Rdate.test;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ChronitUnitTest01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime localDateTime1 = LocalDateTime.now().plusYears(2);
        System.out.println(ChronoUnit.HOURS.between(localDateTime,localDateTime1));
        System.out.println(ChronoUnit.MONTHS.between(localDateTime,localDateTime1));
        System.out.println(ChronoUnit.MINUTES.between(localDateTime,localDateTime1));
    }
}
