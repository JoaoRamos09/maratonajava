package academy.devdojo.maratonajava.javacore.SFormatacao.test;

import java.util.Calendar;

public class SimpleDateFormat {
    public static void main(String[] args) {
        String pattern = "yyyy.MM.dd G 'at' HH:mm:ss z";
        java.text.SimpleDateFormat data = new java.text.SimpleDateFormat(pattern);
        Calendar calendar = Calendar.getInstance();

        System.out.println(data.format(calendar.getTime()));
        System.out.println(data.toLocalizedPattern());
    }
}
