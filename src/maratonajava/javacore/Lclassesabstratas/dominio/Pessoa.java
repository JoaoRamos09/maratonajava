package maratonajava.javacore.Lclassesabstratas.dominio;

public abstract class Pessoa {

    protected char sexo;

    public Pessoa(char sexo) {
        this.sexo = sexo;
    }

    public abstract void imprime();

    public void imprime1(){
        System.out.println("aaa");
    }
}
