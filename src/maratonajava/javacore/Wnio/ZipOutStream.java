package academy.devdojo.src.maratonajava.javacore.Wnio;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutStream {
    public static void main(String[] args) {
        Path filezipado = Paths.get("pasta/subpasta1/subpasta2");
        Path filezipador = Paths.get("pasta/arquivo.zip");

        zipfile(filezipado,filezipador);

    }

    private static void zipfile(Path filezipado, Path filezipador){
        try(ZipOutputStream zipOutputStream = new ZipOutputStream(Files.newOutputStream(filezipador));
            DirectoryStream<Path> directoryStream = Files.newDirectoryStream(filezipado)){
            for (Path path : directoryStream) {
                ZipEntry zipEntry = new ZipEntry(path.getFileName().toString());
                zipOutputStream.putNextEntry(zipEntry);
                Files.copy(path,zipOutputStream);
                zipOutputStream.close();
            }
    }
    catch (IOException e){
                e.printStackTrace();
            }
    }
}
