package academy.devdojo.maratonajava.javacore.Gassociacao.exercise.dominio;

public class Seminario {
    private String titulo;

    private Aluno[] alunos;
    private Local local;

    public Seminario(String titulo, Aluno[] alunos,Local local) {
        this.titulo = titulo;
        this.alunos = alunos;
        this.local = local;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Seminario(String titulo, Local local){
        this.titulo = titulo;
        this.local = local;
    }

    public void imprime(){
        int c = 0;
        System.out.println("Seminario: "+this.titulo);
        System.out.println("Local: "+local.getEndereco());
        if(alunos == null) return;
        for (Aluno aluno : alunos) {
            c++;
            System.out.println("Aluno "+c+": "+aluno.getNome());
            System.out.println("Idade "+aluno.getIdade());
        }
        System.out.println("---------------------------------");


    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
