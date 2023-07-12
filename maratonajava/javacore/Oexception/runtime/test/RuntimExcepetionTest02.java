package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RuntimExcepetionTest02 {
    public static void main(String[] args) {
        divisao(20,0);
    }                              //exception runtime n é obrigado tratar, mas pode dar b.o pois ela pode acontecer
    public static double divisao(double a, double b) {
        if (b == 0) {
            throw new  IllegalArgumentException("Argumento ilegal, não pode ser zero");
        }
        return a / b;
    }
}
