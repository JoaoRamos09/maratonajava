package maratonajava.javacore.Ycollections.test;

import maratonajava.javacore.Ycollections.dominio.Eletrodomestico;
import maratonajava.javacore.Ycollections.dominio.Pessoa;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Map<Pessoa, Eletrodomestico> map = new HashMap<>();
        Pessoa pessoa1 = new Pessoa("João");
        Pessoa pessoa2 = new Pessoa("Pedro");
        Eletrodomestico eletrodomestico1 = new Eletrodomestico("TV",1L);
        Eletrodomestico eletrodomestico2 = new Eletrodomestico("Computador",2L);
        map.put(pessoa1,eletrodomestico1);
        map.put(pessoa2,eletrodomestico2);

        for(Pessoa pessoa : map.keySet()) {
            System.out.println(pessoa.getNome()+" - "+map.get(pessoa).getNome());
        }
        System.out.println("-----------------------");
        for (Map.Entry<Pessoa,Eletrodomestico> pessoaEletrodomesticoEntry: map.entrySet()){
            System.out.println(pessoaEletrodomesticoEntry.getKey().getNome() + " - "+ pessoaEletrodomesticoEntry.getValue().getNome());
        }
    }
}
