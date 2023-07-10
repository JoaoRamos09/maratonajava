package academy.devdojo.maratonajava.javacore.Oexception.test;

public class StackOverFlow {
    public static void main(String[] args) {
        //carregarinfito();                              //errors geralmente nao tem o que fazer, a não ser mudar algo no codigo
    }
        public static void carregarinfito(){                //stackoverflow, ficará carregando inifinitamente
            carregarinfito();
        }
    }