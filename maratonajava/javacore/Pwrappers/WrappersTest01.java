package academy.devdojo.maratonajava.javacore.Pwrappers;

import java.sql.SQLOutput;

public class WrappersTest01 {
    public static void main(String[] args) {
        int intP = 2;
        double doubleP = 2.0;
        char charP = 'M';


        Integer intW = 255555555;  //autoboxing
        Double doubleW = 2.5;
        Character charW = 'M';

        String myString = intW.toString();
        System.out.println(myString.length());

        int i = intW;      //unboxing
        System.out.println(intW.toString());

        System.out.println(doubleW.intValue());
    }
}
