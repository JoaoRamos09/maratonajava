package maratonajava.javacore.Npolimorfismo.servico;

import maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioBancodeDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvo no Banco de Dados");
    }
}
