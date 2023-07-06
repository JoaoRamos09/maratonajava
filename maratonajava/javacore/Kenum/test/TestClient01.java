package academy.devdojo.maratonajava.javacore.Kenum.test;

import academy.devdojo.maratonajava.javacore.Kenum.dominio.Cliente;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoCliente;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoPagamento;


public class TestClient01 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("João", TipoCliente.TIPO_PESSOAJURIDICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Pedro",TipoCliente.TIPO_PESSOAFISICA,TipoPagamento.CREDITO);
        System.out.println(cliente.getTipoPagamento().calcularValor(100));
        TipoCliente tipoCliente = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Fisica");
        System.out.println(tipoCliente);
        System.out.println(cliente);
        System.out.println(cliente2);
    }
}
