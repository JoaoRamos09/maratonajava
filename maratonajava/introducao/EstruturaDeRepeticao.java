package academy.devdojo.maratonajava.introducao;

public class EstruturaDeRepeticao {
    public static void main(String[] args) {
        // while
        int count = 0;
        while (count < 10) {
            count++;
            System.out.println(count);
        }
        count = 0;

        // do while
        do {
            count++;
            System.out.println("Dentro do do while " + count);
        } while (count < 10);

        // for

        for (int i = 0; i < 10; i++) {
            System.out.println("for " + i);
        }

        for (int j = 0; j <= 1000000; j++) {
            if (j % 2 == 0) {
                System.out.println(j);
            }
        }

        // break

        for (int a = 0; a < 50; a++) {
            System.out.println(a);
            if (a == 25) {
                break;
            }
        }

        int valorCarro = 40000;
        int valorMaxParcela = 1000;

       for (int i = 1; i <= valorCarro; i++) {
            double valorParcela = valorCarro / i;
            if (valorParcela < valorMaxParcela) {
                break;
            }
            System.out.println("O valor da parcela é de " + valorParcela + " em " + i + "X");
        }
        System.out.println("--------------------------------");
        // continue

        int valorCarro1 = 40000;
        int valorMaxParcela1 = 1000;

        for (int o = valorCarro1; o >=1; o--) {
            double valorParcela1 = valorCarro1/o;
            if(valorParcela1<1000){
                continue;
            }
            System.out.println("O valor da parcela é de "+ valorParcela1+ " em "+ o + "X");

        }
    }
}


