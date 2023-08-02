package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import academy.devdojo.maratonajava.javacore.Oexception.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Oexception.dominio.LoginInvalidionException;
import academy.devdojo.maratonajava.javacore.Oexception.dominio.Pessoa;

import java.io.FileNotFoundException;
import java.io.IOException;

public class SobreescritaException {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        Funcionario funcionario = new Funcionario();
        try {
            funcionario.salvar();
        } catch (FileNotFoundException | LoginInvalidionException e) {
            e.printStackTrace();
        }
        try {
            pessoa1.salvar();
        } catch (LoginInvalidionException | IOException e) {
            e.printStackTrace();
        }
    }
}
