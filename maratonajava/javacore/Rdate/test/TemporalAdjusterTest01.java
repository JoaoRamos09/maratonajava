package academy.devdojo.maratonajava.javacore.Rdate.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjusterTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now().withMonth(2).withDayOfMonth(2).withYear(2021);
        now = LocalDate.now().with(ChronoField.DAY_OF_MONTH,6);
        System.out.println(now);
        System.out.println(now.getDayOfYear());


        LocalDate now1 = LocalDate.now().with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY));          //retorna próximo dia especificado pode ser o memso dia
        System.out.println(now1);

        LocalDate now2 = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.FRIDAY));           //retorna o proximo dia especificado n sendo o mesmo
        System.out.println(now2);

        LocalDate now3 = LocalDate.now().with(TemporalAdjusters.previous(DayOfWeek.FRIDAY));
        System.out.println(now3);

        LocalDate now4 = LocalDate.now().with(TemporalAdjusters.previousOrSame(DayOfWeek.FRIDAY));
        System.out.println(now4);
        System.out.println(now4.getDayOfMonth());

    }
}
