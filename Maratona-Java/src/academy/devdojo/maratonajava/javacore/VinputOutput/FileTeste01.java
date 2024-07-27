package academy.devdojo.maratonajava.javacore.VinputOutput;

import academy.devdojo.maratonajava.javacore.Minterfeaces.dominio.FileLoader;

import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class FileTeste01 {
    public static void main(String[] args) {

        // Cria um objeto File que representa o arquivo "teste01.txt" no diretório "arquivo"
        File file = new File("arquivo//teste01.txt");

        try {
            // Tenta criar um novo arquivo físico no sistema
            boolean isFileCreated = file.createNewFile();
            System.out.println("Arquivo criado: " + isFileCreated);

            // Exibe o caminho do arquivo
            System.out.println("Path: " + file.getPath());
            // Exibe o caminho absoluto do arquivo
            System.out.println("Path Absoluto: " + file.getAbsolutePath());
            // Verifica se o caminho especificado é um diretório
            System.out.println("É diretório: " + file.isDirectory());

            // Retorna a última modificação do arquivo em milissegundos desde 1 de janeiro de 1970
            long lastModifiedEpoch = file.lastModified();
            // Converte o tempo de última modificação em um objeto Instant
            Instant instantLastModified = Instant.ofEpochMilli(lastModifiedEpoch);
            // Converte o Instant para um objeto ZonedDateTime no fuso horário do sistema
            ZonedDateTime dateCompleteOfLastModified = instantLastModified.atZone(ZoneId.systemDefault());
            // Exibe a data e hora completas da última modificação
            System.out.println(dateCompleteOfLastModified);

            // Verifica se o arquivo existe
            boolean fileExists = file.exists();
            if (fileExists) {
                // Se o arquivo existir, tenta deletá-lo
                boolean isFileDeleted = file.delete();
                System.out.println("Arquivo deletado: " + isFileDeleted);
            }
        } catch (IOException e) {
            // Captura e imprime a pilha de exceção caso ocorra uma IOException
            e.printStackTrace();
        }
    }
}
