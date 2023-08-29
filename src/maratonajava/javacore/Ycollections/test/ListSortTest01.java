package academy.devdojo.src.maratonajava.javacore.Ycollections.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> teamSoccer = new ArrayList<>();
        teamSoccer.add("Gremio");
        teamSoccer.add("Internacional");
        teamSoccer.add("Juventude");
        teamSoccer.add("Mirassol");
        teamSoccer.add("Inter de Milao");
        teamSoccer.add("Bayer");
        Collections.sort(teamSoccer);                        // organiza a lista de acordo com a classe, String ordem alfabetica, Integer ordem numero, etc

        for ( String team : teamSoccer) {
            System.out.println(team);
        }
    }
}
