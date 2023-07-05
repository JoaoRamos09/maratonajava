package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.test;

import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio.Carro;
import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio.Comprador;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Carro");                    // nao se pode passar um novo comprador para carro, pq ja é uma variavel final q ja possui um comprador
        Comprador comprador1 = new Comprador();
        System.out.println(carro1.COMPRADOR);
        carro1.COMPRADOR.setNome("Mustang");
        System.out.println(carro1.COMPRADOR);
        System.out.println(Carro.VELOCIDADE_LIMITE);
    }
}
