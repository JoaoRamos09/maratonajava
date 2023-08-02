package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import academy.devdojo.maratonajava.javacore.Minterfaces.dominio.FileLoader;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        criarNovoArquivo();
    }

    public static void criarNovoArquivo() {                                    //exception do tipo exception sao obrigadas a serem tratadas.
        File file = new File("arquivo\\test.txt");
        try {
            file.createNewFile();
        }catch(IOException e){                        //SEMPRE COLOCAR ALGO NO CATCH!!
            e.printStackTrace();
            }
        }
    }
