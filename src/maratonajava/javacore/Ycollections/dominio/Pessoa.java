package academy.devdojo.src.maratonajava.javacore.Ycollections.dominio;

public class Pessoa{

     String nome;
    private String sobrenome;

    public Pessoa(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(this == obj) return true;
        if(this.getClass() != obj.getClass()) return false;
        Pessoa pessoa = (Pessoa) obj;
        return nome != null && this.nome.equals(pessoa.nome);
    }

    @Override
    public int hashCode() {
        if (this.nome == null) return 0;
        return this.nome.hashCode();
    }
}
