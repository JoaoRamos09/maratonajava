package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Jogador jogador2 = new Jogador("Luan Guilherme");
        Jogador[] jogadores = {jogador1,jogador2};
        Time time1 = new Time("Gremio");
        time1.setJogadores(jogadores);
        jogador1.setTime(time1);
        jogador1.imprime();
        System.out.println("-----------------------------------------------------------------------");
        time1.imprime();
    }
}
