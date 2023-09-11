package maratonajava.javacore.ZGenerics.exercise;

import maratonajava.javacore.Ycollections.dominio.Pessoa;
import maratonajava.javacore.ZGenerics.dominio.Animal;
import maratonajava.javacore.ZGenerics.dominio.Cachorro;
import maratonajava.javacore.ZGenerics.dominio.Gato;

import java.util.ArrayList;
import java.util.List;

public class Test01 {
    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<>(List.of(new Cachorro(), new Gato()));
        List<Animal> animalList1 = new ArrayList<>();
        List<Animal> animalList2 = new ArrayList<>();
        List<Cachorro> cachorroList = List.of(new Cachorro());
        List<Gato> gatoList = List.of(new Gato());
        List<Pessoa> pessoaList = List.of(new Pessoa());

        Animal animal = animalList.remove(0);
        System.out.println(animal);

        System.out.println("Lista de Animais");
        imprimelista(animalList);
        System.out.println("------------");

        System.out.println("Lista de Cachorro");
        imprimelista(cachorroList);
        System.out.println("--------------");

        System.out.println("Lista de Gato");
        imprimelista(gatoList);
        System.out.println("--------------");

        System.out.println("Nova Lista de Animais 01");        //com metodo
        addNaLista(animalList1,cachorroList);
        addNaLista(animalList1,gatoList);
        addNaLista(animalList1,animalList);
        imprimelista(animalList1);
        System.out.println("----------------");

        System.out.println("Nova Lista de Animais 02");          //sem metodo ( o addall espera um animal ou um extend animal )
        animalList2.addAll(cachorroList);
        animalList2.addAll(gatoList);
        animalList2.addAll(animalList);
        imprimelista(animalList2);



    }
    public static void imprimelista(List<? extends Animal> list){
        for (Animal animal : list) {
            animal.consulta();
        }
    }

    public static void addNaLista(List<? super Animal> novaList, List<? extends Animal> listAdd){
        novaList.addAll(listAdd);
    }
}
