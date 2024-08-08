package academy.devdojo.maratonajava.javacore.ZZClambdas.teste;

import academy.devdojo.maratonajava.javacore.ZZClambdas.dominio.Filme;
import academy.devdojo.maratonajava.javacore.ZZClambdas.servicos.FilmeComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodReferenceTeste01 {
    public static void main(String[] args) {

        List<Filme> filmesList = new ArrayList<>(List.of(
                new Filme("Berserk", 2),
                new Filme("Atirador", 7),
                new Filme("Dom", 25)
            )
        );

        Collections.sort(filmesList, FilmeComparators::compareByTitle);
        System.out.println(filmesList);

        Collections.sort(filmesList, FilmeComparators::compareByEpisode);
        System.out.println(filmesList);
    }
}
