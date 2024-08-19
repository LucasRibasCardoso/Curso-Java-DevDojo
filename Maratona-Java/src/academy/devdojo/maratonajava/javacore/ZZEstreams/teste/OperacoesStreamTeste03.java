package academy.devdojo.maratonajava.javacore.ZZEstreams.teste;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Carro;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;


public class OperacoesStreamTeste03 {

    public static void main(String[] args) {

        List<List<String>> faculdade = new ArrayList<>();

        List<String> desenvolvedores = List.of("Lucas", "Gustavo", "Joao");
        List<String> estudantes = List.of("Mateus", "Pedro", "Luis");
        List<String> professores = List.of("Jorge", "Pablo", "Icaro");

        faculdade.add(desenvolvedores);
        faculdade.add(estudantes);
        faculdade.add(professores);

        /*
            O flatMap é uma operação utilizada em streams no Java que permite mapear cada elemento de um Stream
            para outro Stream e, em seguida, "achatar" (ou "aplainar") os vários Streams em um único Stream.
            Isso é especialmente útil quando você tem uma coleção de coleções e deseja processar os elementos
            internos de forma unificada.
         */



        faculdade.stream().flatMap(Collection::stream).forEach(System.out::println);
    }
 }
