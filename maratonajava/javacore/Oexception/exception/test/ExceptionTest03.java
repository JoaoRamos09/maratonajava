package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

public class ExceptionTest03 {
    public static void main(String[] args) {
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Lendo arquivo");
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("Fechado arquivo");           //se for um metodo com retorno o finally é executado mesmo assim
                                                             // a ideia do finally é forçar que algo aconteça idependete da exceçõa
        }
    }
}
