package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Pessoa {
    private static int idade;
    private static String nome;



    public void imprime(){
        System.out.println(Pessoa.idade);
        System.out.println(Pessoa.nome);
    }
    public static int getIdade() {
        return Pessoa.idade;
    }

    public static void setIdade(int idade) {
        Pessoa.idade = idade;
    }

    public static String getNome() {
        return nome;
    }

    public static void setNome(String nome) {
        Pessoa.nome = nome;
    }
}
