package academy.devdojo.maratonajava.javacore.ZZEstreams.teste;


import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Carro;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OperacoesStreamTeste08 {

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

        // Primeiro Método
        carros.stream()
                .filter(carro -> carro.getPreco() > 100000)
                .map(Carro::getPreco)
                .reduce(Float::sum)
                .ifPresent(System.out::println);

        // Segundo método
        double sum = carros.stream()
                .mapToDouble(Carro::getPreco)
                .filter(preco -> preco > 100000)
                .sum();

        System.out.println(sum);
    }
}
