package maratonajava.javacore.ZZBparametrizandocomportamentos.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class TestJoao01 {
    public static void main(String[] args){
        List<String> listNomes = new ArrayList<>(List.of("Joao","Pedro","Matheus"));

        listNomes.forEach( s -> System.out.println(s));
    }
}
