package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
      Carro carro01 = new Carro();
      Carro carro02 = new Carro();

      // atributos dos carros

        carro01.ano = 1900;
        carro01.nome = "Carro";
        carro01.modelo = "Onix";

        carro02.ano = 1850;
        carro02.nome = "Carrão";
        carro02.modelo = "Argo";

        // imprimir carros

        System.out.println(" O primeiro carro de modelo "+ carro01.modelo+ ", com o nome "+ carro01.nome+" e do ano "+carro01.ano);
        System.out.println("---------------------------------------------");
        System.out.println(" O primeiro carro de modelo "+ carro02.modelo+ ", com o nome "+ carro02.nome+" e do ano "+carro02.ano);


        // é possivel que a variavel de referencia que está associado a um objeto faça referencia há outro objetivo ex:
      carro01 = carro02;
    }
}
