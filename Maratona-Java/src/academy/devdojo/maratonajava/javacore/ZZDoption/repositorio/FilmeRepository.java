package academy.devdojo.maratonajava.javacore.ZZDoption.repositorio;

import academy.devdojo.maratonajava.javacore.ZZDoption.dominio.Filme;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class FilmeRepository {
    private static List<Filme> filmes = List.of(
            new Filme(1, "Atirador", 10),
            new Filme(2, "Sherlock Holmes", 15),
            new Filme(3, "Montros S.A", 9)
    );

    public static List<Filme> getFilmes() {
        return filmes;
    }

    public static Optional<Filme> findBy(Predicate<Filme> predicate) {
        Filme found = null;

        for (Filme filme : filmes) {
            if (predicate.test(filme)) {
                found = filme;
            }
        }
        return Optional.ofNullable(found);
    }

    public static Optional<Filme> findByTitle (String title) {
        return findBy(filme -> filme.getTitle().equals(title));
    }

    public static Optional<Filme> findById (Integer id) {
        return findBy((filme -> filme.getId().equals(id)));
    }
}
