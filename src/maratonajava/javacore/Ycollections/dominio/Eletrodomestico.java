package maratonajava.javacore.Ycollections.dominio;

import java.util.concurrent.ThreadLocalRandom;

public class Eletrodomestico {
    private String nome;
    private Long id;

    public Eletrodomestico(String nome, Long id) {
        this.nome = nome;
        this.id = ThreadLocalRandom.current().nextLong(0,10000);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
