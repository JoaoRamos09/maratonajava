package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {

        Funcionario funcionario01 = new Funcionario();
        int[] salario ={1000,1000,1000};
        funcionario01.salario = salario;
        funcionario01.nome = "Joao";
        funcionario01.idade = 22;

        funcionario01.imprimeDados();

    }
}
