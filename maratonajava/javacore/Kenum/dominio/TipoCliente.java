package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public enum TipoCliente {
    TIPO_PESSOAFISICA(1, "Pessoa Fisica"),
    TIPO_PESSOAJURIDICA(2, "Pessoa Juridica");

    private final int valor;
    private final String nomeRelatorio;

    TipoCliente(int valor, String nomeRelatorio) {
        this.valor = valor;
        this.nomeRelatorio = nomeRelatorio;
    }

    public static TipoCliente tipoClientePorNomeRelatorio(String nomeRelatorio) {
        for (TipoCliente tipoCliente : values()) {
            if (tipoCliente.getNomeRelatorio().equals(nomeRelatorio));
            {
                return tipoCliente;
            }
        }
        return null;
    }

        public int getValor () {
            return valor;
        }

        public String getNomeRelatorio () {
            return nomeRelatorio;
        }
    }
