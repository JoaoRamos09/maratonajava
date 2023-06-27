package academy.devdojo.maratonajava.javacore.Eblocosdeinicializacao.test;

import academy.devdojo.maratonajava.javacore.Eblocosdeinicializacao.dominio.Anime;

public class AnimeTest {
    private int salario;
    public static void main(String[] args) {
        Anime anime = new Anime("João");
        System.out.println(anime.getNome());
    }


}
