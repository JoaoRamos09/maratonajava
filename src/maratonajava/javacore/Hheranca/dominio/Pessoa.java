package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class Pessoa{
    protected String nome;                           //variavel com protectd dá acesso publico das variaveis de pessoa para outras classes que tenha um objeto pessoa e que estejam no mesmo pacote de pessoa
    protected String cpf;                             // variavel com protect da acesso publico as variaveis que para as subclasses de pessoa
    protected Endereco endereco;

    static{
        System.out.println("Dentro do bloco de inicilização estatico de pessoa");
    }
    {
        System.out.println("Dentro do bloco de inicilização normal de pessoa");
    }


    public Pessoa(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
        System.out.println("Dentro do construtor de pessoa");
    }


    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(endereco.getCep());
        System.out.println(endereco.getRua());
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
