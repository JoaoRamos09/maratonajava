package academy.devdojo.maratonajava.introducao;

public class Arrays {
    public static void main(String[] args) {
        int[] idades = new int[3];           //modo de iniciar um array tipo 3
        idades[0] = 1;
        idades[1] = 2;
        idades[2] = 3;
        System.out.println(idades[1]);

        int[] idade = new int[3];
        idade[0] = 1;
        idade[1] = 2;
        idade[2] = 3;

        for (int i = 0; i < idade.length; i++) {
            System.out.println(idade[i]);
        }

        // foreach

        int[] numeros = {1, 2, 3, 4, 5};           // modo de iniciar um array tipo 1;
        int[] numeros2 = new int[]{1, 2, 3, 4, 5};  // modo de iniciar um array tipo 2;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        for (int n : numeros2) {
            System.out.println(n);
        }

        // array multidimensional

        int[][] num = new int[3][3];

        num[0][0] = 1;
        num[0][1] = 2;
        num[0][2] = 3;

        num[1][0] = 5;
        num[1][1] = 6;
        num[1][2] = 7;

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.println(num[i][j]);
            }
        }

        for (int[]arraybase:num) {
            for (int arraytop:arraybase) {
                System.out.println(arraytop);
            }
        }

        int array2[][] = {{1,2,3} ,{1,2,4,5} , {1,2,3,4,5,}};  // maneiras de inicializar o array

        int array3[][] = new int[3][];          //maneiras de inicializar o array
        int array4[][] = new int[3][];
        array3[0] = new int[2];
        array3[1] = new int[6];
        array3[2] = new int[7];


        array4[0] = new int[]{1,2,3,4};            //maneiras de inicializar o array
        array4[1] = new int[]{1,2,4};
        array4[2] = new int[]{1,2};


    }

}
