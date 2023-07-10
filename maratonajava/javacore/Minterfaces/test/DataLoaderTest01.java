package academy.devdojo.maratonajava.javacore.Minterfaces.test;

import academy.devdojo.maratonajava.javacore.Minterfaces.dominio.DataLoader;
import academy.devdojo.maratonajava.javacore.Minterfaces.dominio.DatabaseLoader;
import academy.devdojo.maratonajava.javacore.Minterfaces.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader1 = new DatabaseLoader();
        FileLoader fileLoader1 = new FileLoader();
        databaseLoader1.load();
        fileLoader1.load();
        databaseLoader1.remove();
        fileLoader1.remove();
        DatabaseLoader.Test();
        DataLoader.Test();
    }
}
