package academy.devdojo.maratonajava.javacore.Gassociacao.exercise.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.exercise.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.exercise.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.exercise.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.exercise.dominio.Seminario;

public class Exercicio {
    public static void main(String[] args) {
        Local local = new Local("Rua Padre Anchieta");
        Aluno aluno1 = new Aluno("João",21);
        Aluno[] turma1 ={aluno1};

        Seminario seminario1 = new Seminario("Palestra de Java",turma1,local);

        Seminario[] seminarios ={seminario1};
        Professor professor = new Professor("Marcelo","Educação Fisíca",seminarios);

        professor.imprime();
    }
}
