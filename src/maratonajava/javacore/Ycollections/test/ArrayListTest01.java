package academy.devdojo.src.maratonajava.javacore.Ycollections.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListTest01 {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);

        Integer[] listToArray = integerList.toArray(new Integer[0]);
        System.out.println(Arrays.toString(listToArray));
        System.out.println("------------- ");

        Integer[] arrayToList = new Integer[3];
        arrayToList[0] = 1;
        arrayToList[1] = 3;
        arrayToList[2] = 5;

        List<Integer> numeros = Arrays.asList(arrayToList);
        numeros.set(0,15);                                       // altera a lista e o array pois eles acabem se conectando
        System.out.println(Arrays.toString(arrayToList));
        System.out.println(numeros);

        List<Integer> numeros2 = new ArrayList<>(Arrays.asList(arrayToList));            //dessa maneira a gente tira o vinculo da lista com o array
        numeros2.set(0,23);
        System.out.println(numeros2);

        List<String> list = Arrays.asList("20", "10");
        List<Integer> integerList1 = List.of(1, 2, 3, 4);
    }
}
