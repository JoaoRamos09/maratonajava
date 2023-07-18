package academy.devdojo.maratonajava.javacore.QStrings.dominio;

public class StringTest03 {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatena(10_000);
        long fim = System.currentTimeMillis();
        long tempo = fim - inicio;
        System.out.println("Tempo de duração: " + tempo + " ms");

        long inicio1 = System.currentTimeMillis();
        concatenaStringBuilder(100_000);
        long fim1 = System.currentTimeMillis();
        long tempo1 = fim1 - inicio1;
        System.out.println("Tempo de duração StringBuilder: " + tempo1 + " ms");

        long inicio2 = System.currentTimeMillis();
        concatenaStringBBuffer(100_000);
        long fim2 = System.currentTimeMillis();
        long tempo2 = fim2 - inicio2;
        System.out.println("Tempo de duração StringBuffer: " + tempo2 + " ms");

    }

    public static void concatena(int tamanho) {
        String teste = "";
        for (int i = 0; i < tamanho; i++) {
            teste += i;
        }
    }

    public static void concatenaStringBuilder(int tamanho) {
        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }

    }

    public static void concatenaStringBBuffer(int tamanho) {
        StringBuffer BF = new StringBuffer(tamanho);
        for (int i = 0; i < tamanho; i++) {
            BF.append(i);
        }
    }
}
