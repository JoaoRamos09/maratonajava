package maratonajava.javacore.Ycollections.test;

import maratonajava.javacore.Ycollections.dominio.Pessoa;
import maratonajava.javacore.Ycollections.dominio.TeamSoccer;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

class pessoaComparator implements Comparator<Pessoa>{

    @Override
    public int compare(Pessoa o1, Pessoa o2) {
        return o1.getNome().compareTo(o2.getNome());
    }
}

class soccerComparator implements Comparator<TeamSoccer>{

    @Override
    public int compare(TeamSoccer o1, TeamSoccer o2) {
        return o1.getId().compareTo(o2.getId());
    }
}
public class NavagibleSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Pessoa> pessoaSet = new TreeSet<>(new pessoaComparator());       //como é set só aceita valor unicis ( equals ) e necessita ter um comparator ou um comparable na classe
        Pessoa pessoa1 = new Pessoa("Joao","Ramos");
        Pessoa pessoa2 = new Pessoa("Pedro","Rodrigues");
        Pessoa pessoa3 = new Pessoa("Vinicius","Cagao");
        Pessoa pessoa4 = new Pessoa("Gabriel","Soares");
        Pessoa pessoa5 = new Pessoa("Italo","Oliveira");
        Pessoa pessoa6 = new Pessoa("Italo","Oliveira");
        pessoaSet.add(pessoa1);
        pessoaSet.add(pessoa2);
        pessoaSet.add(pessoa3);
        pessoaSet.add(pessoa4);
        pessoaSet.add(pessoa5);
        pessoaSet.add(pessoa6);

        for (Pessoa pessoa : pessoaSet) {
            System.out.println(pessoa);
        }
        System.out.println("---------------");

        NavigableSet<TeamSoccer> teamSoccerList = new TreeSet<>();                   // n aceita valores duplicados no qual o comparator ou comparable sera baseado
        teamSoccerList.add(new TeamSoccer("Gremio", "Azul", 1020L));
        teamSoccerList.add(new TeamSoccer("Gremio", "dsadsdas", 1031230L));
        teamSoccerList.add(new TeamSoccer("Inter", "Rosa", 98231L));
        teamSoccerList.add(new TeamSoccer("Inter", "Azul", 432432L));
        teamSoccerList.add(new TeamSoccer("Vasco", "Azul", -1239130L));
        teamSoccerList.add(new TeamSoccer("Gremio", "Rosa", 342432L));
        teamSoccerList.add(new TeamSoccer("Mapa", "Azul", 123L));
        teamSoccerList.add(new TeamSoccer("Gremio", "Azul", 123L));
        teamSoccerList.add(new TeamSoccer("Gremio", "Azul", 123L));
        teamSoccerList.add(new TeamSoccer("Gremio", "Lisas", 3333333L));
        for (TeamSoccer teamSoccer: teamSoccerList) {
            System.out.println(teamSoccer);
        }
        System.out.println("--------------");

        NavigableSet<TeamSoccer> soccerSet = new TreeSet<>(new soccerComparator());
        soccerSet.add(new TeamSoccer("Gremio","Azul",1L));
        soccerSet.add(new TeamSoccer("Gremio","Azul",2L));
        soccerSet.add(new TeamSoccer("Gremio","Azul",3L));
        soccerSet.add(new TeamSoccer("Gremio","Azul",5L));
        soccerSet.add(new TeamSoccer("Gremio","Azul",10L));

        TeamSoccer time1 = new TeamSoccer("Santos", "Preto",10L);
        TeamSoccer time2 = new TeamSoccer("Santos", "Preto",5L);
        System.out.println(soccerSet.lower(time1));           // <
        System.out.println(soccerSet.floor(time1));        // <=
        System.out.println(soccerSet.higher(time2));          //   >
        System.out.println(soccerSet.ceiling(time2));         // >=

        System.out.println(soccerSet.size());
        System.out.println(soccerSet.pollFirst());

        System.out.println(soccerSet.size());
        System.out.println(soccerSet.pollLast());
        System.out.println(soccerSet.size());
    }
}
