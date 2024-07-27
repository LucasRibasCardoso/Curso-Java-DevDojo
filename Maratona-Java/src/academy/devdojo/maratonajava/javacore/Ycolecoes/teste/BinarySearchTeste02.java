package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Filme;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTeste02 {
    public static void main(String[] args) {
        List<Filme> filmes = new ArrayList<>();

        Filme filme1 = new Filme(2L, "Oppenheimer", 15.99);
        Filme filme2 = new Filme(3L, "Carros", 12.99);
        Filme filme3 = new Filme(1L, "Toy Story", 19.99);
        Filme filme4 = new Filme(4L, "Mercenarios", 19.99);

        filmes.add(filme1);
        filmes.add(filme2);
        filmes.add(filme3);
        filmes.add(filme4);

        Collections.sort(filmes);

        Filme buscandoFilme = new Filme(1L, "Carros", 12.99);

        // retorna a posição de inserção ou o índice do elemento
        System.out.println(Collections.binarySearch(filmes, buscandoFilme));
    }
}
