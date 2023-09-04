package maratonajava.javacore.Ycollections.test;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class MapTest04 {
    public static void main(String[] args) {
        NavigableMap<String,String> navigableMap = new TreeMap<>();     //se a chave for um objeto ele precisa ter comparable ou ter um comparator no navigablemap igual o navigableset
        navigableMap.put("D","Letra D");
        navigableMap.put("A","Letra A");
        navigableMap.put("B","Letra B");
        navigableMap.put("C","Letra C");

        for (Map.Entry<String,String> map : navigableMap.entrySet()){
            System.out.println(map.getKey() +"-"+ map.getValue());
        }

        System.out.println(navigableMap.headMap("C"));
        navigableMap.headMap("C").remove("A");
        System.out.println(navigableMap.headMap("C",true));
    }
}
