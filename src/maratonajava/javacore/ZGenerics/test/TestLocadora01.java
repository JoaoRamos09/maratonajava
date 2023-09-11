package maratonajava.javacore.ZGenerics.test;

import maratonajava.javacore.Ycollections.dominio.Pessoa;
import maratonajava.javacore.ZGenerics.dominio.Barco;
import maratonajava.javacore.ZGenerics.dominio.Carro;
import maratonajava.javacore.ZGenerics.dominio.Veiculo;
import maratonajava.javacore.ZGenerics.service.LocadoradeVeiculos;

import java.util.ArrayList;
import java.util.List;

public class TestLocadora01 {
    public static void main(String[] args) {
        List<Carro> carroList = new ArrayList<>(List.of(new Carro("Uno"),new Carro("Gol")));
        List<Barco> barcoList = new ArrayList<>(List.of(new Barco("Lancha"),new Barco("Iate")));
        List<Veiculo> veiculosList = new ArrayList<>(List.of(new Carro("Carro"), new Barco("Iate")));
        List<Pessoa> pessoaList = new ArrayList<>(List.of(new Pessoa("João"),new Pessoa("Kleber")));

        LocadoradeVeiculos<Carro> locadoradeCarros = new LocadoradeVeiculos<Carro>();
        Carro carro = locadoradeCarros.alugandoVeiculo(carroList);
        System.out.println("-----------------");
        locadoradeCarros.devolvendoVeiculo(carroList,carro);
        System.out.println("----------------");

        LocadoradeVeiculos<Barco> barcoLocadoradeCarros = new LocadoradeVeiculos<Barco>();
        Barco barco = barcoLocadoradeCarros.alugandoVeiculo(barcoList);
        System.out.println("------------");
        barcoLocadoradeCarros.devolvendoVeiculo(barcoList,barco);
        System.out.println("----------------------");

    }
}
