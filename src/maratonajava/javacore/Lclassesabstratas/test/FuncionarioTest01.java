package maratonajava.javacore.Lclassesabstratas.test;

import maratonajava.javacore.Lclassesabstratas.dominio.Funcionario;
import maratonajava.javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente1 = new Gerente('M',2500,"João");
        System.out.println(gerente1);
    }
}
