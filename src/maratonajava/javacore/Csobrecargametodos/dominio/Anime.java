package academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio;

public class Anime {

    private String tipo;
    private int episodio;
    private String nome;
    private String genero;


    public void init(String nome, int episodio, String tipo){
        this.nome = nome;
        this.tipo = tipo;
        this.episodio = episodio;
    }

    public void init(String nome, int episodio, String tipo, String genero) {
        this.init(nome,episodio,tipo);
        this.genero = genero;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }
    public String getGenero(){
        return this.genero;
    }

    public void imprime() {
        System.out.println(getEpisodio());
        System.out.println(getTipo());
        System.out.println(getNome());
        System.out.println(getGenero());
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEpisodio() {
        return episodio;
    }

    public void setEpisodio(int episodio) {
        this.episodio = episodio;
    }
}
