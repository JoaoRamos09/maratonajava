package academy.devdojo.maratonajava.javacore.Dconstrutores.test;

import academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Joao",25,"Luta","Homem","PL") ;
        anime.init("Pedro","Homem","Luta",25);
        System.out.println("------------------------------------");
        anime.imprime();
    }
}
