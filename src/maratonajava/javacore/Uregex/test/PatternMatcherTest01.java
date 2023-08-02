package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    public static void main(String[] args) {
        String texto = "abaaaaab";
        String texto2 = "abababa";                   // assim que identificar o padrão os indices serão pulados caso tenha outro padrão reconhecido
        String regex = "aba";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println(" texto: "+texto2);
        System.out.println("indice: "+"01234567");
        System.out.println("regex: "+regex);
        System.out.println("Posições encontradas");
        while (matcher.find()){
            System.out.print(matcher.start()+" ");
        }
    }
}
