package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Filme;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTeste01 {
    public static void main(String[] args) {

        // Set -> não permite elementos duplicados

        Set<Filme> setFilmes1 = new HashSet<>(); // Ordenado baseado pelo HashCode gerado
        setFilmes1.add(new Filme(2L, "Oppenheimer", 15.99, 2));
        setFilmes1.add(new Filme(3L, "Carros", 12.99, 0));
        setFilmes1.add(new Filme(1L, "Toy Story", 19.99, 8));
        setFilmes1.add(new Filme(4L, "Mercenarios", 19.99, 0));
        setFilmes1.add(new Filme(5L, "Hobbit", 29.99, 10));
        setFilmes1.add(new Filme(5L, "Hobbit", 29.99, 10));

        Set<Filme> setFilmes2 = new LinkedHashSet<>(); // Ordenado por ordem de inserção
        setFilmes2.add(new Filme(2L, "Oppenheimer", 15.99, 2));
        setFilmes2.add(new Filme(3L, "Carros", 12.99, 0));
        setFilmes2.add(new Filme(1L, "Toy Story", 19.99, 8));
        setFilmes2.add(new Filme(4L, "Mercenarios", 19.99, 0));
        setFilmes2.add(new Filme(5L, "Hobbit", 29.99, 10));
        setFilmes2.add(new Filme(5L, "Hobbit", 29.99, 10));

        for (Filme setFilme : setFilmes1) {
            System.out.println(setFilme);
        }
        System.out.println("----------------------------------------------------------------");
        for (Filme setFilme : setFilmes2) {
            System.out.println(setFilme);
        }



    }
}
