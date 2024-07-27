package academy.devdojo.maratonajava.javacore.Oexception.RuntimeException;

import java.io.File;
import java.io.IOException;

public class FileCreater {
    public static void main(String[] args) {
        criarArquivo();
    }

    public static void criarArquivo() {
        File arquivo = new File("arquivo//teste01.txt");

        try {
            boolean isCriado = arquivo.createNewFile();
            System.out.println("Arquivo criado: " +isCriado);

        } catch (IOException e) {

            // exibe a pilha de erros
            e.printStackTrace();
        }
    }
}
