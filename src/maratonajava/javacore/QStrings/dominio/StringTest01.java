package academy.devdojo.maratonajava.javacore.QStrings.dominio;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "João";
        String nome1 = "João";
        nome = nome1.concat(" Ramos");   // nome =+ " Ramos"
        String nome3 = new String("João");             //ela faz referencia ao objeto e n a string diretamente  // 1 variavel referencial 2 novo objeto 3 uma string das strings constanntes

        System.out.println(nome3 == nome1);  // compara a referencia, equals compara o valor
        System.out.println(nome3.intern() == nome1);          // com o intern acesso a string dentro do objeto

    }
}
