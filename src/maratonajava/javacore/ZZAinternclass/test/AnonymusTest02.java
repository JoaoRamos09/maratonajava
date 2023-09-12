package maratonajava.javacore.ZZAinternclass.test;

import maratonajava.javacore.ZGenerics.dominio.Carro;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class ComparatorCarro implements Comparator<Carro>{

    @Override
    public int compare(Carro o1, Carro o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
public class AnonymusTest02 {
    public static void main(String[] args) {
        List<Carro> carroList = new ArrayList<>(List.of(new Carro("Gol"), new Carro("Uno")));
        carroList.sort(new ComparatorCarro());
        System.out.println(carroList);

        carroList.sort(new Comparator<Carro>() {
            @Override
            public int compare(Carro o1, Carro o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

    }

}
