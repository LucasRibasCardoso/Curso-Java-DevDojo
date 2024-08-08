package academy.devdojo.maratonajava.javacore.ZZClambdas.teste;

import academy.devdojo.maratonajava.javacore.ZZClambdas.dominio.Filme;
import academy.devdojo.maratonajava.javacore.ZZClambdas.servicos.FilmeComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodReferenceTeste02 {
    public static void main(String[] args) {

        FilmeComparators filmeComparators = new FilmeComparators();

        List<Filme> filmesList = new ArrayList<>(List.of(
                new Filme("Berserk", 2),
                new Filme("Atirador", 7),
                new Filme("Dom", 25)
        )
        );

        filmesList.sort(filmeComparators::compareByEpisodeNoStatic);
        System.out.println(filmesList);
    }
}
