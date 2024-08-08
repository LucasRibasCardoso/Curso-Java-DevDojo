package academy.devdojo.maratonajava.javacore.ZZEstreams.teste;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.domain.Car;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Carro;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class StreamTeste01 {

    private static List<Carro> carros = new ArrayList<>(List.of(
            new Carro("Uno", 20000.00F),
            new Carro("S10", 190000.00F ),
            new Carro("Saveiro", 82000.00F ),
            new Carro("Strada", 71000.00F ),
            new Carro("Corolla", 190000.00F ),
            new Carro("Ranger", 210000.00F ),
            new Carro("Porshe", 800000.00F )
    ));


    // Ordenar por nome e retornar os 3 primeiros carros mais baratos que 100.000,00

    public static void main(String[] args) {

        List<String> carrosFiltrados = carros.stream()
                .sorted(Comparator.comparing(Carro::getNome)) // Ordena
                .filter(carro -> carro.getPreco() <= 100000) // Filtra
                .map(Carro::getNome) // pega o nome de cada carro filtrado
                .collect(Collectors.toList() // converte para String e salva em uma List
        );

        System.out.println(carrosFiltrados);

        /**
         * O que é um Stream em Java?
         * Stream é uma classe na API de Streams do Java que permite o processamento funcional de coleções de dados.
         * Ele oferece uma maneira de realizar operações agregadas sequenciais e paralelas em elementos de uma fonte,
         * como coleções (por exemplo, listas, conjuntos) e arrays.
         */
    }
}
