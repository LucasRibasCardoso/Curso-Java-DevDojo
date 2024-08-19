package academy.devdojo.maratonajava.javacore.ZZEstreams.teste;


import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Carro;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OperacoesStreamTeste05 {

    private static List<Carro> carros = new ArrayList<>(List.of(
            new Carro("Uno", 20000.00F),
            new Carro("S10", 190000.00F),
            new Carro("Saveiro", 82000.00F),
            new Carro("Strada", 71000.00F),
            new Carro("Corolla", 190000.00F),
            new Carro("Ranger", 210000.00F),
            new Carro("Porshe", 800000.00F)
    ));

    public static void main(String[] args) {

        // Verifica se algum elemento Carro tem o preço maior que 100_000
        System.out.println(carros.stream().anyMatch(carro -> carro.getPreco() > 100000));

        // Verifica se todos os elementos Carro tem o preço maior que 0
        System.out.println(carros.stream().allMatch(carro -> carro.getPreco() > 0));

        // Verifica se nenhum elemento Carro com o preço maior que 30_000_000
        System.out.println(carros.stream().noneMatch(carro -> carro.getPreco() < 30000000));


        carros.stream()
                .filter(carro -> carro.getPreco() > 100000)
                .sorted(Comparator.comparing(Carro::getPreco).reversed())
                .findFirst()
                .ifPresent(System.out::println);
    }
}
