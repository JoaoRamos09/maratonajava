package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Estudante {                          //atributos da classe

    public String nome;
    public int idade;
    public char sexo;

    public void imprimir(){
        System.out.println(this.nome);
        System.out.println(this.sexo);
        System.out.println(this.idade);
    }
}
