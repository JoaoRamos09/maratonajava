package maratonajava.javacore.Wnio;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTest02 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("pasta");                // é preciso verificar se o arquivo n existe, se n lança exception
        if (Files.notExists(path)) {
            Path path1 = Files.createDirectory(path);
        }

        Path path2 = Paths.get("pasta2/subbasta/subsubpasta");          // n precisa verificar se o arquivo existe
        Path path3 = Files.createDirectories(path2);

        Path path4 = Paths.get(path2.toString(), "texto.txt");             // precisa verificar se o arquivo n existe
        if (Files.notExists(path4)) {
            Path path5 = Files.createFile(path4);
        }

        Path path6 = path4;                                       //copiando um arquivo e renomeando ele, n sendo necessario verificar se ele existe e passando tudo que contém nele para a copia
        Path path7 = Paths.get(path4.getParent().toString(),"renomeado.txt");
        Path path8 = Files.copy(path6,path7, StandardCopyOption.REPLACE_EXISTING);
    }
}
