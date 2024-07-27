package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Filme;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTeste01 {
    public static void main(String[] args) {

        /*
        Este código demonstra o uso de uma PriorityQueue para armazenar e processar objetos de uma classe
        customizada (Filme) de acordo com a prioridade definida na implementação do método compareTo dessa classe.
         */

        // Cria uma fila de prioridade de objetos Filme.
        // A fila segue o padrão FIFO (First In, First Out) para elementos com a mesma prioridade.
        Queue<Filme> filmes = new PriorityQueue<>();

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

        // Enquanto a fila de filmes não estiver vazia
        while (!filmes.isEmpty()) {
            // Remove e retorna o primeiro filme na fila (de acordo com a prioridade definida pelo Comparable).
            // E imprime o filme removido.
            System.out.println(filmes.poll());
        }

    }
}
