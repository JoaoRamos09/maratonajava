package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.src.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.src.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.src.maratonajava.javacore.Npolimorfismo.dominio.Televisão;
import academy.devdojo.src.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.src.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Tomate tomate = new Tomate("Tomatinho",5);
        tomate.setDataDeValide(2000);
        Computador computador = new Computador("AMF2G",2000);
        computador.setValidade(1000);
        Produto produto = new Tomate("Teste123",2000);
        



        CalculadoraImposto.CalcularImposto(tomate);
        System.out.println("---------------");
        CalculadoraImposto.CalcularImposto(computador);
        System.out.println("----------------");
        CalculadoraImposto.CalcularImposto(produto);



    }
}
