package academy.devdojo.maratonajava.javacore.Rdate.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.TemporalUnit;

public class PeriodTest01 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        LocalDate localDate1 = LocalDate.now().plusDays(2);
        Period period = Period.between(localDate,localDate1);
        System.out.println(period);
        System.out.println(Period.ofDays(5));
        System.out.println(Period.ofWeeks(5));
        Period period1 = Period.ofWeeks(5);
        System.out.println(period1.getDays());

        Period period2 = Period.between(LocalDate.now(),LocalDate.now().plusDays(period1.getDays()));
        System.out.println(period2);
    }
}
