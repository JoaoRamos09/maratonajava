package maratonajava.javacore.Vio;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;

public class FileTest01 {
    public static void main(String[] args) {                      // n vai ficar recriando ou redeletando o arquivo
        File file = new File("file.txt");
        try {
            boolean created = file.createNewFile();
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isDirectory());
            System.out.println(file.isFile());
            System.out.println(file.isHidden());
            System.out.println(Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()));
            System.out.println(created);
            boolean exist = file.exists();
            if (exist){
                boolean delete = file.delete();
                System.out.println(delete);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
