package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public interface DataLoader {

   // obriga a classe a ter este metodo
    void load();

    // metodos default não obrigaram a classe que for implementada a interface a ter o metodo
    default void check(){
        System.out.println("Chegar arquivo");
    }

    // n é possível sobrescrever metodos statics
    public static void Test(){
        System.out.println("Dentro do DataLoader");
    }

}
