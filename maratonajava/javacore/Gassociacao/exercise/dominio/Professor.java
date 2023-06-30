package academy.devdojo.maratonajava.javacore.Gassociacao.exercise.dominio;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public void imprime(){
        System.out.println("### PROFESSOR ###");
        System.out.println("Professor: "+this.nome);
        System.out.println("Especialidade: "+this.especialidade);
        if(seminarios == null) return;
        System.out.println("### SEMINARIO ###");
        for (Seminario seminario : seminarios) {
            System.out.println(seminario.getTitulo());
            System.out.println(seminario.getLocal().getEndereco());
            System.out.println("### ALUNOS #####");
            for (Aluno aluno : seminario.getAlunos()) {
                System.out.println(aluno.getIdade());
                System.out.println(aluno.getNome());
            }

        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
