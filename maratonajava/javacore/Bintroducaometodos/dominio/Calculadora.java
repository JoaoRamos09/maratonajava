package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {
    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtraiuDoisNumeros() {
        System.out.println(10 - 9);
    }

    public void multiplicaDoisNumeros(int num1, int num2) {    //parametros   | nao colocar mais de 3 parametros pois ela fará mt coisa
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double num1, double num2) {
        if (num2 == 0) {         //existem varias maneiras de fazer este codigo, cabe a escolha do programador
            return 0;
        }
        return num1 / num2;
    }

    public void divideDoisNumeros2(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Não é possível imprimir número com 0");
        } else {
            System.out.println(num1 / num2);
        }
    }

    public void divideDoisNumeros3(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Não é possível imprimir número com 0");
            return;
        }
        System.out.println(num1 / num2);
    }

    public void AlteraDoisNumeros(int num1, int num2) {
        num1 = 25;
        num2 = 26;
        System.out.println("Dentro do Altera dois numeros");
        System.out.println(num1);
        System.out.println(num2);
    }

    public void somaArray(int[] numeros) {
        int soma = 0;
        for (int aux : numeros) {
            soma += aux;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int... numeros){           // o varargs deve ser sempre o ultimo parametro
        int soma = 0;
        for (int aux : numeros) {
            soma += aux;
        }
        System.out.println(soma);

    }
}