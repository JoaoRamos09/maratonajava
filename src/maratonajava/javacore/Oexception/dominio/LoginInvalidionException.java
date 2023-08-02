package academy.devdojo.maratonajava.javacore.Oexception.dominio;

public class LoginInvalidionException extends Exception{
    public LoginInvalidionException() {
        System.out.println("Login Invalido");
    }

    public LoginInvalidionException(String message) {
        super(message);
    }
}
