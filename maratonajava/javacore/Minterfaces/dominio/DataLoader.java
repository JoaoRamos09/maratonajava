package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public interface DataLoader {

    void load();

    default void check(){
        System.out.println("Chegar arquivo");
    }
}
