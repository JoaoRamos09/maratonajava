package academy.devdojo.src.maratonajava.javacore.Wnio;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicFilesAtributtes {
    public static void main(String[] args) throws IOException {
        LocalDateTime localDateTime = LocalDateTime.now().minusDays(10);
        File file = new File("home/joao/ababado.txt");
        boolean newFile = file.createNewFile();
        boolean t = file.setLastModified(localDateTime.toInstant(ZoneOffset.UTC).getEpochSecond());

        Path path = Paths.get("home/joao/tururu.txt");
        Path path1 = Files.createFile(path);
        FileTime fileTime = FileTime.from(localDateTime.toInstant(ZoneOffset.UTC));
        Path path2 = Files.setLastModifiedTime(path,fileTime);

        System.out.println(Files.isReadable(path1));
        System.out.println(Files.isWritable(path1));
        System.out.println(Files.isExecutable(path1));



    }
}
