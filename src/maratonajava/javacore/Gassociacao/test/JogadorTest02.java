package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Time time = new Time("Brasil");
        Jogador jogador1 = new Jogador("Pele");
        jogador1.setTime(time);
        jogador1.imprime();

    }

}
