package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Filme;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTeste01 {
    public static void main(String[] args) {
        List<Filme> filmes = new ArrayList<>();

        Filme filme1 = new Filme(2L, "Oppenheimer", 15.99, 2);
        Filme filme2 = new Filme(3L, "Carros", 12.99, 0);
        Filme filme3 = new Filme(1L, "Toy Story", 19.99, 8);
        Filme filme4 = new Filme(4L, "Mercenarios", 19.99, 0);
        Filme filme5 = new Filme(5L, "Hobbit", 29.99, 10);

        filmes.add(filme1);
        filmes.add(filme2);
        filmes.add(filme3);
        filmes.add(filme4);
        filmes.add(filme5);

        // 1 maneira de iterar sobre os itens e excluí-los
        Iterator<Filme> filmesIterator = filmes.iterator();
        while (filmesIterator.hasNext()) {
            Filme filme = filmesIterator.next();

            if (filme.getQuantidade() == 0) {
                filmesIterator.remove();
            }
        }
        System.out.println(filmes);

        // 2 maneira de iterar sobre itens e excluí-los (Mais utilizada)
        filmes.removeIf(filme -> filme.getQuantidade() == 0);
        System.out.println(filmes);
    }
}
