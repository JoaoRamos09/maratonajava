package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Pedreiro {

    private int idade;
    private String nome;

    public void imprime(){
        System.out.println(this.idade);
        System.out.println(this.nome);
    }

    public void setIdade(int idade){
        if (idade < 0){
            System.out.println("Idade Invalida");
            return;
        }
        else{
            this.idade = idade;
        }
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return  this.idade;
    }

    public String getNome(){
        return this.nome;
    }
}

