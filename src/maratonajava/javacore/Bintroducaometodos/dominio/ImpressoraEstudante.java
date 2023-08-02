package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class ImpressoraEstudante {                                          //metodos
    public void imprimirestudante(Estudante estudante) {                  //estudante é uma variavel de referencia de um parametro

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

        estudante.nome = "Pedro";
    }
}
