package academy.devdojo.src.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.src.maratonajava.javacore.Npolimorfismo.dominio.*;
import academy.devdojo.src.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

import java.lang.annotation.Target;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador1 = new Computador("Samsung", 2500);
        Tomate tomate1 = new Tomate("Cereja", 5);
        Televisão televisao1 = new Televisão("Samsung 50\" ", 8000);
        CalculadoraImposto.CalcularImposto(computador1);
        System.out.println("-----------------------");
        CalculadoraImposto.CalcularImposto(tomate1);
        System.out.println("------------------------");
        CalculadoraImposto.CalcularImposto(televisao1);

        Taxavel taxavel = new Computador("carlos",24);
        taxavel.CalcularImposto();
        }
}
