package maratonajava.javacore.ZGenerics.test;

import maratonajava.javacore.ZGenerics.dominio.Animal;
import maratonajava.javacore.ZGenerics.dominio.Cachorro;
import maratonajava.javacore.ZGenerics.dominio.Gato;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class WildcardsTest02 {
    public static void main(String[] args) {
        List<Animal> animals1 = List.of(new Cachorro(),new Gato());
        List<Animal> animals = new ArrayList<>();
        List<Cachorro> cachorro = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatos = List.of(new Gato(),new Gato());

        listanimals(animals1);
        System.out.println("----------");
        listanimals(animals);
        System.out.println("---------");
        listanimals(cachorro);
        System.out.println("---------");
        listanimals(gatos);
        System.out.println("----------");
        consultaListAnimais(animals);
    }

    public static void listanimals(List<? extends Animal > list){         // n pode adicionar, apenas consultar
        for (Animal animal : list) {
            animal.consulta();
            System.out.println(animal);
        }
    }

    public static void consultaListAnimais(List<? super Animal> list){    // pode consultar e adicionar
        list.add(new Cachorro());
        list.add(new Gato());
        for (Object obj : list) {
            if (obj instanceof Cachorro cachorro){
                System.out.println(cachorro);
                cachorro.consulta();
            } else if (obj instanceof Gato gato){
                System.out.println(gato);
                gato.consulta();
            }
        }
    }
}
