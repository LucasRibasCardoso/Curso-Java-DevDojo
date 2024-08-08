package academy.devdojo.maratonajava.javacore.ZZBcomportamento.Interfaces;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.domain.Car;

// Para utilizar lambdas, a interface precisa ser funcional
@FunctionalInterface
public interface CarPredicate {
    boolean test(Car car);
}
