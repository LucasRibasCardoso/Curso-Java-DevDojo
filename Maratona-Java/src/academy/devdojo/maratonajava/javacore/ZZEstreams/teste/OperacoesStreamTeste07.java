package academy.devdojo.maratonajava.javacore.ZZEstreams.teste;


import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Carro;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class OperacoesStreamTeste07 {

    public static void main(String[] args) {
        
        List<Integer> inteiros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Usa o stream da lista de inteiros e realiza uma redução para somar todos os elementos
        // O método reduce acumula os valores, começando com 0 (identidade) e somando cada elemento da lista
        // Integer::sum é uma referência ao método que realiza a soma dos valores
        System.out.println(inteiros.stream().reduce(0, Integer::sum));

    }
}
