package academy.devdojo.maratonajava.javacore.Minterfeaces.dominio;

public interface DataLoader {
    void Load();

    default void checarPermissoesDeAcesso() {
        System.out.println("Checando permissões...");
    }
}
