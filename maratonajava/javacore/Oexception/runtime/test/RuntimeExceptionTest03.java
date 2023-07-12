package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {                          // é possível fazer varios catch
        try {
        } catch (ArithmeticException | IndexOutOfBoundsException | IllegalArgumentException e) {
            e.printStackTrace();
        } catch (RuntimeException e) {                                 // o polimorfismo pode ser utilizado RuntimeExcpetion pode ser utilizado para todas as suas subclasses ( sempre o último )
            e.printStackTrace();
        }
        try {
            talvezAlgoAconteca();
        } catch (SQLException | IOException e) {                         // n pode colocar classe pai e classe filha
            throw new RuntimeException(e);
        }
    }
    private static void talvezAlgoAconteca() throws SQLException, IOException {

    }
}
