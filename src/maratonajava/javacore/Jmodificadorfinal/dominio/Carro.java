package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio;

public class Carro {                          //colocando public final class n é possível extender a classe
    protected String nome;

    public final  Comprador COMPRADOR = new Comprador();

    public static final double VELOCIDADE_LIMITE = 250;  //quando se declara uma variavel com modificador final n é possível mais alterar o seu valor


    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public Carro(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        System.out.println("Dentro do método carro");
        this.nome = nome;
    }
}



