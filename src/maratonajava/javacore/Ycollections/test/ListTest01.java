package academy.devdojo.src.maratonajava.javacore.Ycollections.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("João");
        lista.add("Carlos");

        List<String> listas1 = new ArrayList<>();
        listas1.add("Pedro");
        listas1.add("Bernardo");

        lista.addAll(listas1);

        for (String nome : lista) {
            System.out.println(nome);
        }

        System.out.println("---------------");
        lista.add("juan");

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a pessoa que deseje excluir");
        String nome = scanner.next();
        lista.remove(nome);


        System.out.println("---------------------------------------------");
        for (String nomes: lista ) {
            System.out.println(nomes);
        }
    }
}
