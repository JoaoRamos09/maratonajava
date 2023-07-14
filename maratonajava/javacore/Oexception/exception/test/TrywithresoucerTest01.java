package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import academy.devdojo.maratonajava.javacore.Oexception.dominio.Leitor1;
import academy.devdojo.maratonajava.javacore.Oexception.dominio.Leitor2;

import java.io.*;

public class TrywithresoucerTest01 {
    public static void main(String[] args) {
        leitorArquivo();
    }

    public static void leitorArquivo(){
        try(Leitor1 leitor1 = new Leitor1();
            Leitor2 leitor2 = new Leitor2()){

        }catch(IOException e){
        }
    }

    public static void leitorArquivo2(){
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("teste.txt"));

        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            try{
            reader.close();
        }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
