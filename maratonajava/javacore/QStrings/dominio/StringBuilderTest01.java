package academy.devdojo.maratonajava.javacore.QStrings.dominio;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "João";
        nome.concat(" Vitor");                    // so vai imprimir se tiver uma variavel de refencia para o concat
        System.out.println(nome);

        StringBuilder stringBuilder = new StringBuilder("Joao");
        stringBuilder.substring(2,3);                        // ficar atento ao retorno do metodo, se for string n irá alterar a stringbuilder
        stringBuilder.append(" Ramos");
        stringBuilder.reverse();
        stringBuilder.delete(1,2);
        System.out.println(stringBuilder);
    }
}
