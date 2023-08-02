package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {

        Funcionario funcionario01 = new Funcionario();
       funcionario01.setIdade(28);
        funcionario01.setNome("João");
        funcionario01.setSalario(new int[]{1000,2000,3000});
        funcionario01.imprimeDados();
        System.out.println(funcionario01.getMedia());

    }
}
