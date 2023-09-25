package maratonajava.javacore.ZZDOptional.dominio;

public class Time {
    private Integer id;
    private String name;
    private int players;

    public Time(Integer id, String name, int players) {
        this.id = id;
        this.name = name;
        this.players = players;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPlayers() {
        return players;
    }

    public void setPlayers(int players) {
        this.players = players;
    }

    @Override
    public String toString() {
        return "Time{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", players=" + players +
                '}';
    }
}

