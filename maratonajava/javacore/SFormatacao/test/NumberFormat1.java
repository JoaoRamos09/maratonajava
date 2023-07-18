package academy.devdojo.maratonajava.javacore.SFormatacao.test;

import java.text.ParseException;
import java.util.Locale;

public class NumberFormat1 {
    public static void main(String[] args) throws ParseException {
        java.text.NumberFormat test[] = new java.text.NumberFormat[4];
        java.text.NumberFormat teste1 = java.text.NumberFormat.getInstance();
        Locale local = new Locale("PT","BR");
        test[0] = java.text.NumberFormat.getInstance();
        test[1] = java.text.NumberFormat.getInstance(Locale.CHINA);
        test[2] = java.text.NumberFormat.getInstance(Locale.ENGLISH);
        test[3] = java.text.NumberFormat.getInstance(local);
        double num = 10_000.03131;
        String numero = "1313131.2000";
        Double double1 = Double.parseDouble(numero);

        for (java.text.NumberFormat numberFormat : test) {
            numberFormat.setMaximumFractionDigits(2);
            System.out.println(numberFormat.format(num));

        }

        System.out.println(test[0].parse(numero));

    }
}
