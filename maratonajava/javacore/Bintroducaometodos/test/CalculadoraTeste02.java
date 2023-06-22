package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste02 {
    public static void main(String[] args) {


        Calculadora calculadora = new Calculadora();
        int num1 = 10;
        int num2 = 20;

        calculadora.AlteraDoisNumeros(num1, num2);

        System.out.println("-----------------------------");
        System.out.println("Fora do altera dois numeros");
        System.out.println(num1);
        System.out.println(num2);
    }
}
