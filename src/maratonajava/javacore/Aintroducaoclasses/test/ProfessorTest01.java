package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
                professor.idade = 35;
                professor.nome = "Carlos";
                professor.sexo = 'M';

        System.out.println(professor.idade);
        System.out.println(professor.nome);
        System.out.println(professor.sexo);

    }
}
