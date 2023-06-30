package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

import java.util.Scanner;

public class Teclado {
    private String nome;
    private int idade;

    private Scanner scanner;


    public Scanner getScanner() {
        return scanner;
    }

    public void imprime(){
        System.out.println(" ");
        System.out.println("Meu nome é? "+this.nome);
        System.out.println("Minha idade é? "+this.idade);

    }

    public void setScannerNome(){
        System.out.println("Qual seu nome?");                                //TESTE BEM ERRADO O QUE FIZ
        this.nome = scanner.nextLine();
    }

    public void setScannerIdade() {
        System.out.println("Qual sua idade?");
        this.idade = scanner.nextInt();
    }
    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
        setScannerNome();
        setScannerIdade();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}


