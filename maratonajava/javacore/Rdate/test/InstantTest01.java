package academy.devdojo.maratonajava.javacore.Rdate.test;

import java.time.Instant;

public class InstantTest01 {
    public static void main(String[] args) {
        Instant instant = Instant.now();                        //instant trabalha no horario zulu
        System.out.println(instant);
        System.out.println(instant.getNano());
        System.out.println(instant.getEpochSecond());
        System.out.println(Instant.ofEpochSecond(3,1_000_000_000));    //segundos e nanosegundos

    }
}
