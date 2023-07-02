package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Endereco {
    private String rua;
    private String cep;

    Pessoa pessoa = new Pessoa();

    public String getRua() {
        return rua;
    }

    public void imprime2(){
        System.out.println(pessoa.nome);                     // consigo acessar as variaveis de pessoa ( variavel com protect )
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
