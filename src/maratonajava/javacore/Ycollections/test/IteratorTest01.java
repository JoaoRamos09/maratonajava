package academy.devdojo.src.maratonajava.javacore.Ycollections.test;

import academy.devdojo.src.maratonajava.javacore.Ycollections.dominio.TeamSoccer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<TeamSoccer> teamSoccerList = new ArrayList<>(16);
        teamSoccerList.add(new TeamSoccer("Gremio", "Azul", 1020L));
        teamSoccerList.add(new TeamSoccer("Gremio", "Azul", 1030L));
        teamSoccerList.add(new TeamSoccer("ARERE", "Azul", 1030L));
        teamSoccerList.add(new TeamSoccer("Inter", "Azul", 98231L));
        teamSoccerList.add(new TeamSoccer("Vasco", "Azul", -1239130L));
        teamSoccerList.add(new TeamSoccer("Gremio", "Azul", 123L));

        Iterator<TeamSoccer> teamSoccerIterator =  teamSoccerList.iterator();
        while (teamSoccerIterator.hasNext()){
            if(teamSoccerIterator.next().getId() == 1030){
                teamSoccerIterator.remove();
            }
        }
        System.out.println(teamSoccerList);
    }
}
