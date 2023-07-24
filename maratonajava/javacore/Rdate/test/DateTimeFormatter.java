package academy.devdojo.maratonajava.javacore.Rdate.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.exercise.dominio.Local;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Locale;

public class DateTimeFormatter {
    public static void main(String[] args) {                //parse = pegando uma string e fazendo virar obj                  //format = pegano um objeto fazendo virar string
        LocalDateTime localDateTime = LocalDateTime.now();
        String s1 = localDateTime.format(java.time.format.DateTimeFormatter.ISO_DATE);
        String s2 = localDateTime.format(java.time.format.DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(s1);
        System.out.println(s2);

        LocalDate localDate = LocalDate.parse("2023-07-23", java.time.format.DateTimeFormatter.ISO_DATE);              //só pode passar o texto do memso formato definido
        System.out.println(localDate);

        java.time.format.DateTimeFormatter dateTimeFormatter = java.time.format.DateTimeFormatter.ofPattern("yyyy.MM.dd");
        String s3 = LocalDate.now().format(dateTimeFormatter);
        System.out.println(s3);
        LocalDate localDate1 = LocalDate.parse("2023.07.23",dateTimeFormatter);
        System.out.println(localDate1);

        java.time.format.DateTimeFormatter dateTimeFormatter1 = java.time.format.DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.CANADA);
        String format = LocalDate.now().format(dateTimeFormatter1);
        System.out.println(format);
        LocalDate parse = LocalDate.parse("23.July.2023", dateTimeFormatter1);
        System.out.println(parse);


    }
}
