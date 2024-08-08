package academy.devdojo.maratonajava.javacore.ZZClambdas.servicos;

import academy.devdojo.maratonajava.javacore.ZZClambdas.dominio.Filme;

public class FilmeComparators {

    public static int compareByTitle(Filme filme1, Filme filme2) {
        return filme1.getTitle().compareTo(filme2.getTitle());
    }

    public static int compareByEpisode(Filme filme1, Filme filme2) {
        return Integer.compare(filme1.getEpisodes(), filme2.getEpisodes());
    }

    public int compareByEpisodeNoStatic(Filme filme1, Filme filme2) {
        return Integer.compare(filme1.getEpisodes(), filme2.getEpisodes());
    }

}
