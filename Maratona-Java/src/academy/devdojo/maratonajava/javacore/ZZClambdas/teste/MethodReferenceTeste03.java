package academy.devdojo.maratonajava.javacore.ZZClambdas.teste;

import academy.devdojo.maratonajava.javacore.ZZClambdas.dominio.Filme;
import academy.devdojo.maratonajava.javacore.ZZClambdas.servicos.FilmeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class MethodReferenceTeste03 {
    public static void main(String[] args) {

        List<String> namesList = new ArrayList<>(List.of("Lucas", "Gustavo", "Eduardo", "Nadia"));

        namesList.sort(String::compareTo);
        System.out.println(namesList);

        Function<String, Integer> numStringToInteger = Integer::parseInt;
        System.out.println(numStringToInteger.apply("10"));


    }
}
