package maratonajava.javacore.Ycollections.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest01 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();

        // index 0,1,2,3
        // value 0,1,2,5
        numeros.add(0);
        numeros.add(1);
        numeros.add(2);
        numeros.add(5);
        Collections.sort(numeros);
        System.out.println(Collections.binarySearch(numeros, 3));
    }
}
