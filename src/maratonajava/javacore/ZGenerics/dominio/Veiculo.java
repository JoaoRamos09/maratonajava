package maratonajava.javacore.ZGenerics.dominio;

public abstract class Veiculo {
    private String name;

    public Veiculo(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }
}
