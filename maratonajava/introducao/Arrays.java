package academy.devdojo.maratonajava.introducao;

public class Arrays {
    public static void main(String[] args) {
        int[] idades = new int[3];
        idades[0] = 1;
        idades[1] = 2;
        idades[2] = 3;
        System.out.println(idades[1]);

        int[] idade = new int[3];
        idade[0] = 1;
        idade[1] = 2;
        idade[2] = 3;
        System.out.println("Teste");

        for (int i = 0; i < idade.length; i++) {
            System.out.println(idade[i]);
        }
    }
}
