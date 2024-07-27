package academy.devdojo.maratonajava.javacore.Zgenerics.teste;

import java.util.ArrayList;
import java.util.List;

public class WildCardTeste02 {
    public static void main(String[] args) {
        // Cria listas imutáveis de Cachorros e Gatos
        List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatos = List.of(new Gato(), new Gato());

        // Cria uma lista mutável de Animais vazia
        List<Animal> animais = new ArrayList<>();

        // Chama o método que adiciona animais à lista e os consulta
        printConsultaAnimal(animais);
    }

    private static void printConsulta(List<? extends Animal> animais) {
        /*
        Este método usa o wildcard (? extends Animal), o que significa que aceita qualquer tipo que seja Animal ou
        uma subclasse de Animal. É utilizado para leitura de dados. O método pode chamar métodos do tipo Animal nos
        elementos da lista, mas não pode adicionar novos elementos à lista.
         */

        for (Animal animal : animais) {
            animal.consulta();
        }
    }

    private static void printConsultaAnimal(List<? super Animal> animais) {

        /*
        Este método usa o wildcard ? super Animal, o que significa que aceita qualquer tipo que seja Animal ou uma
        superclasse de Animal (incluindo Animal e Object). É utilizado para adicionar novos dados. O método pode
        adicionar novos elementos do tipo Animal ou superiores a eles, como a classe Object.
         */

        animais.add(new Cachorro());
        animais.add(new Gato());

        for (Object obj : animais) {
            if (obj instanceof Animal) {
                ((Animal) obj).consulta();
            }
        }
    }
}
