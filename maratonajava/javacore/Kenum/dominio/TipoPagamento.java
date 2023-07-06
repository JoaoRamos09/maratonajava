package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public enum TipoPagamento {
    CREDITO{
        @Override
        public double calcularValor(double valor){
            return valor * 0.1;
        }
    }, DEBITO{

        public double calcularValor(double valor){
            return valor * 0.2;
        }
    };



    public abstract double calcularValor(double valor);

    public double valor;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        valor *= 0.2;
        this.valor = valor;
    }

}