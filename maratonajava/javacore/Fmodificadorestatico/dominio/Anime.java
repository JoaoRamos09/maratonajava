package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Anime {
    private static int[] episodios;
    private String nome;

    // 0 Bloco de inicizalição n estatico é executado
    // 1 Alocado valor em mémoria
    // 2 Cada atributo da classe é criado e inicilizado com valor default/null
    // 3 Bloco de inicialização é executado
    // 4 Construtor é executado

    static{
        Anime.episodios = new int[100];
        System.out.println("Dentro do bloco de inicialização");

        for (int i = 0; i < Anime.episodios.length; i++) {
            Anime.episodios[i] = i + 1;
        }
    }

    public static void setEpisodios(int[] episodios) {
        Anime.episodios = episodios;
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {

        for (int episodio : Anime.episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println(" ");
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodio() {
        return episodios;
    }
}


