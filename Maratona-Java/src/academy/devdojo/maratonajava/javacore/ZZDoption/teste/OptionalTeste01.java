package academy.devdojo.maratonajava.javacore.ZZDoption.teste;

import java.util.List;
import java.util.Optional;

public class OptionalTeste01 {
    public static void main(String[] args) {

        /*
         * Optional é uma classe no Java utilizada para representar um valor que pode estar presente ou ausente.
         * É uma maneira de evitar NullPointerException ao lidar com valores que podem ser null. A ideia é encapsular
         * o valor em um contêiner, permitindo que métodos e operações possam ser executados de maneira segura.
         */

        // Criando um Optional com um valor presente
        Optional<String> option1 = Optional.of("Lucas Ribas Cardoso");
        // Criando um Optional que pode ou não ter um valor (neste caso é nulo)
        Optional<String> option2 = Optional.ofNullable(null);

        // Imprimindo os Optional
        System.out.println(option1);
        System.out.println(option2);

        System.out.println("--------------------------------------");

        // Buscando um nome e colocando-o dentro de um Optional
        Optional<String> nameOptional = Optional.ofNullable(findName("Lucas"));
        // Se o nome não for encontrado, será retornado "Nenhum"
        String nameCaseEmpty = nameOptional.orElse("Nenhum");

        // Imprimindo o nome encontrado ou a mensagem "Nenhum"
        //System.out.println("Nome encontrado: " + nameOptional);
        System.out.println("Nome encontrado: " + nameCaseEmpty);

        // Se o Optional contiver um valor, imprime esse valor
        nameOptional.ifPresent(s -> System.out.println(s));
    }

    // Método para encontrar um nome em uma lista
    private static String findName(String name) {
        List<String> list = List.of("Eduardo", "Joao", "Lucas");

        int i = list.indexOf(name);
        // Se o nome estiver na lista (índice maior que 0), retorna o nome
        if (i >= 0) { // Corrigido para incluir índice 0
            return list.get(i);
        }
        // Se o nome não estiver na lista, retorna null
        return null;
    }
}
