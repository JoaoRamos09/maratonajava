package maratonajava.javacore.ZZDOptional.test;

import maratonajava.javacore.ZZDOptional.dominio.Time;
import maratonajava.javacore.ZZDOptional.repositorio.TimeRepositorio;

import java.util.Optional;
import java.util.function.Supplier;

public class OptionalTest02 {
    public static void main(String[] args) {
        Optional<Time> optional1 = TimeRepositorio.findName("Santos");
        optional1.ifPresent(m -> m.setName("Inter"));
        Time time = optional1.orElse(new Time(3,"Santos",59));
        System.out.println(TimeRepositorio.timeList);

        Optional<Time> optional2 = TimeRepositorio.findId(2);
        optional2.orElseThrow(IllegalAccessError::new);

    }
}
