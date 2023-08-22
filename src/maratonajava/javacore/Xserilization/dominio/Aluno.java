package academy.devdojo.src.maratonajava.javacore.Xserilization.dominio;

import java.io.*;

public class Aluno implements Serializable {
    private Long id;
    private String nome;
    private transient String password;
    private final static String NOME_ESCOLA = "Jacob Longoni";
    private Turma turma;

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public Aluno(Long id, String nome, String password) {
        System.out.println("aaaaa");
        this.id = id;                     // quando é uma serilization o construtor nunca é chamado
        this.nome = nome;
        this.password = password;

    }

    private void writeObject(ObjectOutputStream oss) {
        try {
            oss.defaultWriteObject();
            oss.writeUTF(turma.getNome());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void readObject(ObjectInputStream oss) {
        try {
            oss.defaultReadObject();
            String nometurma = oss.readUTF();
            turma = new Turma(nometurma);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", password='" + password + '\'' +
                ", escola='" + NOME_ESCOLA + '\'' +
                ", turma='" + turma + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
