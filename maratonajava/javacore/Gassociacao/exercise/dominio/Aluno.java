package academy.devdojo.maratonajava.javacore.Gassociacao.exercise.dominio;

public class Aluno {
    private String nome;
    private int idade;

    private Seminario seminario;

    public Seminario getSeminario() {
        return seminario;
    }

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.seminario = seminario;
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(seminario.getTitulo());
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}
