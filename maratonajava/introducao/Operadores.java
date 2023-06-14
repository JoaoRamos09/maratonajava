package academy.devdojo.maratonajava.introducao;

public class Operadores {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        System.out.println(num1 - num2);
        System.out.println(num1 + num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);

        int resto = 21 % 7;
        System.out.println(resto);

        // <, >, <=, >=, ==, !=

        boolean isDezMaiorQueVinte = 10 > 20;
        System.out.println(isDezMaiorQueVinte);
        boolean isDezMenorQueVinte = 10 < 20;


        // and (&&), or ||, negation !

        int age = 35;
        float salario = 3500f;
        boolean isDentroDaLeiMaiorQueTrinta = age > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = age < 30 && salario >= 3381;
        System.out.println(isDentroDaLeiMenorQueTrinta);
        System.out.println(isDentroDaLeiMaiorQueTrinta);

        float salariop = 3000f;
        float poupanca = 5000f;
        int valorplay = 300;
        boolean comprar = salariop > valorplay || poupanca > valorplay;
        System.out.println(comprar);

        // =, +=, -=, *=, /=, %=

        int bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %=2;
        System.out.println(bonus);

        // contador

        int contador = 0;
        contador += 1;
        contador++;

        System.out.println(contador);

    }
}
