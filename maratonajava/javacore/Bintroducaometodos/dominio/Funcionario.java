package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {

    public String nome;
    public int idade;
    public int[] salario;

    public void imprimeDados() {
        System.out.println(this.nome);
        System.out.println(this.idade);

        int ax = 0;
        if (salario == null) {
            return;
        }
        for (int n : salario) {
            ax++;
            System.out.println("Salaiorio " + ax + ": " + n);
        }
        System.out.println("-------------------");
        mediaSalario();
    }

    public void mediaSalario(){
        if (salario==null){
            return;
        }
        int resultado = 0;
        int soma = 0;
        for (int n: salario){
            soma += n;
        }
        resultado = soma/salario.length;
        System.out.println("A média é "+resultado);
    }

}
