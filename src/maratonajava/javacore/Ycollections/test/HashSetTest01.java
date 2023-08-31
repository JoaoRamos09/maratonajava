package maratonajava.javacore.Ycollections.test;

import maratonajava.javacore.Ycollections.dominio.TeamSoccer;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest01 {
    public static void main(String[] args) {
        Set<TeamSoccer> teamSoccerList = new HashSet<>();           //set só aceita valores unicos, n podem terem valores replicados, importante ter o equals bem definido, mas n mantem uma ordem de inserção, se usar o linkedhasset ele mantem a ordem
        teamSoccerList.add(new TeamSoccer("Gremio", "Azul", 1020L));
        teamSoccerList.add(new TeamSoccer("Gremio", "Azul", 1030L));
        teamSoccerList.add(new TeamSoccer("ARERE", "Azul", 1030L));
        teamSoccerList.add(new TeamSoccer("Inter", "Azul", 98231L));
        teamSoccerList.add(new TeamSoccer("Vasco", "Azul", -1239130L));
        teamSoccerList.add(new TeamSoccer("Gremio", "Azul", 123L));
        teamSoccerList.add(new TeamSoccer("Gremio", "Azul", 123L));
        teamSoccerList.add(new TeamSoccer("Gremio", "Azul", 123L));

        for ( TeamSoccer soccer : teamSoccerList) {
            System.out.println(soccer);
        }
    }

}
