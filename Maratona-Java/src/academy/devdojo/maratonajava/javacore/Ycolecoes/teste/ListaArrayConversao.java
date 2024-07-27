package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaArrayConversao {
    public static void main(String[] args) {

        // Converte Lista -> Array
        List<Integer> listaNumeros = new ArrayList<>();

        listaNumeros.add(1);
        listaNumeros.add(2);
        listaNumeros.add(3);

        Integer[] listToArray = listaNumeros.toArray(new Integer[0]);
        System.out.println("Array: " + Arrays.toString(listToArray));

        // Converte Array -> Lista
        Integer[] arrayNumeros = new Integer[3];

        arrayNumeros[0] = 1;
        arrayNumeros[1] = 2;
        arrayNumeros[2] = 3;

        List<Integer> arrayToList = new ArrayList<>(Arrays.asList(arrayNumeros));
        System.out.println("Lista: " + arrayToList);

    }

}
