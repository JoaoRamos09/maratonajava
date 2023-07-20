package academy.devdojo.maratonajava.javacore.Rdate.test;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationTest01 {
    public static void main(String[] args) {                    //so aceita temporal que retorne segundos/horas
        LocalTime localTime = LocalTime.now();
        LocalTime localTimeAfterTwoHours = LocalTime.now().plusMinutes(2);                 //retorna sempre a diferença entre datas baseado em horas ou demonstra o valor de diferença de datas atraves das horas com o metodo off
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime localDateTime1 = LocalDateTime.now();
        Duration duration = Duration.between(localTime,localTimeAfterTwoHours);
        Duration duration1 = Duration.between(localDateTime1,localDateTime);
        System.out.println(duration);
        System.out.println(duration1);
        
    }
}
