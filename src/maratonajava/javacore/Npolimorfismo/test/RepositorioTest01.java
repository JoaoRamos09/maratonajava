package maratonajava.javacore.Npolimorfismo.test;

import maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;
import maratonajava.javacore.Npolimorfismo.servico.RepositorioArquivo;
import maratonajava.javacore.Npolimorfismo.servico.RepositorioMemoria;

public class RepositorioTest01 {
    public static void main(String[] args) {

        Repositorio repositorio = new RepositorioMemoria();           // programação orienta a interface
        repositorio.salvar();

    }
}
