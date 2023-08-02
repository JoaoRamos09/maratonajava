package academy.devdojo.maratonajava.javacore.Rdate.test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTime {
    public static void main(String[] args) {
        java.time.LocalDateTime localDateTimex = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime = java.time.LocalDateTime.of(2022, Month.APRIL,6,2,17,50);
        LocalTime localTime = LocalTime.parse("23:45:00");            //seguir o padrão de impressao
        LocalDate localDate = LocalDate.parse("21-07-2023");
        java.time.LocalDateTime localDateTime1 = java.time.LocalDateTime.of(localDate,localTime);     // varias maneiras de passar date
        java.time.LocalDateTime localDateTime2 = localDate.atTime(localTime);              //ex 1
        java.time.LocalDateTime localDateTime3 = localTime.atDate(localDate);               //ex 2
    }
}
