package maratonajava.javacore.Ycollections.test;

import maratonajava.javacore.Ycollections.dominio.Eletrodomestico;
import maratonajava.javacore.Ycollections.dominio.Pessoa;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("João","Ramos",1L);          // ele vai sempre se basear no equals/hash p ver se já contem ou nao na lista
        Pessoa pessoa2 = new Pessoa("João","Vinicius", 2L);
        Eletrodomestico eletrodomestico1 = new Eletrodomestico("TV",1L);
        Eletrodomestico eletrodomestico2 = new Eletrodomestico("Computador",2L);

        List<Eletrodomestico> eletrodomesticoList1 = List.of(eletrodomestico1,eletrodomestico2);
        List<Eletrodomestico> eletrodomesticoList2 = List.of(eletrodomestico1);

        Map<Pessoa,List<Eletrodomestico>> pessoaListMap = new HashMap<>();

        pessoaListMap.put(pessoa1,eletrodomesticoList1);
        pessoaListMap.put(pessoa2,eletrodomesticoList2);

        for (Map.Entry<Pessoa,List<Eletrodomestico>> entry : pessoaListMap.entrySet()){
            System.out.println(entry.getKey().getNome());
            for (Eletrodomestico eletrodomestico : entry.getValue()){
                System.out.println("------------"+eletrodomestico.getNome());
            }
        }


    }
}
