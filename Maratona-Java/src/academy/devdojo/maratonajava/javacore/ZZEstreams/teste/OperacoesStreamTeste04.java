package academy.devdojo.maratonajava.javacore.ZZEstreams.teste;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class OperacoesStreamTeste04 {

    public static void main(String[] args) {

        List<String> palavras = List.of("Lucas", "Carro", "Cidade", "Arroz");

        // Divide a primeira palavra da lista ("Lucas") em um array de caracteres (String[])
        String[] letras = palavras.get(0).split("");

        // Converte o array de caracteres em um Stream de Strings
        Stream<String> stream = Arrays.stream(letras);

        // Converte cada palavra da lista em um array de caracteres e depois transforma tudo em uma lista de caracteres
        List<String> todasLetras = palavras.stream()        // Cria um stream da lista de palavras
                .map(p -> p.split(""))         // Divide cada palavra em um array de caracteres
                .flatMap(Arrays::stream)             // "Achata" os arrays em um único stream de caracteres
                .collect(Collectors.toList());      // Coleta os caracteres em uma lista


        System.out.println(todasLetras);
    }
}
