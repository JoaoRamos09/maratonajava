package academy.devdojo.maratonajava.javacore.SFormatacao.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFormatTest01 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        Date date = c.getTime();
        DateFormat[] dateFormats = new DateFormat[7];
        dateFormats[0] = DateFormat.getInstance();
        dateFormats[1] = DateFormat.getDateInstance();
        dateFormats[2] = DateFormat.getDateInstance(DateFormat.LONG);
        dateFormats[3] = DateFormat.getDateInstance(DateFormat.SHORT);
        dateFormats[4] = DateFormat.getDateInstance(DateFormat.MEDIUM);
        dateFormats[5] = DateFormat.getDateInstance(DateFormat.FULL);
        dateFormats[6] = DateFormat.getTimeInstance();

        for (DateFormat dateformat: dateFormats) {
            System.out.println(dateformat.format(c.getTime()));

        }
    }
}
