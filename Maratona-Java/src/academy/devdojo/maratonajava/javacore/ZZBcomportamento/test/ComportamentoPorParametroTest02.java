package academy.devdojo.maratonajava.javacore.ZZBcomportamento.test;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.domain.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest02 {

    // Atributo: lista estática e imutável de carros
    private static List<Car> cars = List.of(
            new Car("green", 2010),
            new Car("Black", 1990),
            new Car("Red", 2005)
    );

    // Classe Main
    public static void main(String[] args) {
        // Filtra os carros que são verdes através uma expressão lambda
        List<Car> greenCars = filterCars(cars, car -> car.getColor().equals("green"));

        // Filtra os carros cuja fabricação é anterior a 2010 através uma expressão lambda
        List<Car> yearBeforeCars = filterCars(cars, car -> car.getYear() < 2010);

        // Imprime a lista de carros verdes
        System.out.println(greenCars);
        System.out.println("----------------------------------------------");

        // Imprime a lista de carros fabricados antes de 2010
        System.out.println(yearBeforeCars);
    }

    // Método de filtragem de carros
    private static List<Car> filterCars(List<Car> cars, Predicate<Car> predicate) {
        List<Car> filteredCars = new ArrayList<>();

        // Itera sobre a lista de carros e aplica o predicado
        for (Car car : cars) {
            // Adiciona o carro à lista filtrada se ele satisfizer o predicado
            if (predicate.test(car)) {
                filteredCars.add(car);
            }
        }
        return filteredCars;
    }

    /**
     * Neste código, usamos Predicate<Car> para criar critérios de filtragem que são aplicados à lista de carros.
     * A interface funcional Predicate permite a passagem de expressões lambda, facilitando a aplicação de diferentes
     * critérios de filtragem sem modificar o método filterCars.
     */

}
