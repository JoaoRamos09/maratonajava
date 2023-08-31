package maratonajava.javacore.Ycollections.dominio;

import java.util.Collection;
import java.util.Comparator;
import java.util.Objects;

public class TeamSoccer implements Comparable<TeamSoccer> {
    private String name;
    private String color;
    private Long id;

    public TeamSoccer(String name, String color, Long id) {
        Objects.requireNonNull(name);
        Objects.requireNonNull(color);
        this.name = name;
        this.color = color;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TeamSoccer that = (TeamSoccer) o;
        return id == that.id && Objects.equals(name, that.name) && Objects.equals(color, that.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color, id);
    }

    @Override
    public String toString() {
        return "TeamSoccer{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", id=" + id +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {this.id = id;}

    @Override
    public int compareTo(TeamSoccer o) {
        //if (this.getId() < o.getId()) return -1;              == sempre q for comparar variavel primitiva
        //else if (this.getId() == o.getId()) return 0;
        //else return 1;
        //return this.id.compareTo(o.getId());               == para variaeis wrapper, long, string, etc
        return this.getName().compareTo(o.getName());
    }

}
