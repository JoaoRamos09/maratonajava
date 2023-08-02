package academy.devdojo.maratonajava.javacore.Rdate.test;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

public class DurationTest01 {
    public static void main(String[] args) {                    //so aceita temporal que retorne segundos/horas
        LocalTime localTime = LocalTime.now();
        LocalTime localTimeAfterTwoMinutes = LocalTime.now().plusMinutes(2);                 //retorna sempre a diferença entre datas baseado em horas ou demonstra o valor de diferença de datas atraves das horas com o metodo off
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime localDateTime1 = LocalDateTime.now();
        Duration duration2 = Duration.between(localTime,localTimeAfterTwoMinutes);
        Duration duration = Duration.between(localTime,localTimeAfterTwoMinutes);
        Duration duration1 = Duration.between(localDateTime1,localDateTime);
        System.out.println(duration);
        System.out.println(duration2.get(ChronoUnit.SECONDS));

        
    }
}
