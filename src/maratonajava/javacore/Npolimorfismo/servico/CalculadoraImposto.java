package maratonajava.javacore.Npolimorfismo.servico;

import maratonajava.javacore.Npolimorfismo.dominio.Computador;
import maratonajava.javacore.Npolimorfismo.dominio.Produto;
import maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {

    public static void CalcularImposto(Produto produto) {
        double imposto = produto.CalcularImposto();
        System.out.println("Relatorio de imposto " + produto.getNome());
        System.out.println("Nome do Tomate: " + produto.getNome());
        System.out.println("Valor: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
        if (produto instanceof Tomate){
        Tomate tomate = (Tomate) produto;
            System.out.println(tomate.getDataDeValide());
    }
        else if (produto instanceof Computador) {
            Computador computador = (Computador) produto;
            System.out.println(computador.getValidade());
        }
        else System.out.println("teste"); return;

        }
    }