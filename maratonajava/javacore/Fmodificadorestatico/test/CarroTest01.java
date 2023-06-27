package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.test;

import academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {

        Carro car01 = new Carro("Ferrari",280);
        Carro car02 = new Carro("Mustang",290);
        Carro car03 = new Carro("Masseratti",295);

        Carro.setVelocidadeLimite(180);

        car01.imprime();
        car02.imprime();
        car03.imprime();
    }
}

