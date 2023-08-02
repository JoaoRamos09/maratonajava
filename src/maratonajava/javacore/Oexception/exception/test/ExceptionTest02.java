package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {
    public static void main(String[] args) throws IOException{
        criarNovoArquivo();
    }

    public static void criarNovoArquivo() throws IOException{
        File file = new File("arquivo\\test.txt");
        try {
            file.createNewFile();
            System.out.println("Arquivo criado com sucesso");
        }catch(IOException e){                        //SEMPRE COLOCAR ALGO NO CATCH!!
            e.printStackTrace();
            throw e;
            }
        }
    }
