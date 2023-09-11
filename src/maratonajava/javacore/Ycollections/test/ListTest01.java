package maratonajava.javacore.Ycollections.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("João");
        lista.add("Carlos");
        lista.add("Pedro");
        lista.add("Joao");
        lista.add("Theo");
        lista.add("Paulo");

        //List<String> listas1 = new ArrayList<>();
        //listas1.add("Pedro");
        //listas1.add("Joao");
        //listas1.add("Theo");
        //listas1.add("Paulo");

        //lista.addAll(listas1);

        //for (String nome : lista) {
            //System.out.println(nome);
        //}

        System.out.println("Lista de Nomes");
        System.out.println("-------------");
        for ( String string : lista) {
            System.out.println(string);
        }
        System.out.println("-------------------");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a pessoa que deseje excluir");
        String nome = scanner.next();
        lista.remove(nome);

        System.out.println("---------------------------------------------");
        System.out.println("Nova Lista Atualizada");
        for (String nomes: lista ) {
            System.out.println(nomes);
        }
    }
}
