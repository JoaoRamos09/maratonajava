package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa{                           // endereço > pessoa > funcionario
    private double salario;

    static{
        System.out.println("Dentro do bloco de inicilização estatico de funcionario");
    }
    {
        System.out.println("Dentro do bloco de inicialização normal de funcionario");
    }


    public Funcionario(String nome, String cpf) {
       super(nome,cpf);
        System.out.println("Dentro do construtor de funcionario");
    }


    public void imprime() {
        super.imprime();
        System.out.println(this.salario);
    }

    public void relatorio() {
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