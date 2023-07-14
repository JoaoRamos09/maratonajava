package academy.devdojo.maratonajava.javacore.QStrings.dominio;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = "Joao";
        String nome1 = "   Pedro";
        System.out.println(nome.charAt(2));   // retorna o indice indicado da String
        System.out.println(nome.replace("J","P"));    //substitui todos o caracter antigo por um novo
        System.out.println(nome.length());
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());
        System.out.println(nome.substring(0,2));
        System.out.println(nome.substring(0,nome.length()));
        System.out.println(nome1.trim());  //limpa


    }
}
