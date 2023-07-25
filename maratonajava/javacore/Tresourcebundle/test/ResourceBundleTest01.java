package academy.devdojo.maratonajava.javacore.Tresourcebundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {
    public static void main(String[] args) {
        ResourceBundle bundle = ResourceBundle.getBundle("mensagem",new Locale("pt","BR"));
        System.out.println(bundle.getString("yellow"));
        System.out.println(bundle.getString("green"));


    }
}
