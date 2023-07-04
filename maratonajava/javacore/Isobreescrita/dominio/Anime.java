package academy.devdojo.maratonajava.javacore.Isobreescrita.dominio;

public class Anime {
    private String nome;


    @Override
    public String toString() {                                             //sobreescrita do metodo override de object
        return "Anime{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
