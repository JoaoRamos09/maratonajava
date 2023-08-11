package academy.devdojo.src.maratonajava.javacore.Npolimorfismo.dominio;

public class Computador extends Produto{

    private int validade;
    public static final double IMPOSTO_POR_PRODUTO = 0.25;
    public Computador(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double CalcularImposto() {
        System.out.println("Calculando Imposto do Computador"); //// vai ser iniciado o metodo quando ele foi atribuido a uma variavel
        return this.valor*IMPOSTO_POR_PRODUTO;
    }

    public int getValidade() {
        return validade;
    }

    public void setValidade(int validade) {
        this.validade = validade;
    }
}
