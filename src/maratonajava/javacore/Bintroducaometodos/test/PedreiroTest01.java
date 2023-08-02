package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Pedreiro;

public class PedreiroTest01 {
    public static void main(String[] args) {
        Pedreiro pedreiro01 = new Pedreiro();

        pedreiro01.setIdade(25);
        pedreiro01.setNome("João");
       pedreiro01.imprime();
    }
}
