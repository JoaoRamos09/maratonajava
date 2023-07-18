package academy.devdojo.maratonajava.javacore.SFormatacao.test;

import java.text.ParseException;
import java.util.Locale;

public class NumberFormat2 {
    public static void main(String[] args) throws ParseException {
        java.text.NumberFormat test[] = new java.text.NumberFormat[4];
        java.text.NumberFormat teste1 = java.text.NumberFormat.getInstance();
        Locale local = new Locale("PT","BR");
        test[0] = java.text.NumberFormat.getCurrencyInstance();
        test[1] = java.text.NumberFormat.getCurrencyInstance(Locale.CHINA);
        test[2] = java.text.NumberFormat.getCurrencyInstance(Locale.ENGLISH);
        test[3] = java.text.NumberFormat.getCurrencyInstance(local);
        double num = 1313131.2000;
        String numero = "R$ 1.313.131,20";

        for (java.text.NumberFormat numberFormat : test) {
            numberFormat.setMaximumFractionDigits(2);
            System.out.println(numberFormat.format(num));

        }

        System.out.println(test[0].parse(numero));              // o parse tem que ser feito da moeda da mesma formatação pre definida

    }
}
