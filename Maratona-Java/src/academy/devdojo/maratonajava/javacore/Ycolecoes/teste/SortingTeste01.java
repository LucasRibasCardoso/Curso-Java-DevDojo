package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Filme;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class ComparatorFilmeById implements Comparator<Filme> {
    @Override
    public int compare(Filme filme1, Filme filme2) {
        return filme1.getId().compareTo(filme2.getId());
    }
}


public class SortingTeste01 {
    public static void main(String[] args) {
        Filme filme1 = new Filme(2L, "Oppenheimer", 15.99);
        Filme filme2 = new Filme(3L, "Carros", 12.99);
        Filme filme3 = new Filme(1L, "Toy Story", 19.99);
        Filme filme4 = new Filme(4L, "Mercenarios", 19.99);

        List<Filme> filmes = new ArrayList<>();

        filmes.add(filme1);
        filmes.add(filme2);
        filmes.add(filme3);
        filmes.add(filme4);

        for (Filme filme : filmes) {
            System.out.println(filme);
        }

        System.out.println("-------------------------------------------");
        //Collections.sort(filmes, new FilmeIdComparator()); // a classe filme precisa ter o metodo compareTo()
        filmes.sort(new ComparatorFilmeById());

        for (Filme filme : filmes) {
            System.out.println(filme);
        }


    }
}
