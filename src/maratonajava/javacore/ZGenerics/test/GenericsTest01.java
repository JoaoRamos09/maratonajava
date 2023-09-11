package maratonajava.javacore.ZGenerics.test;

import maratonajava.javacore.Ycollections.dominio.Pessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GenericsTest01 {
    public static void main(String[] args) {
        List<String> teste = new ArrayList<>();
        teste.add("Joao");
        teste.add("Joao");
        teste.add("Joao");
        for (String string: teste) {
            System.out.println(string);
        }
        System.out.println("------------");

        add(teste,new Pessoa("Joao"));
        for (Object objects: teste) {
            System.out.println(objects);
        }
        //se for testar com um object ele vai funcionar por mais q a
        // lista seja de string, pois ele n garante o tipo, entao smp passar o generics certo

        //for (Object object: teste) {
            //System.out.println(string);
        //}
    }

    public static void add(List list, Pessoa pessoa){
        list.add(pessoa);
    }
}
