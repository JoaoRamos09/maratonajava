package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HenracaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setCep("109.209-02");
        endereco.setRua("Padre Anchieta");

        Pessoa pessoa = new Pessoa("João","050.861.990-42");
        pessoa.setCpf("050.861.990-42");
        pessoa.setNome("João");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        System.out.println("------------------------------TESTE-----------------------------------");

        Funcionario funcionario = new Funcionario("João","050.861.990-42");                   // com herança (extends) na classe funcionario p/pessoa
        funcionario.setSalario(5000);
        funcionario.setCpf("100.100.100-00");
        funcionario.setNome("Jhonny");
        funcionario.setEndereco(endereco);
        funcionario.imprime();


    }
}