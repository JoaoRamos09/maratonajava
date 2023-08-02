package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import academy.devdojo.maratonajava.javacore.Oexception.dominio.LoginInvalidionException;

import java.util.Scanner;

public class LoginInvalidationExceptionTest01 {
    public static void main(String[] args)  {
        try {
            logar();
        }catch(LoginInvalidionException e){
            e.printStackTrace();
        }
    }

    private static void logar() throws LoginInvalidionException {
        String usuario = "joaoramos";
        String senha = "pipicoco123";
        Scanner teclado = new Scanner(System.in);

        System.out.println("Usuario?");
        String userNameDigitado = teclado.nextLine();
        System.out.println("Senha?");
        String senhaDigitado = teclado.nextLine();
        if (!usuario.equals(userNameDigitado) || senha.equals(senhaDigitado)) {
            throw new LoginInvalidionException("Senha ou usario incorreto");
        }
        System.out.println("Usuario logado com sucesso");
    }
}
