package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        calculadora.subtraiuDoisNumeros();
        calculadora.multiplicaDoisNumeros(15,20);   //argumentos
        double resultado = calculadora.divideDoisNumeros(50,0);
        System.out.println(resultado);
        calculadora.divideDoisNumeros2(5,0);
        calculadora.divideDoisNumeros3(5,0);

        // quando não se tem retorno não se coloca dentro do println ja que sera void
    }
}
