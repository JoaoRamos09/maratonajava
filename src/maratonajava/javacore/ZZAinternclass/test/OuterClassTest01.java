package maratonajava.javacore.ZZAinternclass.test;

public class OuterClassTest01 {
    String name = "Jose";

    class Ineer{
        public void imprimename(){
            System.out.println(name);
            System.out.println(this);
            System.out.println(OuterClassTest01.this);
        }
    }

    public static void main(String[] args) {
        OuterClassTest01 outer = new OuterClassTest01();
        Ineer ineer = outer.new Ineer();
        Ineer inner2 = new OuterClassTest01().new Ineer();
        ineer.imprimename();
        inner2.imprimename();
    }
}
