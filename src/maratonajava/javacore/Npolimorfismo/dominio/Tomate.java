package academy.devdojo.src.maratonajava.javacore.Npolimorfismo.dominio;

import javax.swing.*;

public class Tomate extends Produto{
    private int dataDeValide;         //essa variavel nunca poderá ser chamada pois estou iniciando o objeto como Produto
    public static final double IMPOSTO_POR_PRODUTO = 0.21;
    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double CalcularImposto() {
        System.out.println("Calculando Imposto do Tomate");  // vai ser iniciado o metodo quando ele foi atribuido a uma variavel
        return this.valor*IMPOSTO_POR_PRODUTO;
    }

    public int getDataDeValide() {
        return dataDeValide;
    }

    public void setDataDeValide(int dataDeValide) {
        this.dataDeValide = dataDeValide;
    }
}
