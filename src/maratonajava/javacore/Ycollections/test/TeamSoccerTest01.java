package academy.devdojo.src.maratonajava.javacore.Ycollections.test;

import academy.devdojo.src.maratonajava.javacore.Ycollections.dominio.TeamSoccer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class compareListbyId implements Comparator<TeamSoccer>{
    @Override
    public int compare(TeamSoccer o1, TeamSoccer o2) {
        return o1.getId().compareTo(o2.getId());
    }
}
public class TeamSoccerTest01 {
    public static void main(String[] args) {
        List<TeamSoccer> teamSoccerList = new ArrayList<>(16);
        teamSoccerList.add(new TeamSoccer("Gremio", "Azul", 1020L));
        teamSoccerList.add(new TeamSoccer("Gremio", "Azul", 1030L));
        teamSoccerList.add(new TeamSoccer("Inter", "Azul", 98231L));
        teamSoccerList.add(new TeamSoccer("Vasco", "Azul", -1239130L));
        teamSoccerList.add(new TeamSoccer("Gremio", "Azul", 123L));

        for (TeamSoccer teamSoccer : teamSoccerList) {
            System.out.println(teamSoccer);
        }
        System.out.println("-----------------");
        Collections.sort(teamSoccerList);
        for (TeamSoccer teamSoccer : teamSoccerList) {
            System.out.println(teamSoccer);
        }
        System.out.println("-------------");
        //Collections.sort(teamSoccerList, new compareListbyId());               // criando um novo objeto conseguimos definir uma ordem especifica
        teamSoccerList.sort(new compareListbyId());
        for (TeamSoccer teamSoccer : teamSoccerList) {
            System.out.println(teamSoccer);
        }
    }
}
