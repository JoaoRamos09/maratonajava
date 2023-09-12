package maratonajava.javacore.ZZAinternclass.test;

import maratonajava.javacore.ZGenerics.dominio.Carro;

import java.util.Comparator;

class Anonymus{
    void imprimealgo(){
        System.out.println("Joao Fodao");
    }
}
public class AnonymusClassTest01 {

    public static void main(String[] args) {
        Anonymus anonymus1 = new Anonymus();
        Anonymus anonymus = new Anonymus(){
            @Override
            void imprimealgo() {
                System.out.println("Joao n é fodao");
            }
        };
        anonymus.imprimealgo();
        anonymus1.imprimealgo();
    }
}
