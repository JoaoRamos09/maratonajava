package maratonajava.javacore.ZZAinternclass.test;

public class OuterClassTest02 {
    String name = "Joao";

    void imprime(){
        String name = "Vitor";
        class Ineer{
            void imprimename(){
                System.out.println(name + OuterClassTest02.this.name);
            }
        }
        new Ineer().imprimename();
    }


    public static void main(String[] args) {
        OuterClassTest02 outerClassTest02 = new OuterClassTest02();
        outerClassTest02.imprime();
    }
}
