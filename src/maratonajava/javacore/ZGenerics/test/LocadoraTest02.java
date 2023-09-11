package maratonajava.javacore.ZGenerics.test;

import maratonajava.javacore.Ycollections.dominio.Pessoa;
import maratonajava.javacore.ZGenerics.dominio.Carro;
import maratonajava.javacore.ZGenerics.dominio.Veiculo;

import java.util.ArrayList;
import java.util.List;

public class LocadoraTest02 {
    public static void main(String[] args) {
        List<Carro> list = lista(new Carro("Carro"));
        System.out.println(list);

        //List<Pessoa> pessoaList = lista(new Pessoa("Claudio"));   so vai aceitar extensão de veiculo

    }

    private static <T extends Veiculo> List<T> lista(T t){
        return List.of(t);
    }
}
