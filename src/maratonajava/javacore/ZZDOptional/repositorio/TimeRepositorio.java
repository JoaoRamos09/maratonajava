package maratonajava.javacore.ZZDOptional.repositorio;

import maratonajava.javacore.ZZDOptional.dominio.Time;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class TimeRepositorio {
     public static List<Time> timeList = List.of(new Time(1,"Gremio",23),new Time(2,"Palmeiras",25));


     public static Optional<Time> findName(String name){
        return find(m -> m.getName().equals(name));
     }

     public static Optional<Time> findId(int id){
         return find(m -> m.getId().equals(id));
     }
    public static Optional<Time> find(Predicate<Time> predicate){
        Time foud = null;
        for (Time time : timeList) {
            if (predicate.test(time)){
                foud = time;
            }
        }
        return Optional.ofNullable(foud);
    }



}
