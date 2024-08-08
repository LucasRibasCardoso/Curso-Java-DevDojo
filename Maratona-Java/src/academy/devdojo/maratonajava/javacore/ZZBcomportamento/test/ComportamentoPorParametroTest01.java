package academy.devdojo.maratonajava.javacore.ZZBcomportamento.test;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {

    private static List<Car> cars = List.of(
            new Car("green", 2010),
            new Car("Black", 1990),
            new Car("Red", 2005)
    );

    public static void main(String[] args) {

        System.out.println(filterCarByCollor(cars, "green"));
        System.out.println(filterCarByCollor(cars, "Red"));

    }


    private static List<Car> filterCarByCollor(List<Car> cars, String color) {
        List<Car> greenCars = new ArrayList<>();

        for (Car car : cars) {
            if (car.getColor().equals(color)) {
                greenCars.add(car);
            }
        }
        return greenCars;


    }
}
