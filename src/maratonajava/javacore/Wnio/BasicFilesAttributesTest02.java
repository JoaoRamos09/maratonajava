package academy.devdojo.src.maratonajava.javacore.Wnio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class BasicFilesAttributesTest02 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("home/joao/tururu.txt");
        BasicFileAttributes basicFileAttributes = Files.readAttributes(path,BasicFileAttributes.class);
        FileTime fileTime = basicFileAttributes.creationTime();
        FileTime fileTime1 = basicFileAttributes.lastModifiedTime();
        FileTime fileTime2 = basicFileAttributes.lastAccessTime();

        System.out.println(fileTime);
        System.out.println(fileTime1);
        System.out.println(fileTime2);

        BasicFileAttributeView basicFileAttributeView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
        fileTime = basicFileAttributeView.readAttributes().creationTime();                               // tem que ler dnv o arquivo
        fileTime1 = basicFileAttributeView.readAttributes().lastModifiedTime();
        fileTime = basicFileAttributeView.readAttributes().lastAccessTime();

        System.out.println(fileTime);
        System.out.println(fileTime1);
        System.out.println(fileTime2);


    }
}
