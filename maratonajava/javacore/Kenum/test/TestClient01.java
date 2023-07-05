package academy.devdojo.maratonajava.javacore.Kenum.test;

import academy.devdojo.maratonajava.javacore.Kenum.dominio.Cliente;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoCliente;

public class TestClient01 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("João", TipoCliente.TIPO_PESSOAJURIDICA);
        System.out.println(cliente);
        cliente.setTipoCliente(TipoCliente.TIPO_PESSOAFISICA);
        System.out.println(cliente);
    }
}
