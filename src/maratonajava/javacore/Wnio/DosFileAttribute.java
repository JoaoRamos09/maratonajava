package academy.devdojo.src.maratonajava.javacore.Wnio;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;

public class DosFileAttribute {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("pasta");
        Files.createDirectories(path);

        Path path1 = Paths.get(path.toString(),"arquivo.txt");
        if (Files.notExists(path1)) Files.createFile(path1);

        DosFileAttributes dosFileAttribute = Files.readAttributes(path1,DosFileAttributes.class);
        System.out.println(dosFileAttribute.isHidden());
        System.out.println(dosFileAttribute.isReadOnly());

        DosFileAttributeView dosFileAttributeView = Files.getFileAttributeView(path1,DosFileAttributeView.class);
        dosFileAttributeView.setHidden(true);
        dosFileAttributeView.setReadOnly(true);

        System.out.println(dosFileAttributeView.readAttributes().isReadOnly());
        System.out.println(dosFileAttributeView.readAttributes().isHidden());
    }
}
