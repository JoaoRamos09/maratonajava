package maratonajava.javacore.ZZBparametrizandocomportamentos.test;

import maratonajava.javacore.ZZBparametrizandocomportamentos.dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ParametrizarComportamentoTest01 {

    static List<Car> list = new ArrayList<>(
            List.of(
                    new Car("Audi","azul",1985),
                    new Car("Audi","azul",1999),
                    new Car("Audi","azul",2001),
                    new Car("Audi","vermelho",2005),
                    new Car("Audi","rosa",2010)));
    public static void main(String[] args) {
        List<Car> listFiltredColor =  listFilterByColor(list,"azul");
        List<Car> listFitlredYear =  listFilterByYear(list,2010);

        printList(listFiltredColor);
        System.out.println("---------");
        printList(listFitlredYear);
    }

    public static List<Car> listFilterByColor(List<Car> list,String color){
        List<Car> listFilter = new ArrayList<>();
        for (Car car : list){
            if (car.getColor().equals(color)){
                listFilter.add(car);
            }
        }
        return listFilter;
    }

    public static List<Car> listFilterByYear(List<Car> list,int year){
        List<Car> listFilter = new ArrayList<>();
        for (Car car : list){
            if (car.getYear() < year){
                listFilter.add(car);
            }
        }
        return listFilter;
    }

    public static  void printList(List<Car> list){
        for(Car car : list)
            System.out.println(car);
        }
    }

