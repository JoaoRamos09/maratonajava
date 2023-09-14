package maratonajava.javacore.ZZBparametrizandocomportamentos.test;

import maratonajava.javacore.ZZBparametrizandocomportamentos.dominio.Car;
import maratonajava.javacore.ZZBparametrizandocomportamentos.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ParametrizarComportamentoTest02 {

    static List<Car> list = new ArrayList<>(
            List.of(
                    new Car("Audi","azul",1985),
                    new Car("Audi","azul",1999),
                    new Car("Audi","azul",2001),
                    new Car("Audi","vermelho",2005),
                    new Car("Audi","rosa",2010)));
    public static void main(String[] args) {
        // é possível criar um filtro utilizando uma classe anonima e o polimorfismo
       List<Car> list1 = listFilter(list, new CarPredicate() {
            @Override
            public boolean test(Car car) {
                return car.getColor().equals("rosa");
            }
        });
       
       
       printList(list1);
       List<Integer> integerList = List.of(1,2,3,4,5,6);
       List<Integer> integerList1 = filter(integerList, integer -> integer % 2 == 0);
       printList(integerList1);
       
       List<Integer> integerList2 = filter(integerList,numerous -> numerous % 2 == 0);
    }
    public static List<Car> listFilter(List<Car> list, CarPredicate carPredicate){
        List<Car> listFilter = new ArrayList<>();
        for (Car car : list){
            if (carPredicate.test(car)){
                listFilter.add(car);
            }
        }
        return listFilter;
    }

    public static <T> List<T> filter(List<T> list, Predicate<T> filter){
        List<T> listFilter = new ArrayList<>();
        for (T e : list){
            if (filter.test(e)){
                listFilter.add(e);
            }
        }
        return listFilter;
    }

    public static <T> void printList(List<T> list){
        for(T e : list)
            System.out.println(e);
        }
    }

