package maratonajava.javacore.ZZDOptional.test;

import java.util.List;
import java.util.Optional;

public class OptionalTest01 {
    public static void main(String[] args){

        Optional<String> stringOptional1 = Optional.of("Marcos");
        Optional<String> stringOptional2 = Optional.ofNullable(null);
        Optional<String> stringOptional3 = Optional.empty();

        Optional<String> stringOptional4 = findName("pedro");
        String name = stringOptional4.orElse("EMPTY");       // n irá retornar nulo, e sim empty
        stringOptional4.ifPresent((String nome) -> System.out.println(nome.toUpperCase()));
        System.out.println(name);

    }

    private  static Optional<String>findName(String name){
        List<String> list = List.of("Joao","Pedro");
        int i = list.indexOf(name);
        if (i == 1){
            return Optional.of(list.get(i));
        }
        return Optional.empty();
    }
}
