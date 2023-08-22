package academy.devdojo.src.maratonajava.javacore.Xserilization.test;

import academy.devdojo.src.maratonajava.javacore.Xserilization.dominio.Aluno;
import academy.devdojo.src.maratonajava.javacore.Xserilization.dominio.Turma;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerilizationTest01 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(1L,"Joao", "jojoao");
        Turma turma = new Turma("301");
        aluno.setTurma(turma);
        serealizar(aluno);
        deserealizar();
    }
    public static void serealizar(Aluno aluno){
        Path path = Paths.get("pasta/aluno.ser");
        try(ObjectOutputStream oss = new ObjectOutputStream(Files.newOutputStream(path))){
            oss.writeObject(aluno);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void deserealizar(){
        Path path = Paths.get("pasta/aluno.ser");
        try(ObjectInputStream oss = new ObjectInputStream(Files.newInputStream(path))){
            Aluno aluno1 = (Aluno) oss.readObject();
            System.out.println(aluno1);
        }
        catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
