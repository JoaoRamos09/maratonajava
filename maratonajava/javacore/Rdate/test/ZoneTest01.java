package academy.devdojo.maratonajava.javacore.Rdate.test;

import java.time.*;
import java.time.LocalDateTime;
import java.util.Map;

public class ZoneTest01 {
    public static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);
        System.out.println(ZoneId.systemDefault());

        ZoneId tokyoZone = ZoneId.of("Asia/Tokyo");
        System.out.println(tokyoZone);
        LocalDateTime localDateTime = LocalDateTime.now();
        ZonedDateTime zonedDateTime = localDateTime.atZone(tokyoZone);                       //ira retornar o horario da localdatetime e o valor a mais baseado no zulutime
        ZonedDateTime zonedDateTime2 = ZonedDateTime.of(localDateTime, tokyoZone);
        System.out.println(zonedDateTime);
        System.out.println(zonedDateTime2);


        Instant instant = Instant.now();                                                       // instant trabalha com horario zulu ent ele alterar o horario
        ZonedDateTime zonedDateTime1 = instant.atZone(tokyoZone);
        System.out.println(zonedDateTime1);

        System.out.println(ZoneOffset.MAX);               // valor maximo que se pode trabalhar com ZoneOffSet      ele irá pegar a zone baseado no UTC
        System.out.println(ZoneOffset.MIN);               // valor minimo que se pode trabalhar com ZoneOffSet

        ZoneOffset ofTimeManuas = ZoneOffset.of("-04:00");// cria uma zona baseado no numero passado
        OffsetDateTime offsetDateTime = localDateTime.atOffset(ofTimeManuas);
        System.out.println(offsetDateTime + "2");
        OffsetDateTime offsetDateTime1 = OffsetDateTime.of(localDateTime, ofTimeManuas);
        System.out.println(offsetDateTime1);
        OffsetDateTime offsetDateTime2 = instant.atOffset(ofTimeManuas);
        System.out.println(offsetDateTime2);


    }
}
