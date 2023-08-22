package academy.devdojo.src.maratonajava.javacore.Xserilization.dominio;

public class Turma {
    private String nometurma;

    public Turma(String nometurma) {
        this.nometurma = nometurma;
    }

    @Override
    public String toString() {
        return "Turma{" +
                "nometurma='" + nometurma + '\'' +
                '}';
    }

    public String getNome() {
        return nometurma;
    }

    public void setNometurma(String nome) {
        this.nometurma = nome;
    }
}
