package maratonajava.javacore.ZZAinternclass.test;

public class OuterClassTest03 {
    String name = "João";
    static class Outer{
        String sobrenome = "Ramos";
        void print(){
            System.out.println(new OuterClassTest03().name+" "+sobrenome);
        }
    }
    //n se tem acesso a outra classe já está é static, é necessário instaciar um objeto da outra classe para poder utilizar ela
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.print();
    }
}
