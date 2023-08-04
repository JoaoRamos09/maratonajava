package maratonajava.javacore.Vio;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class FileDiretorio {
    public static void main(String[] args) throws IOException {

        File file = new File("arquivo");
        boolean diretorioCraido = file.mkdir();
        System.out.println(diretorioCraido);

        File file1 = new File(file, "file.txt");
        boolean arquivocCriado = file1.createNewFile();
        System.out.println(arquivocCriado);

        File file2 = new File(file, "arquivorenomeado.txt");
        boolean arquivoRenomeado = file1.renameTo(file2);
        System.out.println(arquivoRenomeado);

        File file3 = new File("diretoriorenomeado");
        boolean diretorioRenomeado = file.renameTo(file3);
        System.out.println(diretorioRenomeado);

        File[] files = file.listFiles();
        for (File file4 : files) {
            System.out.println(file4.getName());

        }


    }
}
