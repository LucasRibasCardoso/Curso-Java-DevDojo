package academy.devdojo.maratonajava.javacore.VinputOutput;

import javax.imageio.IIOException;
import java.io.*;

public class FileBufferedReaderTeste01 {
    public static void main(String[] args) {

        File file = new File("arquivo//teste02.txt");

        try (FileReader fileReader = new FileReader(file);
            BufferedReader fileBufferedReader = new BufferedReader(fileReader)) {
            String linha;

            while ((linha = fileBufferedReader.readLine()) != null) {
                System.out.println(linha);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
