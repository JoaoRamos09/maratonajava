package maratonajava.javacore.Ycollections.test;

import maratonajava.javacore.Ycollections.dominio.TeamSoccer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<TeamSoccer> teamSoccerList = new LinkedList<>();              // sempre analisar o big o para escolher qual list
        teamSoccerList.add(new TeamSoccer("Gremio", "Azul", 1020L));
        teamSoccerList.add(new TeamSoccer("Gremio", "Azul", 1030L));
        teamSoccerList.add(new TeamSoccer("ARERE", "Azul", 1030L));
        teamSoccerList.add(new TeamSoccer("Inter", "Azul", 98231L));
        teamSoccerList.add(new TeamSoccer("Vasco", "Azul", -1239130L));
        teamSoccerList.add(new TeamSoccer("Gremio", "Azul", 123L));

        //Iterator<TeamSoccer> teamSoccerIterator =  teamSoccerList.iterator();
       // while (teamSoccerIterator.hasNext()){
            //if(teamSoccerIterator.next().getId() == 1030){
                //teamSoccerIterator.remove();
            //}
        //}
        System.out.println(teamSoccerList);

        teamSoccerList.removeIf(teamSoccer -> teamSoccer.getId() == 1030L);
        System.out.println(teamSoccerList);
    }
}
