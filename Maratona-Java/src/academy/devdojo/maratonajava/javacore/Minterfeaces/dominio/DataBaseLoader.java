package academy.devdojo.maratonajava.javacore.Minterfeaces.dominio;

public class DataBaseLoader implements DataLoader, DataRemover {
    @Override
    public void Load() {
        System.out.println("Carregar dados do banco de dados...");
    }

    @Override
    public void remover() {
        System.out.println("Remover dados do banco de dados...");
    }
}
