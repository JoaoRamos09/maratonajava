package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Teclado;

import java.util.Scanner;

public class LeituraDoTeclado01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);                         // TESTE, BEM ERRADO O QUE FIZ KKK
        Teclado teclado = new Teclado();
        teclado.setScanner(entrada);
        teclado.imprime();





    }
}
