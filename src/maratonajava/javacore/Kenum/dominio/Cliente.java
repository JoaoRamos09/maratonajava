package academy.devdojo.src.maratonajava.javacore.Kenum.dominio;

public class Cliente {


    private String nome;
    private final TipoCliente tipoCliente;
    private final TipoPagamento tipoPagamento;

    public Cliente(String nome, TipoCliente tipoCliente,TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente.getNomeRelatorio() +
                ", tipoClienteInt=" + tipoCliente.getValor() +
                ", tipoPagamento=" + tipoPagamento +
                ", tipoPagamento=" + tipoPagamento.getValor() +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }
}
