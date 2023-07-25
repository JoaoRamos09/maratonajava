package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        // \d = retorna todos os digitos
        // \D = tudo o q n é digito
        // \s = todos os espaços em branco  \t \f \n \r
        // \S = todos os caracteres menos os em branco
        // \w = a-z, A-Z, digitos e _
        // \W = tudo o q n estiver no w, !,@,#, espaço em branco

        String texto = "@@sf_oijsaf oisajfsio3242";                                // assim que identificar o padrão os indices serão pulados caso tenha outro padrão reconhecido
        String regex = "\\W";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println(" texto: "+texto);
        System.out.println("indice: "+"01234567");
        System.out.println("regex: "+regex);
        System.out.println("Posições encontradas");
        while (matcher.find()){
            System.out.print(matcher.start()+" "+matcher.group()+"\n");
        }
    }
}
