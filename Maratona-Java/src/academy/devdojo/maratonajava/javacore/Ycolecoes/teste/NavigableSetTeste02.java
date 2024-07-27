package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;


import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Filme;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class FilmePrecoComparator implements Comparator<Filme> {
    @Override
    public int compare(Filme o1, Filme o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}


public class NavigableSetTeste02 {
    public static void main(String[] args) {

        NavigableSet<Filme> setFilmes = new TreeSet<>(new FilmePrecoComparator());
        setFilmes.add(new Filme(2L, "Oppenheimer", 8.99, 2));
        setFilmes.add(new Filme(3L, "Carros", 12.99, 0));
        setFilmes.add(new Filme(1L, "Toy Story", 19.99, 8));
        setFilmes.add(new Filme(4L, "Mercenarios", 10, 0));
        setFilmes.add(new Filme(5L, "Hobbit", 29.99, 10));

        // Imprime os filmes ordenados no TreeSet
        for (Filme setFilme : setFilmes) {
            System.out.println(setFilme);
        }

        // descendingSet() -> inverte a ordem dos elementos
        System.out.println("----------------------------------------------------------------");

        Filme formula1 = new Filme(12L, "Formula1", 10, 10);

         // lower <
        System.out.println(setFilmes.lower(formula1));

        // floor <=
        System.out.println(setFilmes.floor(formula1));

        // higher >
        System.out.println(setFilmes.higher(formula1));

        // ceiling >=
        System.out.println(setFilmes.ceiling(formula1));

        // retorna o tamanho
        System.out.println(setFilmes.size());

        // retorna o primeiro elemento
        System.out.println(setFilmes.pollFirst());

        // retorna o ultimo elemento
        System.out.println(setFilmes.pollLast());

    }
}
