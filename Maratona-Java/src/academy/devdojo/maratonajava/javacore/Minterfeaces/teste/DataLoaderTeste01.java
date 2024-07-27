package academy.devdojo.maratonajava.javacore.Minterfeaces.teste;


import academy.devdojo.maratonajava.javacore.Minterfeaces.dominio.DataBaseLoader;
import academy.devdojo.maratonajava.javacore.Minterfeaces.dominio.FileLoader;

public class DataLoaderTeste01 {
    public static void main(String[] args) {

        DataBaseLoader carregarBD = new DataBaseLoader();
        FileLoader carregarArquivo = new FileLoader();

        carregarBD.Load();
        carregarArquivo.Load();
        carregarBD.remover();
        carregarBD.checarPermissoesDeAcesso();
        carregarArquivo.checarPermissoesDeAcesso();
    }
}
