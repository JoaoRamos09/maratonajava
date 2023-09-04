package maratonajava.javacore.Npolimorfismo.dominio;

public class Televisão extends Produto{
    public static final double IMPOSTO_POR_PRODUTO = 0.25;
    public Televisão(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double CalcularImposto() {
        System.out.println("Calculando Imposto da Televisão");  // vai ser iniciado o metodo quando ele foi atribuido a uma variavel
        return this.valor*IMPOSTO_POR_PRODUTO;
    }
}
