package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.Scanner;

public class ScannerTest02 {
    public static void main(String[] args) {
        String texto = "joao, 353453, true";
        Scanner scaner = new Scanner(texto);
        scaner.useDelimiter(",");
        while (scaner.hasNext()) {
            if (scaner.hasNextInt()) {
                System.out.println(scaner.nextInt());
            } else if (scaner.hasNextBoolean()) {
                System.out.println(scaner.nextBoolean());
            } else {
                System.out.println(scaner.next());
            }
        }
    }
}
