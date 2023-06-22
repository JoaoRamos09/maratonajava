package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressoraEstudante = new ImpressoraEstudante();

        estudante01.nome = "João";
        estudante01.idade = 21;
        estudante01.sexo = 'M';

        estudante02.nome = "Jhonny";
        estudante02.idade = 22;
        estudante02.sexo = 'M';

        impressoraEstudante.imprimirestudante(estudante01);                 //argumentos
        impressoraEstudante.imprimirestudante(estudante02);

        impressoraEstudante.imprimirestudante(estudante01);
        impressoraEstudante.imprimirestudante(estudante02);
    }
}
