package academy.devdojo.maratonajava.javacore.Xserializacao.teste;

import academy.devdojo.maratonajava.javacore.Xserializacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Xserializacao.dominio.Turma;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializacaoTeste01 {
    /**
     * Serialização é o processo de converter um objeto em um formato que pode ser facilmente armazenado e
     * recuperado posteriormente, como um fluxo de bytes. Isso é útil para persistir o estado de um objeto em um
     * arquivo, transmiti-lo pela rede ou armazená-lo em uma base de dados. Em Java, a serialização é feita utilizando
     * uma interface Serializable, ObjectOutputStream e ObjectInputStream.
     */

    public static void main(String[] args) {
        Aluno aluno = new Aluno(1, "Lucas", "1384");
        Turma turma = new Turma("Análisa e desenvolvimento de Sistemas - IFSC");
        serializar(aluno);
        deserializar();
    }

    private static void serializar(Aluno aluno) {
        Path path = Paths.get("aluno.ser");
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))) {
            oos.writeObject(aluno);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void deserializar() {
        Path path = Paths.get("Aluno.ser");
        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))) {
            Aluno aluno = (Aluno) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}


