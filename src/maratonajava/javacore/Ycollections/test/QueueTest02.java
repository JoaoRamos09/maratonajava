package maratonajava.javacore.Ycollections.test;

import maratonajava.javacore.Ycollections.dominio.TeamSoccer;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest02 {
    public static void main(String[] args) {
        // quando se passa objeto no queue precsa ter um comparator na declaração do objeto ou comparable na classe
        Queue<TeamSoccer> teamSoccerList = new PriorityQueue<>(new compareListbyId().reversed());
        teamSoccerList.add(new TeamSoccer("Gremio", "Azul", 1020L));
        teamSoccerList.add(new TeamSoccer("Gremio", "Azul", 1030L));
        teamSoccerList.add(new TeamSoccer("Inter", "Azul", 98231L));
        teamSoccerList.add(new TeamSoccer("Vasco", "Azul", -1239130L));
        teamSoccerList.add(new TeamSoccer("Gremio", "Azul", 123L));

        while (!teamSoccerList.isEmpty()){
            System.out.println(teamSoccerList.poll());
        }

    }
}
