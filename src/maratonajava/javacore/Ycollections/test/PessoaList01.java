package academy.devdojo.src.maratonajava.javacore.Ycollections.test;

import academy.devdojo.src.maratonajava.javacore.Ycollections.dominio.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class PessoaList01 {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Pedro","Ramos");
        Pessoa pessoa2 = new Pessoa("Matheus","Rodrigues");
        Pessoa pessoa3 = new Pessoa("Jorge","Soares");
        Pessoa pessoa4 = new Pessoa("Cleber","Vitor");

        List<Pessoa> pessoasList = new ArrayList<>();
        pessoasList.add(pessoa1);
        pessoasList.add(pessoa2);
        pessoasList.add(pessoa3);
        pessoasList.add(0,pessoa4);

        for (Pessoa pessoa : pessoasList) {
            System.out.println(pessoa);
        }
        Pessoa pessoa5 = new Pessoa("Marcos","Vitor");                // hascode diferente
        Pessoa pessoa6 = new Pessoa("Jorge","Vitor");               //mesmo hascode ( nome da pessoa )
        System.out.println(pessoasList.contains(pessoa5));
        System.out.println(pessoasList.contains(pessoa6));
        int indexPessoa6 = pessoasList.indexOf(pessoa6);
        System.out.println(pessoasList.get(indexPessoa6));

    }
}
