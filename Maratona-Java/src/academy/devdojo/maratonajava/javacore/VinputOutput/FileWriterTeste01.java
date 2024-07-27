package academy.devdojo.maratonajava.javacore.VinputOutput;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTeste01 {
    public static void main(String[] args) throws IOException {

        // Cria um objeto File que representa o arquivo "teste02.txt" no diretório "arquivo"
        File file = new File("arquivo//teste02.txt");

        try (FileWriter fileWriter = new FileWriter(file, true)) {
            fileWriter.write("Hello, World!\nOlá Mundo!");
            fileWriter.flush();
        }
        catch (IOException e ) {
            e.printStackTrace();
        }
    }
}
