package academy.devdojo.maratonajava.javacore.VinputOutput;

import java.io.File;
import java.io.IOException;


public class FileTeste02 {
    public static void main(String[] args) throws IOException {

        File Diretorio = new File("Pasta");
        boolean isDiretorioCriado = Diretorio.mkdir();
        System.out.println(isDiretorioCriado);

        File fileArquivoDiretorio = new File(Diretorio, "Teste01.txt");
        boolean isFileCreated = fileArquivoDiretorio.createNewFile();
        System.out.println(isFileCreated);

        File fileRenamed = new File(Diretorio, "ArquivoRenomeado.txt");
        boolean isRenamed = fileRenamed.renameTo(fileRenamed);
        System.out.println(isRenamed);
    }
}
