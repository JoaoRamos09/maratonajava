package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest02 extends Pessoa {
    public void imprime(){
        this.nome = "Carlos";               // tenha acesso a variavel da classe pessoa, pq a variavel tem protectd

    }
}
