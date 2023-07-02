package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa {
    private double salario;


    public void imprime(){
        super.imprime();
        System.out.println(this.salario);
    }

    public void relatorio(){
        System.out.println(this.salario);
        System.out.println(this.cpf);                      // utiizando protectd na variavel ela se torna publica pra todos as subclasses e classes do mesmo pacote
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}