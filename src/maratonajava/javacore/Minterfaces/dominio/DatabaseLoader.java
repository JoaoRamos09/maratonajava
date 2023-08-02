package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public class DatabaseLoader implements DataLoader, RemoveLoader {
    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do banco de dados");
    }

    public static void Test(){
        System.out.println("Dentro do DatabaseLoader");
    }
}
