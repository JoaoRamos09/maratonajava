package academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio;

public abstract class Funcionario extends Pessoa{
    protected double salario;
    protected String nome;

    public Funcionario(char sexo, double salario, String nome) {
        super(sexo);
        this.salario = salario;
        this.nome = nome;
    }

    public abstract void calcularBonus();
}
