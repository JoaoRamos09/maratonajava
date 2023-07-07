package academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio;

public class Gerente extends Funcionario{

    public Gerente(char sexo, double salario, String nome) {
        super(sexo, salario, nome);
    }

    @Override
    public void calcularBonus() {
        this.salario = this.salario + this.salario * 0.2;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "salario=" + salario +
                ", nome='" + nome + '\'' +
                '}';
    }

    @Override
    public void imprime() {

    }
}
