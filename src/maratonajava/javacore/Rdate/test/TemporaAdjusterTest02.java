package academy.devdojo.maratonajava.javacore.Rdate.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.*;

class DayofWeek implements TemporalAdjuster{

    @Override
    public Temporal adjustInto(Temporal temporal) {
        DayOfWeek dayOfWeek = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));           // coleta o dia da semana
        int AddDays = 0;

        switch (dayOfWeek){
            case THURSDAY : AddDays = 4; break;
            case FRIDAY: AddDays = 3;  break;
            case SATURDAY: AddDays = 2; break;
            default: AddDays = 1;

        }
        return temporal.plus(AddDays, ChronoUnit.DAYS);
    }
}
public class TemporaAdjusterTest02 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2023,7,28).with(new DayofWeek());
        System.out.println(date);
        System.out.println(date.getDayOfWeek());
        LocalDate date1 = LocalDate.now().with(date);
        System.out.println(date1);


    }

    public static String Dia(LocalDate date) {
        if (date.getDayOfWeek() == DayOfWeek.MONDAY) {
            return "Terça";
        } else if (date.getDayOfWeek() == DayOfWeek.TUESDAY) {
            return "Quarta";
        } else if (date.getDayOfWeek() == DayOfWeek.WEDNESDAY) {
            return "Quinta";
        }
        return "Segunda";
    }
}