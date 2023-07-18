package academy.devdojo.maratonajava.javacore.SFormatacao.test;

import java.util.Locale;

public class LocaleTest02 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        String locais1[] = Locale.getISOCountries();
        String locais2[] = Locale.getISOLanguages();
        for (String s : locais2) {
            System.out.println(s);
        }
        for (String s : locais1) {
            System.out.print(" "+s);

        }


    }
}
