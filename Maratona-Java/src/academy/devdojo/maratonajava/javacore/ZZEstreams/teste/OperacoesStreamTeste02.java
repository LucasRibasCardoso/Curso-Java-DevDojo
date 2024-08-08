package academy.devdojo.maratonajava.javacore.ZZEstreams.teste;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Carro;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class OperacoesStreamTeste02 {

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

        Stream<Carro> stream = carros.stream();
        stream.forEach(carro -> System.out.println(carro.getNome()));

        long contadorCarrosComPrecosIguais = carros.stream()
                .filter(carro -> carro.getPreco() == 190000.00F)
                .count();
        System.out.println(contadorCarrosComPrecosIguais);
    }
}
