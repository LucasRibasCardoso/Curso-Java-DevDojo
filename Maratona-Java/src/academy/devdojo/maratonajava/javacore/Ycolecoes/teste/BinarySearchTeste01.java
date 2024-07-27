package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTeste01 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();

        numeros.add(2);
        numeros.add(1);
        numeros.add(4);
        numeros.add(6);
        numeros.add(9);
        numeros.add(7);
        // caso não encontre o elemento, retorna (- (ponto de inserção) -1)
        // index: 0, 1, 2, 3, 4, 5, 6
        // value: 1, 2, 4, 5, 6, 7, 9

        Collections.sort(numeros); // ordena a lista
        System.out.println(Collections.binarySearch(numeros, 10));

    }
}
