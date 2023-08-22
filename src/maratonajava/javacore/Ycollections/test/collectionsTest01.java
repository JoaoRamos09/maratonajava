package academy.devdojo.src.maratonajava.javacore.Ycollections.test;

import academy.devdojo.src.maratonajava.javacore.Ycollections.dominio.Pessoa;

public class collectionsTest01 {
    public static void main(String[] args) {
        String text1 = "Joao";
        String text2 = "Joao";
        String text3 = new String("Joao");

        Pessoa pessoa1 = new Pessoa("Joao","Ramos");
        Pessoa pessoa2 = new Pessoa("Joao","Ramos");


        System.out.println(text1 == text2);
        System.out.println(text2 == text3);                   // compara se a referencia da string é a mesma
        System.out.println(text1.equals(text3));              // compara se o valor da string é a mesma
        System.out.println(text3.equals(text1));
        System.out.println(pessoa1.equals(pessoa2));           //compara se os objetos fazem referencia para o mesmo local em memoria

    }

}
