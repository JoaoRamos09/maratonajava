package academy.devdojo.maratonajava.javacore.Rdate.test;

import java.util.Date;

public class DateTeste01 {
    public static void main(String[] args) {
        Date date1 = new Date();
        System.out.println(date1.getTime());
        Date date2 = new Date(1689461600450L);
        System.out.println(date2);

        Date date3 = new Date(1689461600450L);
        date3.setTime(date3.getTime() + 3_600_000);
        System.out.println(date3);
    }
}
