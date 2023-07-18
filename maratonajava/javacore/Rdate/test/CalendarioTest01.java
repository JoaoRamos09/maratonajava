package academy.devdojo.maratonajava.javacore.Rdate.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarioTest01 {
    public static void main(String[] args) {


        Calendar c = Calendar.getInstance();
        if (c.getFirstDayOfWeek() == Calendar.SUNDAY){
            System.out.println("Domingo é um dia bala");

        }
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_YEAR));
        System.out.println(c.get(Calendar.HOUR_OF_DAY));
        c.add(Calendar.HOUR_OF_DAY,2);


        Date date = c.getTime();
        System.out.println(date);
    }
}
