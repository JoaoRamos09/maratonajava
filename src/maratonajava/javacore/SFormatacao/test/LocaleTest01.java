package academy.devdojo.maratonajava.javacore.SFormatacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.exercise.dominio.Local;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        Locale locale = new Locale("it", "IT");
        Calendar calendar = Calendar.getInstance();
        DateFormat form1 = DateFormat.getTimeInstance(DateFormat.FULL, locale);
        System.out.println("Italia "+form1.format(calendar.getTime()));
        Date date1 = new Date();
        System.out.println(date1);
        }
    }
