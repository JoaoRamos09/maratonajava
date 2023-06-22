package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "João";
        estudante01.idade = 21;
        estudante01.sexo = 'M';

        estudante02.nome = "Jhonny";
        estudante02.idade = 22;
        estudante02.sexo = 'M';


        estudante01.imprimir();
        estudante02.imprimir();


    }
}
