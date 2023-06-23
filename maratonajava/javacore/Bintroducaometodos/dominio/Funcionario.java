package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {

    private String nome;
    private int idade;
    private int[] salario;
    private int media;

    public void imprimeDados() {
        System.out.println(this.nome);
        System.out.println(this.idade);

        int ax = 0;
        if (salario == null) {
            return;
        }
        for (int n : salario) {
            ax++;
            System.out.println("Salario " + ax + ": " + n);
        }
        System.out.println("-------------------");
        mediaSalario();
    }

    public void mediaSalario(){
        if (salario==null){
            return;
        }
        for (int n: salario){
            media += n;
        }
        media = media/salario.length;
        System.out.println("A média é "+media);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int[] getSalario() {
        return salario;
    }

    public void setSalario(int[] salario) {
        this.salario = salario;
    }

    public int getMedia() {
        return media;
    }

}
