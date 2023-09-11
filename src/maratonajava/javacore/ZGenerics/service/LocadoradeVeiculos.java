package maratonajava.javacore.ZGenerics.service;

import maratonajava.javacore.ZGenerics.dominio.Veiculo;

import java.util.List;

public class LocadoradeVeiculos<T extends Veiculo> {           //so acc extensao de veiculo

    public T alugandoVeiculo(List<T> list){
        System.out.println("Veículos disponíveis: "+list);
        T t = list.remove(0);
        System.out.println("Veículo selecionado: "+t);
        System.out.println("Veículos disponíveis: "+list);
        return t;
    }

    public T devolvendoVeiculo(List<T> list, T t){
        System.out.println("Veículos em loja: "+list);
        System.out.println("Devolvendo o veículo: "+t);
        list.add(t);
        System.out.println("Veículos em loja: "+list);
        return t;
    }
}
