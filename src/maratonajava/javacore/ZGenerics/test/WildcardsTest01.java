package maratonajava.javacore.ZGenerics.test;

import maratonajava.javacore.ZGenerics.dominio.Animal;
import maratonajava.javacore.ZGenerics.dominio.Cachorro;
import maratonajava.javacore.ZGenerics.dominio.Gato;

public class WildcardsTest01 {
    public static void main(String[] args) {
        Cachorro[] cachorros = {new Cachorro(),new Cachorro()};
        Gato[] gatos = {new Gato(),new Gato()};
        Animal[] animals = {new Gato(),new Cachorro()};
        leitorAnimal(gatos);
        System.out.println("--------");
        leitorAnimal(cachorros);
        System.out.println("------");
        leitorAnimal(animals);
    }

    public static void leitorAnimal(Animal[] animals){
        for (Animal animal : animals) {
            animal.consulta();
        }
    }
}

