package maratonajava.javacore.ZZEstreams.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StreamTest01 {
    public static void main(String[] args) {
        List<List<String>> baitaTec = new ArrayList<>();
        List<String> comercial = List.of("João");
        List<String> log = List.of("Italo","Douglas");
        List<String> financeiro = List.of("Isma");
        baitaTec.add(comercial);
        baitaTec.add(financeiro);
        baitaTec.add(log    );

        for (List<String> list:baitaTec) {
            for (String pessoas : list){
                System.out.println(pessoas);
            }
        }
        System.out.println("---------------");
        baitaTec.stream().flatMap(Collection::stream).forEach(System.out::println);
        List<String> list = baitaTec.stream().flatMap(Collection::stream).sorted(String::compareTo).toList();
        System.out.println(list);

        //flatmap é útil quando necessita coletar algo dentro de uma lista
    }
}
