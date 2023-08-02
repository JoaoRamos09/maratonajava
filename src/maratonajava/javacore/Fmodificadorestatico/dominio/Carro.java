package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
   private static double velocidadeLimite = 250;


    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public static void setVelocidadeLimite(double velocidadeLimite){
        Carro.velocidadeLimite = velocidadeLimite;
    }

    public static double getVelocidadeLimite(){
        return Carro.velocidadeLimite;
    }      // n é possivel utilizar o this dentro de um metodo static, pois n se sabe se terá um objeto ou nao

    public void imprime(){
        System.out.println("Nome "+this.nome);
        System.out.println("Velocidade Maxima "+this.velocidadeMaxima);
        System.out.println("Velocidade Limite "+ Carro.velocidadeLimite);
        System.out.println("-----------------------------");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
}
