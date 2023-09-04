package maratonajava.javacore.Npolimorfismo.servico;

import maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvo na Memoria");
    }
}
