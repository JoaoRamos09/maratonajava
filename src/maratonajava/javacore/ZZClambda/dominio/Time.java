package maratonajava.javacore.ZZClambda.dominio;

public class Time {
    private String name;
    private int qntd;

    public Time(String name, int qntd) {
        this.name = name;
        this.qntd = qntd;
    }

    public String getName() {
        return name;
    }

    public int getQntd() {
        return qntd;
    }

    @Override
    public String toString() {
        return "Time{" +
                "name='" + name + '\'' +
                ", qntd=" + qntd +
                '}';
    }
}
