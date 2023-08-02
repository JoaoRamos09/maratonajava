package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {
        // \d = retorna todos os digitos
        // \D = tudo o q n é digito
        // \s = todos os espaços em branco  \t \f \n \r
        // \S = todos os caracteres menos os em branco
        // \w = a-z, A-Z, digitos e _
        // \W = tudo o q n estiver no w, !,@,#, espaço em branco
        // []
        // ? zero ou uma
        // * zero ou mais
        // + uma ou mais
        // {n,m} de n ate m
        // ()
        // | ou
        // $ fim da linha
        // . tudo o q estiver entre 2 caracteres ex 1@3 = @

        String texto = "joao@hotmail.com, 123joao@gmail.com.br, joao12321@bol.com, joao@gmail,@#@joao@jgmail.com";                                 // assim que identificar o padrão os indices serão pulados caso tenha outro padrão reconhecido
        String regex = "[\\w]+@([\\w])+(\\.([\\w])+)+";
        System.out.println("@#joao12321@bol.com".matches(regex));
        System.out.println(texto.split(", ")[1].trim());
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
