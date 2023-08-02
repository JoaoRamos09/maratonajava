package academy.devdojo.maratonajava.javacore.Uregex.test;

public class ScannerTest01 {
    public static void main(String[] args) {
        String texto = "isfjsifs, sdijfisfd, 434242";
        String[] textosDivididos = texto.split(",");
        for (String textosDividido : textosDivididos) {
            System.out.println(textosDividido.trim());

        }

    }
}
