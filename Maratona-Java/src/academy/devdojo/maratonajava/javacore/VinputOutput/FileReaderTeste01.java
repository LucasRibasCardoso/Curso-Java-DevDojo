package academy.devdojo.maratonajava.javacore.VinputOutput;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTeste01 {
    public static void main(String[] args) throws IOException {
        // Cria um objeto File que representa o arquivo "teste02.txt" no diretório "arquivo"
        File file = new File("arquivo//teste02.txt");

        // Tenta abrir o arquivo e ler seu conteúdo usando FileReader
        try (FileReader fileReader = new FileReader(file)){
            int i;
            // Lê o arquivo caractere por caractere até o final do arquivo
            while ((i = fileReader.read()) != -1) {
                // Converte o código do caractere lido (int) para char e imprime no console
                System.out.print((char)i);
            }
        }
        // Captura qualquer exceção de E/S que possa ocorrer durante a leitura do arquivo
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}

