package academy.devdojo.maratonajava.javacore.Rdate.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.exercise.dominio.Local;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.Locale;

public class LocalDateTest01 {
    public static void main(String[] args) {                                            //imutavel
        LocalDate localDate = LocalDate.of(2022,Month.APRIL,30);
        System.out.println(localDate.get(ChronoField.DAY_OF_WEEK));
        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.getDayOfYear());
        System.out.println(localDate.isLeapYear());

        LocalDate localDate1 = LocalDate.now();
        System.out.println(localDate);
        System.out.println(localDate1);
    }
}
