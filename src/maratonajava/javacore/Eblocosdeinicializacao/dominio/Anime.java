package academy.devdojo.maratonajava.javacore.Eblocosdeinicializacao.dominio;

public class Anime {
    private int[] episodios;
    private String nome;

    // 1 Alocado valor em mémoria
    // 2 Cada atributo da classe é criado e inicilizado com valor default/null
    // 3 Bloco de inicialização é executado
    // 4 Construtor é executado

    {
        episodios = new int[100];

        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
        for (int episodio : this.episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println(" ");
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {

        for (int episodio : this.episodios) {
            System.out.print(episodio + " ");
        }
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodio() {
        return episodios;
    }
}


