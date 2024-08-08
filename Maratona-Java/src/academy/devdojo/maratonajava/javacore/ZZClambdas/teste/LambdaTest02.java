package academy.devdojo.maratonajava.javacore.ZZClambdas.teste;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class LambdaTest02 {

    /*
     *A interface Function faz parte do pacote java.util.function e é uma interface funcional usada para definir uma
     * função que aceita um argumento e retorna um resultado. É uma das várias interfaces funcionais fornecidas no Java
     * para facilitar a programação funcional e o uso de expressões lambda.
     */

    public static void main(String[] args) {
        // Cria uma lista imutável de nomes
        List<String> names = List.of("Luis", "Lucas", "Gustavo", "Eduardo");

        // Usa o método map para transformar a lista de nomes em uma lista de inteiros (comprimentos dos nomes)
        List<Integer> integers = map(names, String::length);

        // Imprime a lista de inteiros resultante
        System.out.println(integers);
    }

    // Método genérico map que transforma uma lista de elementos de tipo T em uma lista de elementos de tipo R
    private static <T, R> List<R> map(List<T> list, Function<T, R> function) {
        // Cria uma nova lista para armazenar os resultados
        List<R> result = new ArrayList<>();

        // Itera sobre cada elemento da lista original
        for (T e : list) {
            // Aplica a função ao elemento atual para transformá-lo
            R r = function.apply(e);
            // Adiciona o resultado transformado à lista de resultados
            result.add(r);
        }

        // Retorna a lista de resultados
        return result;
    }
}


