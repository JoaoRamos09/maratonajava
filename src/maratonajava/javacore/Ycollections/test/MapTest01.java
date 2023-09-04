package maratonajava.javacore.Ycollections.test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {
        Map<String,String> stringMap = new HashMap<>();  //ordena pelo hash
        stringMap.put("Ajsodo","Joao");
        stringMap.put("Bpppp","Pedro");
        stringMap.put("Cijijiji","Mateus");
        stringMap.put("Cijijiji","Marcus");//sobreescreve o valor
        stringMap.putIfAbsent("Cijijiji","Leo");
        stringMap.put("Ddsadas","Mateus");
        System.out.println(stringMap);
        System.out.println("----------------");

        for (String key: stringMap.keySet()) {               // retorna chave e valor
            System.out.println(key + " - "+ stringMap.get(key));
        }
        System.out.println("-------------------");          //retorna valor
        for (String value : stringMap.values()){
            System.out.println(value);
        }
        System.out.println("----------------");
        for (Map.Entry<String,String> stringEntry : stringMap.entrySet()) {
            System.out.println(stringEntry.getKey()+" "+stringEntry.getValue());
        }

        System.out.println("--------------");

        Map<String,String> stringMap1 = new LinkedHashMap<>();  //ordena pela inserção
        stringMap1.put("Ajsodo","Joao1");
        stringMap1.put("Bpppp","Pedro2");
        stringMap1.put("Cijijiji","Mateus");
        stringMap1.put("Cijijiji","Marcus");
        stringMap1.putIfAbsent("Cijijiji","Leo");
        stringMap1.put("Ddsadas","Mateus");

        for (String key : stringMap1.keySet()){
            System.out.println(key +"-"+ stringMap1.get(key));
        }
    }
}
