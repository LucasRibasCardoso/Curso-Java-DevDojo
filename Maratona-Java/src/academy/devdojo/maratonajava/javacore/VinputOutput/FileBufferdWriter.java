package academy.devdojo.maratonajava.javacore.VinputOutput;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class FileBufferedWriter {
    public static void main(String[] args) {
        // Cria um objeto File que representa o arquivo "teste03.txt" no diretório "arquivo"
        File file = new File("arquivo//teste03.txt");

        // Tenta abrir o arquivo para escrita e criar um BufferedWriter
        try (FileWriter fileWriter = new FileWriter(file, true);
             BufferedWriter fileBufferedWriter = new BufferedWriter(fileWriter)) {

            // Escreve "Hello, World" no arquivo
            fileBufferedWriter.write("Hello, World");
            fileBufferedWriter.newLine();
            // Garante que todos os dados sejam escritos no arquivo
            fileBufferedWriter.flush();
        }
        // Captura qualquer exceção de E/S que possa ocorrer durante a escrita no arquivo
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
